package com.biblioteca.rest.service;

import java.util.List;
import java.util.Optional;

import com.biblioteca.rest.entity.Libro;

public interface LibroService {

	List<Libro> buscarTodos();

	public void guardarLibro(Libro libro);
	
	public void eliminarLibro(int idLibro);
	
	public Optional<Libro> buscarLibro(int idLibro);

}
