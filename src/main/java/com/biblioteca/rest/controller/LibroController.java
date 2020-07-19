package com.biblioteca.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.rest.entity.Libro;
import com.biblioteca.rest.service.LibroService;

@RestController
@RequestMapping("/api")
public class LibroController {
	
	@Autowired
	private LibroService libroService;
	
	@GetMapping("/libros")
	public List <Libro> buscarTodos(){
		 return libroService.buscarTodos();
	}
	
	@GetMapping("/libros/{id}")
	public Optional<Libro> buscarLibro(@PathVariable("id") int idLibro){
		 return libroService.buscarLibro(idLibro);
	}
	
	
	@PostMapping("/libros")
	public Libro guardar(@RequestBody Libro libro) {
		libroService.guardarLibro(libro);
		return libro;
	}
	
	@PutMapping("/libros")
	public Libro modificar(@RequestBody Libro libro) {
		libroService.guardarLibro(libro);
		return libro;
	}
	
	@DeleteMapping("/libros/{id}")
	public String eliminar(@PathVariable("id") Integer idLibro) {
		libroService.eliminarLibro(idLibro);
		return "El libro se ha eliminado.";
	}

}
