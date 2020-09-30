package com.balcorp.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balcorp.app.models.entity.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long> {

}
