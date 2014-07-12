package org.nasdanika.amur;


public class AmurException extends RuntimeException {

	public AmurException(String message) {
		super(message);
	}

	public AmurException(Throwable cause) {
		super(cause);
	}

	public AmurException(String message, Throwable cause) {
		super(message, cause);
	}

}
