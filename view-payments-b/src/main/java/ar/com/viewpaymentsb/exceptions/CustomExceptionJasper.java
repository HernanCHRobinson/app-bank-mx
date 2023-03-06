package ar.com.viewpaymentsb.exceptions;


public class CustomExceptionJasper extends Exception {

	private static final long serialVersionUID = 1L;
//	 public static Logger log = Logger.getLogger(OrdersController.class.getName());
	
	public CustomExceptionJasper(String message,Throwable cause) {
		super(message,cause);
//		log.error("Error de Generacion de Reports" + cause);
	}

}
