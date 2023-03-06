//package ar.com.viewpaymentsb.services;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.InputStreamSource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class EmailService {
//	@Autowired
//	private JavaMailSender mailSender;
//	@Value("${spring.mail.username}")
//	private String userMail;
//	@Value("${spring.mail.password}")
//	private String userPassword;
//	@Autowired
//	private HtmlService htmlService;
//	
//	public String send(String to, String subject, String content, Boolean returnHtml) {
//		try {
//			MimeMessage message = mailSender.createMimeMessage();
//			MimeMessageHelper helper = new MimeMessageHelper(message, true);
//			helper.setTo(to);
//			helper.setSubject(subject);
//			helper.setText(content, true);
//			//helper.addAttachment(attachName, inputStream);
//			mailSender.send(message);
//			if(returnHtml) {
//				return htmlService.buttonResponse("Correo enviado a ", to ,"lightslategray");
//			} else {
//				return "Correo enviado a " + to;
//			}
//		} catch (Exception e) {
//			if(returnHtml) {
//				return htmlService.buttonResponse("Correo no enviado a ", to ,"red");
//			} else {
//				return "Error enviando correo. " + e.getMessage();
//			}			
//			
//		}
//	}
//
//	public String sendSimple(String to, String subject, String content, Boolean returnHtml) {
//		try {
//			SimpleMailMessage email = new SimpleMailMessage();
//			email.setTo(to);
//			email.setSubject(subject);
//			email.setText(content);
//			mailSender.send(email);
//			if(returnHtml) {
//				return htmlService.buttonResponse("Correo enviado a ", to ,"lightslategray");
//			} else {
//				return "Correo enviado a " + to;
//			}
//		} catch (Exception e) {
//			if(returnHtml) {
//				return htmlService.buttonResponse("Correo no enviado a ", to ,"red");
//			} else {
//				return "Error enviando correo. " + e.getMessage();
//			}			
//			
//		}
//	}
//	
//	public String sendWithAttach(String to, String subject, String text, String attachName,
//			InputStreamSource inputStream) throws MessagingException {
//		try {
//			MimeMessage message = mailSender.createMimeMessage();
//			MimeMessageHelper helper = new MimeMessageHelper(message, true);
//			helper.setTo(to);
//			helper.setSubject(subject);
//			helper.setText(text, true);
//			helper.addAttachment(attachName, inputStream);
//			mailSender.send(message);
//			return "Correo enviado.";
//		} catch (Exception e) {
//			return "Error enviando correo. " + e.getMessage();
//		}
//	}
//
//}