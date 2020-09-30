package com.balcorp.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balcorp.app.models.entity.Venta;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaService ventaService;

	@Override
	public Venta findById(Long id) {
		// TODO Auto-generated method stub
		return ventaService.findById(id);
	}

	@Override
	public Venta save(Venta venta) {
		// TODO Auto-generated method stub
		System.out.println(venta.toString());
		return ventaService.save(venta);
	}

	
	
	

}
