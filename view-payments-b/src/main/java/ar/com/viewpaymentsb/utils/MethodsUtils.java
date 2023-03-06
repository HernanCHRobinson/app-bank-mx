package ar.com.viewpaymentsb.utils;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.text.MaskFormatter;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import ar.com.viewpaymentsb.enums.DataDefault;

public class MethodsUtils {
	private Logger log = LoggerFactory.getLogger(this.getClass());

	public static String dateformat(Date date, String formato) {
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		return sdf.format(date);
	}

	public static Date StringtoDate(String dateAsString, String formato) throws ParseException {
		DateFormat sourceFormat = new SimpleDateFormat(formato);
		return sourceFormat.parse(dateAsString);
	}

	public static String decimalFormate(BigDecimal valor) {
		DecimalFormat dn = new DecimalFormat("###,###,###,###.00");
		return dn.format(valor);
	}

	public static String decimalFormate(String valorString) {
		BigDecimal valor = new BigDecimal(valorString);
		DecimalFormat dn = new DecimalFormat("###,###,###,###.00");
		return dn.format(valor);
	}

	public static String formatMoneda(BigDecimal Valor) {
		BigDecimal dcf = new BigDecimal(Valor.toString()).setScale(2, BigDecimal.ROUND_CEILING);
		return dcf.toString().replace(".", ",");
	}

	public String getpath(String resource) {
		String path = this.getClass().getClassLoader().getResource(resource).getPath();
		log.info(path);
		try {
			return URLDecoder.decode(path, "UTF-8");
		} catch (Exception e) {
			return "";
		}
	}

	public static Date adicionarDiasUteis(Date fecha, int cantidad_dias_habiles) {
		ZoneId regiao = ZoneId.systemDefault();
		Date date = new Date(fecha.getTime());
		LocalDateTime novaData = LocalDateTime.ofInstant(date.toInstant(), regiao);
		int i = 0;
		while (i < cantidad_dias_habiles) {
			LocalDateTime diaSeguinte = novaData.plusDays(1);
			switch (diaSeguinte.getDayOfWeek()) {
			case SATURDAY:
				novaData = diaSeguinte;
				continue;
			case SUNDAY:
				novaData = diaSeguinte;
				continue;
			default:
				i++;
				novaData = diaSeguinte;
				// ignora sábados e domingos
			}
		}
		return Date.from(novaData.atZone(regiao).toInstant());
	}

	public static Date adicionarDias(Date fecha, int cantidad_dias) {
		DateTime date = new DateTime(fecha);
		date = date.plusDays(cantidad_dias);
		return date.toDate();
	}

	// multiparfile to file
	public static File convert(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		convFile.createNewFile();
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}

	public static String extensionFile(String file) {
		checkNotNull(file);
		String fileName = new File(file).getName();
		int dotIndex = fileName.lastIndexOf('.');
		return (dotIndex == -1) ? "" : fileName.substring(dotIndex + 1);
	}

	/**
	 * @param value  elemento a ser formateado
	 * @param format usar patron ej CUIT: ##-########-#
	 * @return devuelve el valor formateado
	 */
	public static String FormatString(String value, String format) {
		try {
			MaskFormatter mask = new MaskFormatter(format);
			mask.setValueContainsLiteralCharacters(false);
			return mask.valueToString(value);
		} catch (ParseException e) {
			return value;
		}
	}

	public static String replace(String origin, String replace) {
		StringBuilder builder = new StringBuilder();
		for (char caracter : origin.toCharArray()) {
			if (!Character.toString(caracter).matches(" ")) {
				builder.append(caracter);
			}
		}
		String response = builder.toString().trim();
		return response;
	}

	public static String IzquierdaZeroComplete(Object valor, int Cantidad_total) {
		String Value = String.valueOf(valor);
		for (int i = Value.length(); i < Cantidad_total; i++) {
			Value = "0".concat(Value);
		}
		return Value;
	}

	public static String MesNombre(int month) {
		String[] monthNames = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septembre",
				"Octubre", "Noviembre", "Deciembre" };
		return monthNames[month];
	}

	// Funcion isNumeric() que devuelve True o False.
	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	@SuppressWarnings("deprecation")
	public static LocalDate today() {
		return LocalDate.of(Year.now().getValue(), Month.of(new Date().getMonth() + 1), new Date().getDate());
	}

	@SuppressWarnings("deprecation")
	public static LocalDate toLocalDate(Date date) {
		return LocalDate.of(date.getYear() + DataDefault.year1900.getCodeNumeric().shortValue(), date.getMonth() + 1,
				date.getDate());
	}

	public static Integer weekDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_WEEK);
	}

	public static Boolean validateMail(String mail) {

		// Patrón para validar el email
		Pattern pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(mail);

        if (mather.find() == true) {
            System.out.println("El email ingresado es válido.");
            return Boolean.TRUE;
        } else {
            System.out.println("El email ingresado es inválido.");
            return Boolean.FALSE;
        }
	}
}
