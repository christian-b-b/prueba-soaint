package com.balcorp.app.controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balcorp.app.models.entity.Cliente;
import com.balcorp.app.models.service.IClienteService;

@RestController
@RequestMapping(value = "/cliente",produces = "application/json")
public class ClienteController {
	@Autowired
	private IClienteService clienteService;
	
	private static final Logger logger = LogManager.getLogger(ClienteController.class);
	
	@PostMapping("/registrar")
	public Cliente registro(@RequestBody Cliente cliente) {
		logger.info("Iniciando con registro de clientes");
		return clienteService.save(cliente);
		
	}
	
}
