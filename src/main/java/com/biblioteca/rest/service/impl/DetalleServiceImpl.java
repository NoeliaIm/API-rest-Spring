package com.biblioteca.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.rest.entity.Detalle;
import com.biblioteca.rest.repository.DetalleRepository;
import com.biblioteca.rest.service.DetalleService;

@Service
public class DetalleServiceImpl implements DetalleService {
	
	@Autowired
	private DetalleRepository repoDetalle;
	
	@Override
	public void guardar(Detalle detalle) {
		// TODO Auto-generated method stub
		repoDetalle.save(detalle);

	}

}
