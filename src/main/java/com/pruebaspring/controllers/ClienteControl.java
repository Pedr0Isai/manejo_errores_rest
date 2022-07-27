package com.pruebaspring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaspring.exceptions.BadRequestException;
import com.pruebaspring.exceptions.ClientNotFoundException;
import com.pruebaspring.exceptions.DataNotNullException;
import com.pruebaspring.exceptions.DocumentTypeNotValidException;
import com.pruebaspring.models.entity.Cliente;
import com.pruebaspring.models.service.IClienteService;

@RestController
public class ClienteControl {
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("/listar")
	public List<Cliente> listar() {
		return clienteService.findAll();
	}
	
	@GetMapping("/buscar/{id}/{tipoDoc}")
	public Cliente buscarCliente(@PathVariable Long id, @PathVariable String tipoDoc) throws DataNotNullException, ClientNotFoundException, DocumentTypeNotValidException{
		if(id == null) {
			throw new DataNotNullException("Número de documento");
		}
		if(tipoDoc == null) {
			throw new DataNotNullException("Tipo de documento");
		}
		String tipoDocLower= tipoDoc.toLowerCase();
		if(tipoDocLower.equals("p") || tipoDocLower.equals("c")) {
			Cliente tmpCliente= clienteService.findCliente(id);
			if(tmpCliente!=null) {
				if(tipoDoc.equals(tmpCliente.getTipoDoc())) {
					return tmpCliente;
				}else {
					throw new ClientNotFoundException("Tipo de documento");
				}
			}else {
				throw new ClientNotFoundException("Número de documento");
			}
		}else {
			throw new DocumentTypeNotValidException();
		}
	}
	
	@GetMapping("/**")
	public void badRequest() throws BadRequestException {
		throw new BadRequestException();
	}
}
