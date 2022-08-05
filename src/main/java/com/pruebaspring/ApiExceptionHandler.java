package com.pruebaspring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.pruebaspring.exceptions.BadRequestException;
import com.pruebaspring.exceptions.ClientNotFoundException;
import com.pruebaspring.exceptions.DataNotNullException;
import com.pruebaspring.exceptions.DocumentTypeNotValidException;
import com.pruebaspring.models.entity.ErrorMessage;

@ControllerAdvice
public class ApiExceptionHandler {
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler({ ClientNotFoundException.class })
	@ResponseBody
	public ErrorMessage notFoundRequest(HttpServletRequest request, Exception exception) {
		return new ErrorMessage(HttpStatus.NOT_FOUND.value(), exception, request.getRequestURI());
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler({ Exception.class, DataNotNullException.class, DocumentTypeNotValidException.class,
			NumberFormatException.class, BadRequestException.class })
	@ResponseBody
	public ErrorMessage badRequest(Exception exception) {
		return new ErrorMessage(HttpStatus.BAD_REQUEST.value(), exception, "");
	}
}
