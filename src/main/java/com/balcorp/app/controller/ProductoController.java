package com.balcorp.app.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.balcorp.app.models.entity.Producto;
import com.balcorp.app.models.service.IProductoService;

@RestController
@RequestMapping(value = "/producto",produces = "application/json")
public class ProductoController {
	
	private static final Logger logger = LogManager.getLogger(ClienteController.class);
	
	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto>listar(){
		logger.info("Iniciando con listado de productos");
		return productoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		logger.info("Iniciando con busqueda de producto");
		return productoService.findById(id);
	}
	
	@PostMapping("/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto crear(@RequestBody Producto producto) {
		logger.info("Iniciando con registro de producto");
		return productoService.save(producto);
		
	}
	
	@PutMapping("/editar/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto editar(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoDb = productoService.findById(id);
		
		productoDb.setNombre(producto.getNombre());
        productoDb.setPrecio(producto.getPrecio());
        
        logger.info("Iniciando actualizacion de producto");
        return productoService.save(productoDb);
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Long id) {
		logger.info("Iniciando eliminacion de producto");
		productoService.deleteById(id);
	}
}
