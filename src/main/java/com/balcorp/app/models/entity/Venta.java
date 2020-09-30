package com.balcorp.app.models.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVenta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	private DetalleVenta detalleVenta; 
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	

	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(Long idVenta, Cliente cliente, DetalleVenta detalleVenta, Date fecha) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
//		this.detalleVenta = detalleVenta;
		this.fecha = fecha;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

//	public DetalleVenta getDetalleVenta() {
//		return detalleVenta;
//	}
//
//	public void setDetalleVenta(DetalleVenta detalleVenta) {
//		this.detalleVenta = detalleVenta;
//	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

//	@Override
//	public String toString() {
//		return "Venta [idVenta=" + idVenta + ", cliente=" + cliente + ", detalleVenta=" + detalleVenta + ", fecha="
//				+ fecha + "]";
//	}
	
		
	
}
