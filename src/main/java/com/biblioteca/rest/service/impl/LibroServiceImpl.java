package com.biblioteca.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.rest.entity.Libro;
import com.biblioteca.rest.repository.LibroRepository;
import com.biblioteca.rest.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService {
	
	@Autowired
	private LibroRepository repoLibro;

	@Override
	public List<Libro> buscarTodos() {
		
		return repoLibro.findAll();
	}

	@Override
	public void guardarLibro(Libro libro) {
		// TODO Auto-generated method stub
		repoLibro.save(libro);
	}

	@Override
	public void eliminarLibro(int idLibro) {
		// TODO Auto-generated method stub
		repoLibro.deleteById(idLibro);
		
	}

	@Override
	public Optional<Libro> buscarLibro(int idLibro) {
		// TODO Auto-generated method stub
		 return repoLibro.findById(idLibro);
		
	}

}
