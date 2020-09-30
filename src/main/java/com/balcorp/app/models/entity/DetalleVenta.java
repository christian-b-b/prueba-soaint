package com.balcorp.app.models.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "detalles_ventas")
public class DetalleVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalleVenta;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Venta> ventas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	

	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(Long idDetalleVenta, List<Venta> ventas, Producto producto) {
		super();
		this.idDetalleVenta = idDetalleVenta;
		this.ventas = ventas;
		this.producto = producto;
	}

	public Long getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Long idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetalleVenta [idDetalleVenta=" + idDetalleVenta + ", ventas=" + ventas + ", producto=" + producto + "]";
	}
	
		
	
}
