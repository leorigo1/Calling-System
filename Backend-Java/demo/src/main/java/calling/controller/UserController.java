package calling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;
	
	
    @GetMapping
    public String test() {
        return "User endpoint funcionando";
    }
    
}
