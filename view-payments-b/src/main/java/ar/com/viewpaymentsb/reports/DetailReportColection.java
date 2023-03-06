package ar.com.viewpaymentsb.reports;

import java.util.ArrayList;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class DetailReportColection implements Comparable<DetailReportColection> {
	String detail1;
	String detail2;
	String detail3;
	String detail4;
	String detail5;
	String detail6;
	String detail7;
	String detail8;
	String detail9;
	String detail10;
	JRBeanCollectionDataSource  colection;


	public DetailReportColection(String detail1, String detail2,
			String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10,
			ArrayList<DetailReport> colection) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = detail6;
		this.detail7 = detail7;
		this.detail8 = detail8;
		this.detail9 = detail9;
		this.detail10 = detail10;
		this.colection = new JRBeanCollectionDataSource(colection);
	}
	
	
	public DetailReportColection(String detail1, String detail2,String detail3,
			String detail4, String detail5, String detail6,
			String detail7, String detail8, JRBeanCollectionDataSource colection) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = detail6;
		this.detail7 = detail7;
		this.detail8 = detail8;
		this.detail9 = "";
		this.detail10 = "";
		this.colection = colection;
	}

	public DetailReportColection() {
		this.detail1 = "";
		this.detail2 = "";
		this.detail3 = "";
		this.detail4 = "";
		this.detail5 = "";
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.colection = new JRBeanCollectionDataSource(new ArrayList<Object>());
	}

	public String getDetail1() {
		return detail1;
	}

	public void setDetail1(String detail1) {
		this.detail1 = detail1;
	}

	public String getDetail2() {
		return detail2;
	}

	public void setDetail2(String detail2) {
		this.detail2 = detail2;
	}

	public String getDetail3() {
		return detail3;
	}

	public void setDetail3(String detail3) {
		this.detail3 = detail3;
	}

	public String getDetail4() {
		return detail4;
	}

	public void setDetail4(String detail4) {
		this.detail4 = detail4;
	}

	public String getDetail5() {
		return detail5;
	}

	public void setDetail5(String detail5) {
		this.detail5 = detail5;
	}

	public String getDetail6() {
		return detail6;
	}

	public void setDetail6(String detail6) {
		this.detail6 = detail6;
	}

	public String getDetail7() {
		return detail7;
	}

	public void setDetail7(String detail7) {
		this.detail7 = detail7;
	}

	public String getDetail8() {
		return detail8;
	}

	public void setDetail8(String detail8) {
		this.detail8 = detail8;
	}

	public String getDetail9() {
		return detail9;
	}

	public void setDetail9(String detail9) {
		this.detail9 = detail9;
	}

	public String getDetail10() {
		return detail10;
	}

	public void setDetail10(String detail10) {
		this.detail10 = detail10;
	}

	public JRBeanCollectionDataSource getColection() {
		return colection;
	}

	public void setColection(JRBeanCollectionDataSource colection) {
		this.colection = colection;
	}


	@Override
	public int compareTo(DetailReportColection o) {
		return this.getDetail5().compareTo(o.getDetail5());
	}

}

