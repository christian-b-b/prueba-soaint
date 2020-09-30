package com.balcorp.app.models.service;

import com.balcorp.app.models.entity.Cliente;

public interface IClienteService {	
	public Cliente save(Cliente cliente);
	public Cliente findById(Long id);
}
