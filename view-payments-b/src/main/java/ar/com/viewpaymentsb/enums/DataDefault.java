package ar.com.viewpaymentsb.enums;

import java.math.BigInteger;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataDefault {
	notPresent(BigInteger.valueOf(0), ""), idCompany(BigInteger.valueOf(1), "1"),
	active(BigInteger.valueOf(1), "1"), notActive(BigInteger.valueOf(0), "0"), age(BigInteger.valueOf(20), "20"),
	year1900(BigInteger.valueOf(1900), "1900"), userAdm(BigInteger.valueOf(1), "1"),
	formatDateESP(BigInteger.valueOf(2022), "dd-MM-yyyy"), formatDateUSA(BigInteger.valueOf(2022), "yyyy-MM-dd"),
	maxSizeFile(BigInteger.valueOf(1024576), "1024576"), document(BigInteger.valueOf(0), "00000000"),
	idVisitor(BigInteger.valueOf(1), "1"),lengthPassword(BigInteger.valueOf(16),"16"),
	passwordCharacter(BigInteger.valueOf(9999),"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");

	private final BigInteger codeNumeric;
	private final String codeString;
}
