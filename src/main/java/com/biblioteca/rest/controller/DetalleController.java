package com.biblioteca.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.rest.entity.Detalle;
import com.biblioteca.rest.service.DetalleService;

@RestController
@RequestMapping("/api")
public class DetalleController {
	
	@Autowired
	private DetalleService detalleService;

	@PostMapping("/detalles")
	public Detalle guardar(@RequestBody Detalle detalle) {
		detalleService.guardar(detalle);
		return detalle;
	}
}
