package calling.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.entities.UserEntity;
import calling.services.UserService;

@RestController
@RequestMapping("/create-user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserEntity criar(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }
}
