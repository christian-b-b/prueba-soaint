package com.balcorp.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balcorp.app.models.entity.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long>{

}
