package calling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import calling.DTOS.LoginRequestDTO;
import calling.DTOS.PasswordRecoverRequestDTO;
import calling.services.MailService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	private MailService mailService;
	
	@PostMapping("/login")
	public ResponseEntity<LoginRequestDTO> login (@RequestBody LoginRequestDTO loginRequestDTO) {
		return ResponseEntity.ok(loginRequestDTO);
	}
	
	@PostMapping("/password-recover")
	public ResponseEntity<Void> enviarEmailparaRecuperarSenha (@RequestBody PasswordRecoverRequestDTO passwordRecoverRequestDTO ) {

		this.mailService.enviarEmailHtml(
				passwordRecoverRequestDTO.getAssunto(),
				passwordRecoverRequestDTO.getDestino(),
				passwordRecoverRequestDTO.getTexto()
		);
		return ResponseEntity.ok().build();
	}
}
