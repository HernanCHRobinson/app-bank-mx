package ar.com.viewpaymentsb.services;

import java.math.BigInteger;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.viewpaymentsb.entities.DataCompany;
import ar.com.viewpaymentsb.repositories.IDataCompanyRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class DataCompanyService {
	@Autowired
	private final IDataCompanyRepository iDataCompanyRepository;

	public Optional<DataCompany> byId(BigInteger idCompany) {
		return iDataCompanyRepository.findById(idCompany);
	}

	public DataCompany save(DataCompany dataCompany) {
		return iDataCompanyRepository.save(dataCompany);
	}

}