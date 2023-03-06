//package ar.com.viewpaymentsb.services;
//
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import ar.com.viewpaymentsb.entities.Payments;
//import ar.com.viewpaymentsb.entities.PaymentsDetails;
//import ar.com.viewpaymentsb.enums.DataDefault;
//import ar.com.viewpaymentsb.repositories.IInvoicesDetailsRepository;
//import ar.com.viewpaymentsb.utils.MethodsUtils;
//import lombok.RequiredArgsConstructor;
//
//@Service
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
//public class PaymentsService {
//	@Autowired
//	private final IPaymentsRepository iPaymentsRepository;
//	@Autowired
//	private final IPaymentsDetailsRepository iPaymentsDetailsRepository;
//
//	public Optional<Payments> getInvoce(BigInteger code) {
//		return iPaymentsRepository.getInvoice(code);
//	}
//
//	public List<PaymentsDetails> getInvoiceDetail(BigInteger code) {
//		return iPaymentsDetailsRepository.getInvoiceDetail(code);
//	}
//
//	public Optional<Payments> getInvoce(BigInteger code, Boolean complete) {
//		return Optional.of(mapperOrder(iPaymentsRepository.getInvoice(code).get(), complete));
//	}
//
//	public List<Payments> getInvoices(String clientCuit, Date from, Date to, Boolean onlyPendent) {
//		List<Payments> listInvoices = iPaymentsRepository.getInvoices(clientCuit, from, to);
//		List<Payments> response = listInvoices.stream().map(invoice -> {
//			return mapperOrder(invoice, false);
//		}).collect(Collectors.toList());
//		if (onlyPendent && !response.isEmpty()) {
//			List<Payments> result = new ArrayList<Payments>();
//			for (Payments invoice : listInvoices) {
//				if (!invoice.getInvoicePaid()) {
//					result.add(invoice);
//				}
//			}
//			return result;
//		}
//		return response.isEmpty() ? null : response;
//	}
//
//	public Payments mapperOrder(Payments invoice, Boolean complete) {
//		if (invoice.getInvoiceBalance().compareTo(BigDecimal.valueOf(0)) == 0) {
//			invoice.setInvoicePaid(Boolean.TRUE);
//		} else {
//			invoice.setInvoicePaid(Boolean.FALSE);
//		}
//		invoice.setInvoicePaidPattern(invoice.getInvoicePaid() ? "Si" : "No");
//		invoice.setInvoiceDatePatternESP(
//				MethodsUtils.dateformat(invoice.getInvoiceDate(), DataDefault.formatDateESP.getCodeString()));
//		invoice.setInvoiceDatePatternUSA(
//				MethodsUtils.dateformat(invoice.getInvoiceDate(), DataDefault.formatDateUSA.getCodeString()));
//		invoice.setInvoiceExpirationPatternESP(
//				MethodsUtils.dateformat(invoice.getInvoiceExpiration(), DataDefault.formatDateESP.getCodeString()));
//		invoice.setInvoiceExpirationPatternUSA(
//				MethodsUtils.dateformat(invoice.getInvoiceExpiration(), DataDefault.formatDateUSA.getCodeString()));
//		invoice.setDetail(complete ? getInvoiceDetail(invoice.getCode()) : null);
//		return invoice;
//	}
//
//}
