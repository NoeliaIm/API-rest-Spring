package com.biblioteca.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.rest.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
