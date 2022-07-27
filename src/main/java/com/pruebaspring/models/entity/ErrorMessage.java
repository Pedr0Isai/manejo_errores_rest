package com.pruebaspring.models.entity;

public class ErrorMessage {
	private Integer status;
	private String exception;
	private String message;
	private String path;

	public ErrorMessage(Integer status, Exception exception, String path) {
		this(status, exception.getClass().getSimpleName(), exception.getMessage(), path);
	}

	public ErrorMessage(Integer status, String exception, String message, String path) {
		this.status = status;
		this.exception = exception;
		this.message = message;
		this.path = path;
	}

	public Integer getStatus() {
		return this.status;
	}

	public String getException() {
		return this.exception;
	}

	public String getMessage() {
		return this.message;
	}

	public String getPath() {
		return this.path;
	}

	@Override
	public String toString() {
		return String.format("ErrorMessage [codigo=%s, exception=%s, message=%s, path=%s]", status, exception, message,
				path);
	}
	
}
