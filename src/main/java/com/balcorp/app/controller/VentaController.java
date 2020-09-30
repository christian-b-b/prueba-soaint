package com.balcorp.app.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.balcorp.app.models.entity.Cliente;

import com.balcorp.app.models.entity.Venta;
import com.balcorp.app.models.service.IClienteService;
import com.balcorp.app.models.service.IVentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
	@Autowired
	private IVentaService ventaService;

	@Autowired
	private IClienteService clienteService;

	@PostMapping("/registro/{clienteId}/fecha/{fecha}")
	@ResponseStatus(HttpStatus.CREATED)
	public Venta registro(@PathVariable Long clienteId,@PathVariable String fecha) {
		Cliente cliente = clienteService.findById(clienteId);
		Venta venta = new Venta();

		
		DateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		Date fechaConvertida;
		try {
			fechaConvertida = formateador.parse(fecha);
			venta.setFecha(fechaConvertida);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		venta.setCliente(cliente);
		
		return ventaService.save(venta);
	}
}
