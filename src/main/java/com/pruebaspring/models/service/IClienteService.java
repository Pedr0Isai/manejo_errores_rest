package com.pruebaspring.models.service;

import java.util.List;

import com.pruebaspring.models.entity.Cliente;

public interface IClienteService {
	public Cliente findCliente(Long id);
	public List<Cliente> findAll();
}
