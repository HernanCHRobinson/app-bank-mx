//package ar.com.viewpaymentsb.controllers;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import ar.com.viewpaymentsb.entities.DataCompany;
//import ar.com.viewpaymentsb.services.SystemService;
//import lombok.RequiredArgsConstructor;
//
//@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequestMapping("/company")
//public class DataCompanyController {
//	@Autowired
//	private SystemService systemService;
//
//	@GetMapping(value = "/data")
//	public ResponseEntity<DataCompany> getData() {
//		return ResponseEntity.ok(systemService.getCompany());
//	}
//
//	@GetMapping(value = "/systemVersion")
//	public ResponseEntity<String> getVersion() {
//		return ResponseEntity.ok(systemService.backendVersion());
//	}
//}
