//package ar.com.viewpaymentsb.services;
//
//import java.io.File;
//import java.io.IOException;
//import java.math.BigInteger;
//import java.net.URLDecoder;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Map;
//import java.util.Optional;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ar.com.viewpaymentsb.entities.DataCompany;
//import ar.com.viewpaymentsb.entities.Payments;
//import ar.com.viewpaymentsb.enums.ReportFile;
//import ar.com.viewpaymentsb.exceptions.CustomExceptionJasper;
//import lombok.RequiredArgsConstructor;
//import net.sf.jasperreports.engine.JREmptyDataSource;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.util.JRLoader;
//
//@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class ReportService {
//	@Autowired
//	private final PaymentsService paymentsService;
//	@Autowired
//	private final SystemService systemService;
//	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//	private String header = "";
//	private String pie = "";
//
//	private String getPath(String nameReport) throws Exception {
//		String path = this.getClass().getClassLoader().getResource("").getPath();
//		String fullPath = URLDecoder.decode(path, "UTF-8");
//		String pathArr[] = fullPath.split("/target/classes/");
//		fullPath = pathArr[0];
//		String reponsePath = new File(fullPath).getPath() + File.separatorChar + ReportFile.resource.getData()
//				+ File.separatorChar + ReportFile.folder.getData() + File.separatorChar
//				+ (nameReport == null ? "" : nameReport + ReportFile.extReport.getData());
//		return reponsePath;
//	}
//
//	public void setParametros(String nameReport, String reference, Map<String, Object> params, HttpSession ses)
//			throws ClassNotFoundException, Exception {
//		params.put("SUBREPORT_DIR", getPath(null));
//		generateHeader(params, ses);
//		if (nameReport.indexOf("invoice") >= 0) {
//			getInvoice(reference, params, ses);
//		} else if (nameReport.indexOf("") >= 0) {
//		}
//	}
//
//	public void exportReport(String nameReport, Map<String, Object> params, HttpServletResponse response,
//			HttpSession ses) throws IOException {
//		try {
//			String compiledReport = "";
//			try {
//				compiledReport = getPath(nameReport);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			JasperReport report = (JasperReport) JRLoader.loadObjectFromFile(compiledReport);
//			JasperPrint jasperPrint = JasperFillManager.fillReport(report, params, new JREmptyDataSource(1));
//			response.setStatus(200);
//			response.setContentType("application/pdf");
//			response.setHeader("Content-disposition",
//					"attachment; filename=" + nameReport + ReportFile.extFile.getData());
//			ServletOutputStream outputStream = response.getOutputStream();
//			JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
//		} catch (Exception e) {
////			response.sendRedirect("Error");
//			e.printStackTrace();
//		}
//	}
//
//	public void generateHeader(Map<String, Object> params, HttpSession ses) throws CustomExceptionJasper {
//		try {
//			Optional<DataCompany> response = Optional.of(systemService.getCompany());
//			if (response.isPresent()) {
//				DataCompany company = response.get();
//				params.put("NAME", company.getName() == null ? "" : company.getName());
//				params.put("CUIT", company.getCuit() == null ? "" : company.getCuit());
//				params.put("IIBB", company.getIibb() == null ? "" : company.getIibb());
//				params.put("DIRECTION", company.getDirection() == null ? "" : company.getDirection());
//				params.put("TELEPHONE", company.getTelephone() == null ? "" : company.getTelephone());
//				params.put("STARTOFACTIVITY",
//						company.getStartOfActivityPatternESP() == null ? "" : company.getStartOfActivityPatternESP());
//				header = company.getName() + " | " + df.format(new Date()).toString();
//			}
////			pie = COD_PERSONA + " | " + (titular.getNOM_COMPLETO() == null ? "" : titular.getNOM_COMPLETO());
//			params.put("HEADER", header);
//			params.put("PIE", pie);
//		} catch (Exception e) {
//			throw new CustomExceptionJasper("Error en encabezado", e);
//		}
//	}
//
//	public void getInvoice(String reference, Map<String, Object> params, HttpSession ses) {
//		BigInteger code = BigInteger.valueOf(Integer.valueOf(reference));
//
//		Optional<Payments> response = paymentsService.getInvoce(code, Boolean.TRUE);
//		if (response.isPresent()) {
////			Orders order = response.get();
////			params.put("O_NUMBER", order.getNumber() == null ? "" : order.getNumber().toString());
////			params.put("O_DATE", order.getDate() == null ? "" : order.getDatePatternESP());
////			params.put("O_NAME", order.getName() == null ? "" : order.getName());
////			params.put("O_DIRECTION", order.getDirection() == null ? "" : order.getDirection());
////			params.put("O_LOCATION", order.getLocation() == null ? "" : order.getLocation());
////			params.put("O_PROVINCE", order.getProvince() == null ? "" : order.getProvince());
////			params.put("O_COUNTRY", order.getCountry() == null ? "" : order.getCountry());
////			params.put("O_POSTALCODE", order.getPostalCode() == null ? "" : order.getPostalCode());
////			params.put("O_COSTOFVISIT", order.getCostOfVisit() == null ? "" : order.getCostOfVisit().toString());
////			params.put("O_COSTPERMETER", order.getCostPerMeter() == null ? "" : order.getCostPerMeter().toString());
////			params.put("O_STATUS", order.getStatus() == null ? "" : order.getStatusDescription());
////			params.put("O_PAYMENTDATE", order.getPaymentDate() == null ? "" : order.getPaymentDatePatternESP());
////			params.put("O_PROBLEMS", order.getProblemsAndSymptoms() == null ? "" : order.getProblemsAndSymptoms());
////			params.put("O_OBSERVATIONS", order.getObservations() == null ? "" : order.getObservations());
//		}
//	}
//
//}
