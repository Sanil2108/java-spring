package mypackage.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import mypackage.models.User;
import mypackage.services.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/user/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value="/createForm/")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());

        return "create-user";
    }

    @PostMapping(value="/create/")
    public String createUser(@ModelAttribute User user) {
        if (userService.createUser(user)) {
            return "user-created";
        }
        else {
            return "user-not-created";
        }
    }

    @GetMapping(value="/userLoginForm/")
    public String createUserLoginForm(Model model) {
        model.addAttribute("user", new User());

        return "user-login-form";
    }

    @PostMapping(value="/userLogin")
    public String loginUser(@ModelAttribute User user) {
        if (userService.loginUser(user)) {
            return "login-ok";
        }
        else {
            return "login-failed";
        }
    }

    @GetMapping(value="/{userUrl}")
    public String displayUser(@PathVariable("userUrl") String userUrl, Model user) {
        User u = userService.getUser(userUrl);
        return "show-user";
    }

    

}