package com.pruebaspring.exceptions;

public class BadRequestException extends Exception {
	private static final long serialVersionUID = -198083632024401610L;

	public static final String DESCRIPCION = "Petición incorrecta";

	public BadRequestException() {
		super(DESCRIPCION);
	}

	public BadRequestException(String detalle) {
		super(DESCRIPCION + ": " + detalle);
	}
}