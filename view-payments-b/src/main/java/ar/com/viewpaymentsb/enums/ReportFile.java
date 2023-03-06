package ar.com.viewpaymentsb.enums;

import java.io.File;

import lombok.AllArgsConstructor;
import lombok.Getter;

/*** @author Andres Gonzalez ***/

@Getter
@AllArgsConstructor
public enum ReportFile {
	extFile(".pdf","Extension de archivo"),
	extReport(".jasper","Extension de reportes"),
	resource("src" + File.separatorChar + "main" + File.separatorChar + "resources", "Carpeta recursos"),
	folder("reports", "Carpeta reportes");

	private String data;
	private String description;

}
