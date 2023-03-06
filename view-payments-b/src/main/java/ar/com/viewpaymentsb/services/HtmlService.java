//package ar.com.viewpaymentsb.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class HtmlService {
//	@Autowired
//	private final SystemService systemService;
//
//	public String messageRequestPassword(String name, String cuit,String clientMail,String authorization) {
//		return "<h4>Estimado/a,</h4>" 
//				+ "<br>" 
//				+ "El cliente " + name + ", a solicitado acceso para visualizar sus facturas.<br>" 
//				+ "<br>"
//				+ "<a href='" + systemService.getContext()
//				+ "/clients/password-auth?cuit=" + cuit + "&clientMail=" + clientMail 
//				+ "'>Autorizar acceso y enviar mail</a><br>" 
//				+ "<br>" 
//				+ "Atentamente,<br>"
//				+ "El equipo de Sistemas.";
//	}
//	
//	public String messageReponsePassword(String cuit,String password) {
//		return "<h4>Estimado/a,</h4>"  
//				+ "<br>"  
//				+ "Su usuario de acceso es : " + cuit + "<br>"
//				+ "Su password de acceso es : " + password + "<br>" 
//				+ "<br>" 
//				+ "Atentamente,<br>"  
//				+ "El equipo de Sistemas.";
//	}
//	
//	public String buttonResponse(String message,String toMail,String color) {
//		return "<button onClick={window.close()} style='margin-top: 345px; position: absolute; right: 700px; background-color: " + color + "; padding: 10px 20px 10px 20px; color: white; border: darkcyan; border-radius: 27px; '> " + message + toMail + " </button>";
//	}
//	
//
//}
