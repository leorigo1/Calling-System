package calling.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calling.entities.UserEntity;
import calling.services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create-user")
    public UserEntity criar(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }
    
    @GetMapping("/list-all")
    public List<UserEntity> listarTodosUsuarios () {
    	return userService.listarTodosUsuarios();
    }
    
    @GetMapping("/email-existe")
    public ResponseEntity<Boolean> verificarEmail(@RequestParam String email) {
        return ResponseEntity.ok(userService.emailExiste(email));
    }

    
}
