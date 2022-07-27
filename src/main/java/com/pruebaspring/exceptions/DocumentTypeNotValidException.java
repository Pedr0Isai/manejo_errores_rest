package com.pruebaspring.exceptions;

public class DocumentTypeNotValidException extends Exception{
	private static final long serialVersionUID = -3378116176739464355L;
	
	public static final String DESCRIPCION = "Tipo de documento no valido";
	
	public DocumentTypeNotValidException() {
		super(DESCRIPCION);
	}
	
	public DocumentTypeNotValidException(String detalle) {
		super(DESCRIPCION + ": " + detalle);
	}
	
}
