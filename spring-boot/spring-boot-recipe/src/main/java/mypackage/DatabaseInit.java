package mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mypackage.repositories.UserRepository;

import mypackage.models.User;

@Component
public class DatabaseInit implements CommandLineRunner {

    UserRepository userRepository;

    @Autowired
    public DatabaseInit(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("sanilkhurana7@gmail.com", "Sanil Khurana", "raymon11", "sanilk"));
    }

}