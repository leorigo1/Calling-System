package calling.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.DTOS.LoginRequestDTO;
import calling.services.MailService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	private MailService mailService;

	@PostMapping("/login")
	public ResponseEntity<LoginRequestDTO> login (@RequestBody LoginRequestDTO loginRequestDTO) {
		return ResponseEntity.ok(loginRequestDTO);
	}
	
	@PostMapping("/password-recover")
	public void enviarEmailparaRecuperarSenha (@RequestBody String assunto, String destino, String texto) {
		 mailService.enviarEmail(assunto, destino, texto);
	}
	
	
}
