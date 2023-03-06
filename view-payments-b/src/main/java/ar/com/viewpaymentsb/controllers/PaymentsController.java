//package ar.com.viewpaymentsb.controllers;
//
//import java.text.ParseException;
//import java.util.Date;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import ar.com.viewpaymentsb.entities.Payments;
//import ar.com.viewpaymentsb.enums.DataDefault;
//import ar.com.viewpaymentsb.services.InvoicesService;
//import ar.com.viewpaymentsb.utils.MethodsUtils;
//import lombok.RequiredArgsConstructor;
//
//@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequestMapping("/invoices")
//public class PaymentsController {
//	@Autowired
//	private InvoicesService invoicesService;
//
//	@GetMapping(path = "/find")
//	public ResponseEntity<List<Payments>> find(String clientCuit,String fromDate,String toDate,Boolean onlyPendent) throws ParseException {
//		Date from = MethodsUtils.StringtoDate(fromDate, DataDefault.formatDateUSA.getCodeString());
//		Date to = MethodsUtils.StringtoDate(toDate, DataDefault.formatDateUSA.getCodeString());
//		return ResponseEntity.ok(invoicesService.getInvoices(clientCuit,from,to,onlyPendent)  );
//	}
//
//}
