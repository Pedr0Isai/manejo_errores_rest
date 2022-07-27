package com.pruebaspring.exceptions;

public class ClientNotFoundException extends Exception {
	private static final long serialVersionUID = -287254515345726338L;
	
	public static final String DESCRIPCION = "Cliente no encontrado";
	
	public ClientNotFoundException() {
		super(DESCRIPCION);
	}
	
	public ClientNotFoundException(String detalle) {
		super(DESCRIPCION + ": " + detalle);
	}
}
