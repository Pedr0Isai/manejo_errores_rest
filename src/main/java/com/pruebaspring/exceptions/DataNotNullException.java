package com.pruebaspring.exceptions;

public class DataNotNullException extends Exception{
	private static final long serialVersionUID = 1384366308549491068L;
	
	public static final String DESCRIPCION = "El dato de busqueda no puede ser nulo";
	
	public DataNotNullException() {
		super(DESCRIPCION);
	}
	
	public DataNotNullException(String detalle) {
		super(DESCRIPCION + ": " + detalle);
	}
}
