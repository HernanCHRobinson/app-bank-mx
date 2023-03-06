//package ar.com.viewpaymentsb.services;
//
//import java.math.BigInteger;
//import java.security.SecureRandom;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ar.com.viewpaymentsb.entities.Clients;
//import ar.com.viewpaymentsb.enums.DataDefault;
//import ar.com.viewpaymentsb.enums.Errors;
//import ar.com.viewpaymentsb.models.ClientsModel;
//import ar.com.viewpaymentsb.repositories.IClientsRepository;
//import ar.com.viewpaymentsb.utils.MethodsUtils;
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class ClientsService {
//	@Autowired
//	private final IClientsRepository iClientsRepository;
//	@Autowired
//	private final EmailService emailService;
//	@Autowired
//	private final HtmlService htmlService;
//
//	public Optional<Clients> byId(BigInteger idClient) {
//		return iClientsRepository.findById(idClient);
//	}
//
//	public ClientsModel byCuit(String cuit) {
//		return validate(cuit, "");
//	}
//
//	public Optional<Clients> getClient(String cuit) {
//		return iClientsRepository.byCuit(cuit);
//	}
//
//	public String passwordRequest(String cuit, String clientMail, String toMail,String authorization) {
//		if(!MethodsUtils.validateMail(toMail)) {return "Mail invalido";}
//		Optional<Clients> client =getClient(cuit);
//		if (!client.isPresent()) {return "Cliente invalido";}
//		return emailService.send(toMail, "Solicitud password cliente Cuit : " + cuit,
//				htmlService.messageRequestPassword(client.get().getName(),cuit,clientMail,authorization),Boolean.FALSE);
//	}
//
//	public String passwordAuth(String cuit, String clientMail, String toMail) {
//		if(!MethodsUtils.validateMail(toMail)) {
//			return "<button onClick={window.close()} style='margin-top: 345px; position: absolute; right: 800px; background-color: red; padding: 10px 20px 10px 20px; color: white; border: darkcyan; border-radius: 27px; '> Correo invalido. </button>";
//		}
//		String password = generatePassword(cuit);
//		return password.equals("") ? "Error generando autorizacion."
//				: emailService.send(toMail, "Autorizacion password cliente Cuit : " + cuit,
//						htmlService.messageReponsePassword(cuit, password),Boolean.TRUE);
//	}
//
//	private String generatePassword(String cuit) {
//		Optional<Clients> client = getClient(cuit);
//		String response = "";
//		if (client.isPresent()) {
//			response = newPassword();
//			client.get().setPassword(response);
//			save(client.get());
//		}
//		return response;
//	}
//
//	public String newPassword() {
//		Integer length=DataDefault.lengthPassword.getCodeNumeric().intValue();
//		String chars = DataDefault.passwordCharacter.getCodeString();
//		SecureRandom random = new SecureRandom();
//		StringBuilder response = new StringBuilder();
//		for (int i = 0; i < length; i++) {
//			Integer randomIndex = random.nextInt(chars.length());
//			response.append(chars.charAt(randomIndex));
//		}
//		return response.toString();
//	}
//
//	public ClientsModel validate(String cuit, String password) {
//		BigInteger countClients = iClientsRepository.countClients(cuit);
//		if (countClients.compareTo(BigInteger.ZERO) == 0) {
//			return ClientsModel.builder().code(BigInteger.ZERO).name("").cuit("").password("")
//					.message(Errors.client_does_not_exist.getDescription()).auth(Boolean.FALSE).build();
//		} else if (countClients.compareTo(BigInteger.valueOf(1)) >= 1) {
//			return ClientsModel.builder().code(BigInteger.ZERO).name("").cuit("").password("")
//					.message(Errors.more_than_one.getDescription()).auth(Boolean.FALSE).build();
//		}
//		ClientsModel response = mapperClient(iClientsRepository.byCuit(cuit), password);
//		return response;
//	}
//
//	public ClientsModel mapperClient(Optional<Clients> client, String password) {
//		ClientsModel response = ClientsModel.builder().code(client.get().getCode()).name(client.get().getName())
//				.password("").cuit(client.get().getCuit()).message("").auth(Boolean.FALSE).build();
//		response.setMessage(password.equals("")
//				? (client.get().getPassword().compareTo(password) == 0 ? "" : Errors.password_exists.getDescription())
//				: "");
//		response.setMessage(response.getMessage().equals("")
//				? client.get().getPassword().equals("") ? Errors.password_not_assigned.getDescription() : ""
//				: response.getMessage());
//		response.setMessage(response.getMessage().equals("")
//				? !client.get().getPassword().equals(password) ? Errors.wrong_password.getDescription() : ""
//				: response.getMessage());
//		response.setAuth(response.getMessage().equals("") ? Boolean.TRUE : Boolean.FALSE);
//		response.setPassword(response.getMessage().equals("") ? client.get().getPassword() : "");
//		return response;
//	}
//
//	private Clients save(Clients client) {
//		return iClientsRepository.save(client);
//	}
//
//}
