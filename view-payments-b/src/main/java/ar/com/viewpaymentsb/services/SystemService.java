package ar.com.viewpaymentsb.services;

import java.time.LocalDate;
import java.time.Month;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import ar.com.viewpaymentsb.entities.DataCompany;
import ar.com.viewpaymentsb.enums.DataDefault;
import ar.com.viewpaymentsb.utils.MethodsUtils;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SystemService {
	@Value("${app.version}")
	private String version;
	@Value("${server.servlet.context-path}")
	private String contextPath;
	@Value("${app.context-port}")
	private String contextPort;
	@Autowired
	private final DataCompanyService dataCompanyService;

	public DataCompany getCompany() {
		Optional<DataCompany> data = dataCompanyService.byId(DataDefault.idCompany.getCodeNumeric());
		if (data.isPresent()) {
			data.get().setStartOfActivityPatternUSA(MethodsUtils.dateformat(data.get().getStartOfActivity(),
					DataDefault.formatDateUSA.getCodeString()));
			data.get().setStartOfActivityPatternESP(MethodsUtils.dateformat(data.get().getStartOfActivity(),
					DataDefault.formatDateESP.getCodeString()));
		}
		return data.isPresent() ? data.get() : null;
	}

	public String backendVersion() {
		String defaultVersion = Optional.ofNullable(this.version).orElse("#value no present#");
		LocalDate date = LocalDate.of(2023, Month.MARCH, 7);
		String response = String.join(" ", defaultVersion, "(" + date.toString() + ")");
		return response;
	}

	public String getContextPath() {
		return this.contextPath;
	}

	public String getContextPort() {
		return this.contextPort;
	}

	public String getContext() {
		return this.contextPort + this.contextPath;
	}

	public DataCompany saveCompany(DataCompany dataCompany) {
		return dataCompanyService.save(dataCompany);
	}

}