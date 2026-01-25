package calling.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void enviarEmailHtml(String assunto, String destino, String link) {

        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper =
                    new MimeMessageHelper(message, true, "UTF-8");

            helper.setTo(destino);
            helper.setSubject(assunto);
            helper.setFrom("leonardoluisorlandorigo@gmail.com");

            String html = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="UTF-8">
                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            background-color: #f4f6f8;
                            padding: 20px;
                        }
                        .container {
                            background-color: #ffffff;
                            max-width: 600px;
                            margin: auto;
                            padding: 30px;
                            border-radius: 8px;
                        }
                        h2 {
                            color: #333333;
                        }
                        p {
                            color: #555555;
                        }
                        .button {
                            display: inline-block;
                            padding: 12px 24px;
                            margin-top: 20px;
                            background-color: #4f46e5;
                            color: #ffffff;
                            text-decoration: none;
                            border-radius: 6px;
                            font-weight: bold;
                        }
                        .footer {
                            margin-top: 30px;
                            font-size: 12px;
                            color: #999999;
                        }
                    </style>
                </head>
                <body>
                    <div class="container">
                        <h2>Recuperação de senha</h2>
                        <p>Você solicitou a redefinição de senha.</p>
                        <p>Clique no botão abaixo para criar uma nova senha:</p>

                        <a href="%s" class="button">Redefinir senha</a>

                        <p>Se você não solicitou isso, ignore este email.</p>

                        <div class="footer">
                            <p>Este link expira em 15 minutos.</p>
                        </div>
                    </div>
                </body>
                </html>
            """.formatted(link);

            helper.setText(html, true);

            javaMailSender.send(message);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar email", e);
        }
    }
	
}
