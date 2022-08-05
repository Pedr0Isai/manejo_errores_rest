package com.pruebaspring.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pruebaspring.models.dao.ClienteDao;
import com.pruebaspring.models.entity.Cliente;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private ClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public Cliente findCliente(Long id) {
		Cliente tmpCliente = clienteDao.findById(id).orElse(null);
		return tmpCliente;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
}
