package com.balcorp.app.models.service;

import com.balcorp.app.models.entity.Venta;

public interface IVentaService {
	public Venta findById(Long id);
	public Venta save(Venta venta);
}
