package calling.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void enviarEmail (String assunto, String destino, String texto) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("leonardoluisorlandorigo@gmail.com");
		message.setSubject("esse é o titulo caraio");
		message.setText("voce é um delicia cara");
		javaMailSender.send(message);
	}
	
}
