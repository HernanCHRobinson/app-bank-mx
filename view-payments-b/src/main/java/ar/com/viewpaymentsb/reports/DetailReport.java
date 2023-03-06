package ar.com.viewpaymentsb.reports;


import java.io.Serializable;
import java.lang.reflect.Field;

public class DetailReport implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	String detail11;
	String detail12;
	String detail13;
	String detail14;
	String detail15;
	String detail16;
	String detail17;
	String detail18;
	String detail19;
	String detail20;
	String detail21;
	String detail22;
	String detail23;
	String detail24;
	String detail25;
	String detail26;
	String detail27;
	String detail28;
	String detail29;
	String detail30;
	String detail31;
	String detail32;
	String detail33;
	String detail34;
	String detail35;
	String detail36;
	String detail37;
	String detail38;
	String detail39;
	String detail40;
	String detail41;
	String detail42;
	String detail43;
	String detail44;
	String detail45;
	String detail46;
	String detail47;
	String detail48;
	String detail49;
	String detail50;
	String detail51;
	String detail52;
	String detail53;
	String detail54;
	String detail55;
	String detail56;
	String detail57;
	String detail58;
	String detail59;
	String detail60;
	String detail61;
	String detail62;
	String detail63;
	String detail64;
	String detail65;
	String detail66;
	String detail67;
	String detail68;
	String detail69;
	String detail70;
	String detail71;
	String detail72;
	String detail73;
	String detail74;
	String detail75;
	String detail76;
	String detail77;
	String detail78;
	String detail79;
	String detail80;
	String detail81;
	String detail82;
	String detail83;
	String detail84;
	String detail85;
	String detail86;
	String detail87;
	String detail88;
	String detail89;
	String detail90;
	String detail91;
	String detail92;
	String detail93;
	String detail94;
	String detail95;
	String detail96;
	String detail97;
	String detail98;
	String detail99;
	String detail100;
	String detail101;
	String detail102;
	String detail103;
	String detail104;
	String detail105;
	String detail106;
	String detail107;
	String detail108;
	String detail109;
	String detail110;
	String detail111;
	String detail112;
	String detail113;
	String detail114;
	String detail115;
	String detail116;
	String detail117;
	String detail118;
	String detail119;
	String detail120;
	String detail121;
	String detail122;
	String detail123;
	String detail124;
	String detail125;
	String detail126;
	String detail127;
	String detail128;
	String detail129;
	String detail130;

	// TODO ----solamente un constructor para todo quitar todo los contructores
	// desnecesarios
	public DetailReport(String... objects) {
		int i = 1;
		Class<?> details = this.getClass();
		Field field = null;
		for (String valor : objects) {
			if (valor == null) {
				valor = "";
			}
			try {
				field = details.getDeclaredField("detail" + i);
				field.set(this, valor);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} finally {
				i++;
			}
		}
		for (int j = i; j < 130; j++) {
			try {
				field = details.getDeclaredField("detail" + j);
				field.set(this, "");
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}

//	public DetailReport() {
//		super();
//	}

	public DetailReport() {
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
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10, String detail11, String detail12) {
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
		this.detail11 = detail11;
		this.detail12 = detail12;
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1) {
		this.detail1 = detail1;
		this.detail2 = "";
		this.detail3 = "";
		this.detail4 = "";
		this.detail5 = "";
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = "";
		this.detail4 = "";
		this.detail5 = "";
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = "";
		this.detail5 = "";
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = "";
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = "";
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5,
			String detail6) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = detail6;
		this.detail7 = "";
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = detail6;
		this.detail7 = detail7;
		this.detail8 = "";
		this.detail9 = "";
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8) {
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
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9) {
		this.detail1 = detail1;
		this.detail2 = detail2;
		this.detail3 = detail3;
		this.detail4 = detail4;
		this.detail5 = detail5;
		this.detail6 = detail6;
		this.detail7 = detail7;
		this.detail8 = detail8;
		this.detail9 = detail9;
		this.detail10 = "";
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10) {
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
		this.detail11 = "";
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10, String detail11) {
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
		this.detail11 = detail11;
		this.detail12 = "";
		this.detail13 = "";
		this.detail14 = "";
		this.detail15 = "";
		this.detail16 = "";
		this.detail17 = "";
		this.detail18 = "";
		this.detail19 = "";
		this.detail20 = "";
		this.detail21 = "";
		this.detail22 = "";
		this.detail23 = "";
		this.detail24 = "";
		this.detail25 = "";
		this.detail26 = "";
		this.detail27 = "";
		this.detail28 = "";
		this.detail29 = "";
		this.detail30 = "";
		this.detail31 = "";
		this.detail32 = "";
		this.detail33 = "";
		this.detail34 = "";
		this.detail35 = "";
		this.detail36 = "";
		this.detail37 = "";
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10, String detail11, String detail12,
			String detail13, String detail14, String detail15, String detail16, String detail17, String detail18,
			String detail19, String detail20, String detail21, String detail22, String detail23, String detail24,
			String detail25, String detail26, String detail27, String detail28, String detail29, String detail30,
			String detail31, String detail32, String detail33, String detail34, String detail35, String detail36,
			String detail37, String detail38, String detail39, String detail40, String detail41, String detail42,
			String detail43, String detail44, String detail45, String detail46, String detail47, String detail48,
			String detail49, String detail50, String detail51, String detail52, String detail53, String detail54,
			String detail55) {
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
		this.detail11 = detail11;
		this.detail12 = detail12;
		this.detail13 = detail13;
		this.detail14 = detail14;
		this.detail15 = detail15;
		this.detail16 = detail16;
		this.detail17 = detail17;
		this.detail18 = detail18;
		this.detail19 = detail19;
		this.detail20 = detail20;
		this.detail21 = detail21;
		this.detail22 = detail22;
		this.detail23 = detail23;
		this.detail24 = detail24;
		this.detail25 = detail25;
		this.detail26 = detail26;
		this.detail27 = detail27;
		this.detail28 = detail28;
		this.detail29 = detail29;
		this.detail30 = detail30;
		this.detail31 = detail31;
		this.detail32 = detail32;
		this.detail33 = detail33;
		this.detail34 = detail34;
		this.detail35 = detail35;
		this.detail36 = detail36;
		this.detail37 = detail37;
		this.detail38 = detail38;
		this.detail39 = detail39;
		this.detail40 = detail40;
		this.detail41 = detail41;
		this.detail42 = detail42;
		this.detail43 = detail43;
		this.detail44 = detail44;
		this.detail45 = detail45;
		this.detail46 = detail46;
		this.detail47 = detail47;
		this.detail48 = detail48;
		this.detail49 = detail49;
		this.detail50 = detail50;
		this.detail51 = detail51;
		this.detail52 = detail52;
		this.detail53 = detail53;
		this.detail54 = detail54;
		this.detail55 = detail55;
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10, String detail11, String detail12,
			String detail13, String detail14, String detail15, String detail16, String detail17, String detail18,
			String detail19, String detail20, String detail21, String detail22, String detail23, String detail24,
			String detail25, String detail26, String detail27, String detail28, String detail29, String detail30,
			String detail31, String detail32, String detail33, String detail34, String detail35, String detail36,
			String detail37, String detail38, String detail39, String detail40, String detail41, String detail42,
			String detail43, String detail44, String detail45, String detail46, String detail47, String detail48,
			String detail49, String detail50, String detail51, String detail52, String detail53, String detail54,
			String detail55, String detail56, String detail57, String detail58, String detail59, String detail60,
			String detail61, String detail62, String detail63, String detail64, String detail65, String detail66,
			String detail67, String detail68, String detail69, String detail70, String detail71, String detail72,
			String detail73, String detail74, String detail75, String detail76, String detail77, String detail78,
			String detail79, String detail80, String detail81, String detail82, String detail83, String detail84,
			String detail85, String detail86, String detail87, String detail88, String detail89, String detail90,
			String detail91, String detail92, String detail93, String detail94, String detail95, String detail96,
			String detail97, String detail98, String detail99, String detail100, String detail101, String detail102,
			String detail103, String detail104, String detail105, String detail106, String detail107, String detail108,
			String detail109, String detail110, String detail111, String detail112, String detail113, String detail114,
			String detail115, String detail116, String detail117, String detail118, String detail119, String detail120,
			String detail121, String detail122, String detail123, String detail124, String detail125, String detail126,
			String detail127, String detail128, String detail129, String detail130) {
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
		this.detail11 = detail11;
		this.detail12 = detail12;
		this.detail13 = detail13;
		this.detail14 = detail14;
		this.detail15 = detail15;
		this.detail16 = detail16;
		this.detail17 = detail17;
		this.detail18 = detail18;
		this.detail19 = detail19;
		this.detail20 = detail20;
		this.detail21 = detail21;
		this.detail22 = detail22;
		this.detail23 = detail23;
		this.detail24 = detail24;
		this.detail25 = detail25;
		this.detail26 = detail26;
		this.detail27 = detail27;
		this.detail28 = detail28;
		this.detail29 = detail29;
		this.detail30 = detail30;
		this.detail31 = detail31;
		this.detail32 = detail32;
		this.detail33 = detail33;
		this.detail34 = detail34;
		this.detail35 = detail35;
		this.detail36 = detail36;
		this.detail37 = detail37;
		this.detail38 = detail38;
		this.detail39 = detail39;
		this.detail40 = detail40;
		this.detail41 = detail41;
		this.detail42 = detail42;
		this.detail43 = detail43;
		this.detail44 = detail44;
		this.detail45 = detail45;
		this.detail46 = detail46;
		this.detail47 = detail47;
		this.detail48 = detail48;
		this.detail49 = detail49;
		this.detail50 = detail50;
		this.detail51 = detail51;
		this.detail52 = detail52;
		this.detail53 = detail53;
		this.detail54 = detail54;
		this.detail55 = detail55;
		this.detail56 = detail56;
		this.detail57 = detail57;
		this.detail58 = detail58;
		this.detail59 = detail59;
		this.detail60 = detail60;
		this.detail61 = detail61;
		this.detail62 = detail62;
		this.detail63 = detail63;
		this.detail64 = detail64;
		this.detail65 = detail65;
		this.detail66 = detail66;
		this.detail67 = detail67;
		this.detail68 = detail68;
		this.detail69 = detail69;
		this.detail70 = detail70;
		this.detail71 = detail71;
		this.detail72 = detail72;
		this.detail73 = detail73;
		this.detail74 = detail74;
		this.detail75 = detail75;
		this.detail76 = detail76;
		this.detail77 = detail77;
		this.detail78 = detail78;
		this.detail79 = detail79;
		this.detail80 = detail80;
		this.detail81 = detail81;
		this.detail82 = detail82;
		this.detail83 = detail83;
		this.detail84 = detail84;
		this.detail85 = detail85;
		this.detail86 = detail86;
		this.detail87 = detail87;
		this.detail88 = detail88;
		this.detail89 = detail89;
		this.detail90 = detail90;
		this.detail91 = detail91;
		this.detail92 = detail92;
		this.detail93 = detail93;
		this.detail94 = detail94;
		this.detail95 = detail95;
		this.detail96 = detail96;
		this.detail97 = detail97;
		this.detail98 = detail98;
		this.detail99 = detail99;
		this.detail100 = detail100;
		this.detail101 = detail101;
		this.detail102 = detail102;
		this.detail103 = detail103;
		this.detail104 = detail104;
		this.detail105 = detail105;
		this.detail106 = detail106;
		this.detail107 = detail107;
		this.detail108 = detail108;
		this.detail109 = detail109;
		this.detail110 = detail110;
		this.detail111 = detail111;
		this.detail112 = detail112;
		this.detail113 = detail113;
		this.detail114 = detail114;
		this.detail115 = detail115;
		this.detail116 = detail116;
		this.detail117 = detail117;
		this.detail118 = detail118;
		this.detail119 = detail119;
		this.detail120 = detail120;
		this.detail121 = detail121;
		this.detail122 = detail122;
		this.detail123 = detail123;
		this.detail124 = detail124;
		this.detail125 = detail125;
		this.detail126 = detail126;
		this.detail127 = detail127;
		this.detail128 = detail128;
		this.detail129 = detail129;
		this.detail130 = detail130;
	}

	public DetailReport(String detail1, String detail2, String detail3, String detail4, String detail5, String detail6,
			String detail7, String detail8, String detail9, String detail10, String detail11, String detail12,
			String detail13, String detail14, String detail15, String detail16, String detail17, String detail18,
			String detail19, String detail20, String detail21, String detail22, String detail23, String detail24,
			String detail25, String detail26, String detail27, String detail28, String detail29, String detail30,
			String detail31, String detail32, String detail33, String detail34, String detail35, String detail36,
			String detail37) {
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
		this.detail11 = detail11;
		this.detail12 = detail12;
		this.detail13 = detail13;
		this.detail14 = detail14;
		this.detail15 = detail15;
		this.detail16 = detail16;
		this.detail17 = detail17;
		this.detail18 = detail18;
		this.detail19 = detail19;
		this.detail20 = detail20;
		this.detail21 = detail21;
		this.detail22 = detail22;
		this.detail23 = detail23;
		this.detail24 = detail24;
		this.detail25 = detail25;
		this.detail26 = detail26;
		this.detail27 = detail27;
		this.detail28 = detail28;
		this.detail29 = detail29;
		this.detail30 = detail30;
		this.detail31 = detail31;
		this.detail32 = detail32;
		this.detail33 = detail33;
		this.detail34 = detail34;
		this.detail35 = detail35;
		this.detail36 = detail36;
		this.detail37 = detail37;
		this.detail38 = "";
		this.detail39 = "";
		this.detail40 = "";
		this.detail41 = "";
		this.detail42 = "";
		this.detail43 = "";
		this.detail44 = "";
		this.detail45 = "";
		this.detail46 = "";
		this.detail47 = "";
		this.detail48 = "";
		this.detail49 = "";
		this.detail50 = "";
		this.detail51 = "";
		this.detail52 = "";
		this.detail53 = "";
		this.detail54 = "";
		this.detail55 = "";
		this.detail56 = "";
		this.detail57 = "";
		this.detail58 = "";
		this.detail59 = "";
		this.detail60 = "";
		this.detail61 = "";
		this.detail62 = "";
		this.detail63 = "";
		this.detail64 = "";
		this.detail65 = "";
		this.detail66 = "";
		this.detail67 = "";
		this.detail68 = "";
		this.detail69 = "";
		this.detail70 = "";
		this.detail71 = "";
		this.detail72 = "";
		this.detail73 = "";
		this.detail74 = "";
		this.detail75 = "";
		this.detail76 = "";
		this.detail77 = "";
		this.detail78 = "";
		this.detail79 = "";
		this.detail80 = "";
		this.detail81 = "";
		this.detail82 = "";
		this.detail83 = "";
		this.detail84 = "";
		this.detail85 = "";
		this.detail86 = "";
		this.detail87 = "";
		this.detail88 = "";
		this.detail89 = "";
		this.detail90 = "";
		this.detail91 = "";
		this.detail92 = "";
		this.detail93 = "";
		this.detail94 = "";
		this.detail95 = "";
		this.detail96 = "";
		this.detail97 = "";
		this.detail98 = "";
		this.detail99 = "";
		this.detail100 = "";
		this.detail101 = "";
		this.detail102 = "";
		this.detail103 = "";
		this.detail104 = "";
		this.detail105 = "";
		this.detail106 = "";
		this.detail107 = "";
		this.detail108 = "";
		this.detail109 = "";
		this.detail110 = "";
		this.detail111 = "";
		this.detail112 = "";
		this.detail113 = "";
		this.detail114 = "";
		this.detail115 = "";
		this.detail116 = "";
		this.detail117 = "";
		this.detail118 = "";
		this.detail119 = "";
		this.detail120 = "";
		this.detail121 = "";
		this.detail122 = "";
		this.detail123 = "";
		this.detail124 = "";
		this.detail125 = "";
		this.detail126 = "";
		this.detail127 = "";
		this.detail128 = "";
		this.detail129 = "";
		this.detail130 = "";
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

	public String getDetail11() {
		return detail11;
	}

	public void setDetail11(String detail11) {
		this.detail11 = detail11;
	}

	public String getDetail12() {
		return detail12;
	}

	public void setDetail12(String detail12) {
		this.detail12 = detail12;
	}

	public String getDetail13() {
		return detail13;
	}

	public void setDetail13(String detail13) {
		this.detail13 = detail13;
	}

	public String getDetail14() {
		return detail14;
	}

	public void setDetail14(String detail14) {
		this.detail14 = detail14;
	}

	public String getDetail15() {
		return detail15;
	}

	public void setDetail15(String detail15) {
		this.detail15 = detail15;
	}

	public String getDetail16() {
		return detail16;
	}

	public void setDetail16(String detail16) {
		this.detail16 = detail16;
	}

	public String getDetail17() {
		return detail17;
	}

	public void setDetail17(String detail17) {
		this.detail17 = detail17;
	}

	public String getDetail18() {
		return detail18;
	}

	public void setDetail18(String detail18) {
		this.detail18 = detail18;
	}

	public String getDetail19() {
		return detail19;
	}

	public void setDetail19(String detail19) {
		this.detail19 = detail19;
	}

	public String getDetail20() {
		return detail20;
	}

	public void setDetail20(String detail20) {
		this.detail20 = detail20;
	}

	public String getDetail21() {
		return detail21;
	}

	public void setDetail21(String detail21) {
		this.detail21 = detail21;
	}

	public String getDetail22() {
		return detail22;
	}

	public void setDetail22(String detail22) {
		this.detail22 = detail22;
	}

	public String getDetail23() {
		return detail23;
	}

	public void setDetail23(String detail23) {
		this.detail23 = detail23;
	}

	public String getDetail24() {
		return detail24;
	}

	public void setDetail24(String detail24) {
		this.detail24 = detail24;
	}

	public String getDetail25() {
		return detail25;
	}

	public void setDetail25(String detail25) {
		this.detail25 = detail25;
	}

	public String getDetail26() {
		return detail26;
	}

	public void setDetail26(String detail26) {
		this.detail26 = detail26;
	}

	public String getDetail27() {
		return detail27;
	}

	public void setDetail27(String detail27) {
		this.detail27 = detail27;
	}

	public String getDetail28() {
		return detail28;
	}

	public void setDetail28(String detail28) {
		this.detail28 = detail28;
	}

	public String getDetail29() {
		return detail29;
	}

	public void setDetail29(String detail29) {
		this.detail29 = detail29;
	}

	public String getDetail30() {
		return detail30;
	}

	public void setDetail30(String detail30) {
		this.detail30 = detail30;
	}

	public String getDetail31() {
		return detail31;
	}

	public void setDetail31(String detail31) {
		this.detail31 = detail31;
	}

	public String getDetail32() {
		return detail32;
	}

	public void setDetail32(String detail32) {
		this.detail32 = detail32;
	}

	public String getDetail33() {
		return detail33;
	}

	public void setDetail33(String detail33) {
		this.detail33 = detail33;
	}

	public String getDetail34() {
		return detail34;
	}

	public void setDetail34(String detail34) {
		this.detail34 = detail34;
	}

	public String getDetail35() {
		return detail35;
	}

	public void setDetail35(String detail35) {
		this.detail35 = detail35;
	}

	public String getDetail36() {
		return detail36;
	}

	public void setDetail36(String detail36) {
		this.detail36 = detail36;
	}

	public String getDetail37() {
		return detail37;
	}

	public void setDetail37(String detail37) {
		this.detail37 = detail37;
	}

	public String getDetail38() {
		return detail38;
	}

	public void setDetail38(String detail38) {
		this.detail38 = detail38;
	}

	public String getDetail39() {
		return detail39;
	}

	public void setDetail39(String detail39) {
		this.detail39 = detail39;
	}

	public String getDetail40() {
		return detail40;
	}

	public void setDetail40(String detail40) {
		this.detail40 = detail40;
	}

	public String getDetail41() {
		return detail41;
	}

	public void setDetail41(String detail41) {
		this.detail41 = detail41;
	}

	public String getDetail42() {
		return detail42;
	}

	public void setDetail42(String detail42) {
		this.detail42 = detail42;
	}

	public String getDetail43() {
		return detail43;
	}

	public void setDetail43(String detail43) {
		this.detail43 = detail43;
	}

	public String getDetail44() {
		return detail44;
	}

	public void setDetail44(String detail44) {
		this.detail44 = detail44;
	}

	public String getDetail45() {
		return detail45;
	}

	public void setDetail45(String detail45) {
		this.detail45 = detail45;
	}

	public String getDetail46() {
		return detail46;
	}

	public void setDetail46(String detail46) {
		this.detail46 = detail46;
	}

	public String getDetail47() {
		return detail47;
	}

	public void setDetail47(String detail47) {
		this.detail47 = detail47;
	}

	public String getDetail48() {
		return detail48;
	}

	public void setDetail48(String detail48) {
		this.detail48 = detail48;
	}

	public String getDetail49() {
		return detail49;
	}

	public void setDetail49(String detail49) {
		this.detail49 = detail49;
	}

	public String getDetail50() {
		return detail50;
	}

	public void setDetail50(String detail50) {
		this.detail50 = detail50;
	}

	public String getDetail51() {
		return detail51;
	}

	public void setDetail51(String detail51) {
		this.detail51 = detail51;
	}

	public String getDetail52() {
		return detail52;
	}

	public void setDetail52(String detail52) {
		this.detail52 = detail52;
	}

	public String getDetail53() {
		return detail53;
	}

	public void setDetail53(String detail53) {
		this.detail53 = detail53;
	}

	public String getDetail54() {
		return detail54;
	}

	public void setDetail54(String detail54) {
		this.detail54 = detail54;
	}

	public String getDetail55() {
		return detail55;
	}

	public void setDetail55(String detail55) {
		this.detail55 = detail55;
	}

	public String getDetail56() {
		return detail56;
	}

	public void setDetail56(String detail56) {
		this.detail56 = detail56;
	}

	public String getDetail57() {
		return detail57;
	}

	public void setDetail57(String detail57) {
		this.detail57 = detail57;
	}

	public String getDetail58() {
		return detail58;
	}

	public void setDetail58(String detail58) {
		this.detail58 = detail58;
	}

	public String getDetail59() {
		return detail59;
	}

	public void setDetail59(String detail59) {
		this.detail59 = detail59;
	}

	public String getDetail60() {
		return detail60;
	}

	public void setDetail60(String detail60) {
		this.detail60 = detail60;
	}

	public String getDetail61() {
		return detail61;
	}

	public void setDetail61(String detail61) {
		this.detail61 = detail61;
	}

	public String getDetail62() {
		return detail62;
	}

	public void setDetail62(String detail62) {
		this.detail62 = detail62;
	}

	public String getDetail63() {
		return detail63;
	}

	public void setDetail63(String detail63) {
		this.detail63 = detail63;
	}

	public String getDetail64() {
		return detail64;
	}

	public void setDetail64(String detail64) {
		this.detail64 = detail64;
	}

	public String getDetail65() {
		return detail65;
	}

	public void setDetail65(String detail65) {
		this.detail65 = detail65;
	}

	public String getDetail66() {
		return detail66;
	}

	public void setDetail66(String detail66) {
		this.detail66 = detail66;
	}

	public String getDetail67() {
		return detail67;
	}

	public void setDetail67(String detail67) {
		this.detail67 = detail67;
	}

	public String getDetail68() {
		return detail68;
	}

	public void setDetail68(String detail68) {
		this.detail68 = detail68;
	}

	public String getDetail69() {
		return detail69;
	}

	public void setDetail69(String detail69) {
		this.detail69 = detail69;
	}

	public String getDetail70() {
		return detail70;
	}

	public void setDetail70(String detail70) {
		this.detail70 = detail70;
	}

	public String getDetail71() {
		return detail71;
	}

	public void setDetail71(String detail71) {
		this.detail71 = detail71;
	}

	public String getDetail72() {
		return detail72;
	}

	public void setDetail72(String detail72) {
		this.detail72 = detail72;
	}

	public String getDetail73() {
		return detail73;
	}

	public void setDetail73(String detail73) {
		this.detail73 = detail73;
	}

	public String getDetail74() {
		return detail74;
	}

	public void setDetail74(String detail74) {
		this.detail74 = detail74;
	}

	public String getDetail75() {
		return detail75;
	}

	public void setDetail75(String detail75) {
		this.detail75 = detail75;
	}

	public String getDetail76() {
		return detail76;
	}

	public void setDetail76(String detail76) {
		this.detail76 = detail76;
	}

	public String getDetail77() {
		return detail77;
	}

	public void setDetail77(String detail77) {
		this.detail77 = detail77;
	}

	public String getDetail78() {
		return detail78;
	}

	public void setDetail78(String detail78) {
		this.detail78 = detail78;
	}

	public String getDetail79() {
		return detail79;
	}

	public void setDetail79(String detail79) {
		this.detail79 = detail79;
	}

	public String getDetail80() {
		return detail80;
	}

	public void setDetail80(String detail80) {
		this.detail80 = detail80;
	}

	public String getDetail81() {
		return detail81;
	}

	public void setDetail81(String detail81) {
		this.detail81 = detail81;
	}

	public String getDetail82() {
		return detail82;
	}

	public void setDetail82(String detail82) {
		this.detail82 = detail82;
	}

	public String getDetail83() {
		return detail83;
	}

	public void setDetail83(String detail83) {
		this.detail83 = detail83;
	}

	public String getDetail84() {
		return detail84;
	}

	public void setDetail84(String detail84) {
		this.detail84 = detail84;
	}

	public String getDetail85() {
		return detail85;
	}

	public void setDetail85(String detail85) {
		this.detail85 = detail85;
	}

	public String getDetail86() {
		return detail86;
	}

	public void setDetail86(String detail86) {
		this.detail86 = detail86;
	}

	public String getDetail87() {
		return detail87;
	}

	public void setDetail87(String detail87) {
		this.detail87 = detail87;
	}

	public String getDetail88() {
		return detail88;
	}

	public void setDetail88(String detail88) {
		this.detail88 = detail88;
	}

	public String getDetail89() {
		return detail89;
	}

	public void setDetail89(String detail89) {
		this.detail89 = detail89;
	}

	public String getDetail90() {
		return detail90;
	}

	public void setDetail90(String detail90) {
		this.detail90 = detail90;
	}

	public String getDetail91() {
		return detail91;
	}

	public void setDetail91(String detail91) {
		this.detail91 = detail91;
	}

	public String getDetail92() {
		return detail92;
	}

	public void setDetail92(String detail92) {
		this.detail92 = detail92;
	}

	public String getDetail93() {
		return detail93;
	}

	public void setDetail93(String detail93) {
		this.detail93 = detail93;
	}

	public String getDetail94() {
		return detail94;
	}

	public void setDetail94(String detail94) {
		this.detail94 = detail94;
	}

	public String getDetail95() {
		return detail95;
	}

	public void setDetail95(String detail95) {
		this.detail95 = detail95;
	}

	public String getDetail96() {
		return detail96;
	}

	public void setDetail96(String detail96) {
		this.detail96 = detail96;
	}

	public String getDetail97() {
		return detail97;
	}

	public void setDetail97(String detail97) {
		this.detail97 = detail97;
	}

	public String getDetail98() {
		return detail98;
	}

	public void setDetail98(String detail98) {
		this.detail98 = detail98;
	}

	public String getDetail99() {
		return detail99;
	}

	public void setDetail99(String detail99) {
		this.detail99 = detail99;
	}

	public String getDetail100() {
		return detail100;
	}

	public void setDetail100(String detail100) {
		this.detail100 = detail100;
	}

	public String getDetail101() {
		return detail101;
	}

	public void setDetail101(String detail101) {
		this.detail101 = detail101;
	}

	public String getDetail102() {
		return detail102;
	}

	public void setDetail102(String detail102) {
		this.detail102 = detail102;
	}

	public String getDetail103() {
		return detail103;
	}

	public void setDetail103(String detail103) {
		this.detail103 = detail103;
	}

	public String getDetail104() {
		return detail104;
	}

	public void setDetail104(String detail104) {
		this.detail104 = detail104;
	}

	public String getDetail105() {
		return detail105;
	}

	public void setDetail105(String detail105) {
		this.detail105 = detail105;
	}

	public String getDetail106() {
		return detail106;
	}

	public void setDetail106(String detail106) {
		this.detail106 = detail106;
	}

	public String getDetail107() {
		return detail107;
	}

	public void setDetail107(String detail107) {
		this.detail107 = detail107;
	}

	public String getDetail108() {
		return detail108;
	}

	public void setDetail108(String detail108) {
		this.detail108 = detail108;
	}

	public String getDetail109() {
		return detail109;
	}

	public void setDetail109(String detail109) {
		this.detail109 = detail109;
	}

	public String getDetail110() {
		return detail110;
	}

	public void setDetail110(String detail110) {
		this.detail110 = detail110;
	}

	public String getDetail111() {
		return detail111;
	}

	public void setDetail111(String detail111) {
		this.detail111 = detail111;
	}

	public String getDetail112() {
		return detail112;
	}

	public void setDetail112(String detail112) {
		this.detail112 = detail112;
	}

	public String getDetail113() {
		return detail113;
	}

	public void setDetail113(String detail113) {
		this.detail113 = detail113;
	}

	public String getDetail114() {
		return detail114;
	}

	public void setDetail114(String detail114) {
		this.detail114 = detail114;
	}

	public String getDetail115() {
		return detail115;
	}

	public void setDetail115(String detail115) {
		this.detail115 = detail115;
	}

	public String getDetail116() {
		return detail116;
	}

	public void setDetail116(String detail116) {
		this.detail116 = detail116;
	}

	public String getDetail117() {
		return detail117;
	}

	public void setDetail117(String detail117) {
		this.detail117 = detail117;
	}

	public String getDetail118() {
		return detail118;
	}

	public void setDetail118(String detail118) {
		this.detail118 = detail118;
	}

	public String getDetail119() {
		return detail119;
	}

	public void setDetail119(String detail119) {
		this.detail119 = detail119;
	}

	public String getDetail120() {
		return detail120;
	}

	public void setDetail120(String detail120) {
		this.detail120 = detail120;
	}

	public String getDetail121() {
		return detail121;
	}

	public void setDetail121(String detail121) {
		this.detail121 = detail121;
	}

	public String getDetail122() {
		return detail122;
	}

	public void setDetail122(String detail122) {
		this.detail122 = detail122;
	}

	public String getDetail123() {
		return detail123;
	}

	public void setDetail123(String detail123) {
		this.detail123 = detail123;
	}

	public String getDetail124() {
		return detail124;
	}

	public void setDetail124(String detail124) {
		this.detail124 = detail124;
	}

	public String getDetail125() {
		return detail125;
	}

	public void setDetail125(String detail125) {
		this.detail125 = detail125;
	}

	public String getDetail126() {
		return detail126;
	}

	public void setDetail126(String detail126) {
		this.detail126 = detail126;
	}

	public String getDetail127() {
		return detail127;
	}

	public void setDetail127(String detail127) {
		this.detail127 = detail127;
	}

	public String getDetail128() {
		return detail128;
	}

	public void setDetail128(String detail128) {
		this.detail128 = detail128;
	}

	public String getDetail129() {
		return detail129;
	}

	public void setDetail129(String detail129) {
		this.detail129 = detail129;
	}

	public String getDetail130() {
		return detail130;
	}

	public void setDetail130(String detail130) {
		this.detail130 = detail130;
	}

}
