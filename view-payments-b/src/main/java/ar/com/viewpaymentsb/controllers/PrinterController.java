//package ar.com.viewpaymentsb.controllers;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import ar.com.viewpaymentsb.services.ReportService;
//import lombok.RequiredArgsConstructor;
//import net.sf.jasperreports.engine.JRException;
//
//
//@Controller
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//@RequestMapping("/printer")
//public class PrinterController {
//	@Autowired
//	private final ReportService reportService;
//
//	@GetMapping("/invoices")
//	public void getInvoice(String nameReport,String reference, HttpServletResponse response, HttpSession ses)
//			throws JRException, IOException {
//		try {
//			if (!nameReport.equals("") && !reference.equals("") ) {
//				Map<String, Object> params = new HashMap<String, Object>();
//				reportService.setParametros(nameReport,reference, params, ses);
//				reportService.exportReport(nameReport, params, response, ses);
//			} else {
//				response.sendRedirect("Error");
//			}
//		} catch (Exception e) {
//			response.sendRedirect("Error");
//		}
//
//	}
//}