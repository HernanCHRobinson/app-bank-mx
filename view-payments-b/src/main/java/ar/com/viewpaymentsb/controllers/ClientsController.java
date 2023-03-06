//package ar.com.viewpaymentsb.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import ar.com.viewpaymentsb.models.ClientsModel;
//import ar.com.viewpaymentsb.services.ClientsService;
//import lombok.RequiredArgsConstructor;
//
//@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequestMapping("/clients")
//public class ClientsController {
//	@Autowired
//	private final ClientsService clientsService;
//
//	@GetMapping(value = "/find")
//	public ResponseEntity<ClientsModel> find(@RequestParam("cuit") String cuit,
//			@RequestParam("password") String password) {
//		ClientsModel client = clientsService.validate(cuit, password);
//		return ResponseEntity.ok(client);
//	}
//
//	@GetMapping(value = "/validate")
//	public ResponseEntity<ClientsModel> validate(@RequestParam("cuit") String cuit) {
//		ClientsModel client = clientsService.byCuit(cuit);
//		return ResponseEntity.ok(client);
//	}
//
//	@GetMapping(value = "password-request")
//	public ResponseEntity<String> passwordRequest(@RequestParam("cuit") String cuit,
//			@RequestParam("clientMail") String clientMail, @RequestParam("toMail") String toMail,@RequestHeader(value = "authorization", required = false) String authorization) {
//		return ResponseEntity.ok(clientsService.passwordRequest(cuit, clientMail, toMail,authorization));
//	}
//
//	@GetMapping(value = "password-auth")
//	public ResponseEntity<String> passwordAuth(@RequestParam("cuit") String cuit,
//			@RequestParam("clientMail") String clientMail) {
//		String toMail = clientMail;
//		return ResponseEntity.ok(clientsService.passwordAuth(cuit, clientMail, toMail));
//	}
//
//	@GetMapping(value = "testPassword")
//	public ResponseEntity<String> testPassword() {
//		return ResponseEntity.ok(clientsService.newPassword());
//	}
//
//}
