package com.pruebaspring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pruebaspring.models.entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente,Long>{

}
