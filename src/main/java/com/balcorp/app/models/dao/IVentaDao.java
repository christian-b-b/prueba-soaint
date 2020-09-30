package com.balcorp.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.balcorp.app.models.entity.Venta;

public interface IVentaDao extends CrudRepository<Venta, Long> {

}
