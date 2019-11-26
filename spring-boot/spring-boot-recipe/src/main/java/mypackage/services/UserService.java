package mypackage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.models.User;
import mypackage.repositories.UserRepository;

import java.util.*;

@Service
public class UserService {
    
    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean userUrlExists(String url) {
        Iterator users = userRepository.findAll().iterator();
        while (users.hasNext()) {
            User user = (User) users.next();
            if (user.getUrl().equals(url)) {
                return true;
            }
        }
        return false;
    }

    public boolean userExists(String email) {
        return getUser(email) != null;
    }

    public boolean createUser(User user) {
        if (userExists(user.getEmail())) {
            return false;
        }
        if (userUrlExists(user.getUrl())) {
            return false;
        }
        try {
            userRepository.save(user);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginUser(User user) {
        User actual = getUser(user.getEmail());
        if (actual == null) {
            return false;
        }
        return actual.getPassword().equals(user.getPassword());
    }

    public User getUserByURL(String url) {
        Iterator iter = userRepository.findAll().iterator();
        while (iter.hasNext()) {
            User current = (User) iter.next();
            if (current.getUrl().equals(url)) {
                return current;
            }
        }
        return null;
    }

    public User getUser(String email) {
        return userRepository.findById(email).get();
    }

}