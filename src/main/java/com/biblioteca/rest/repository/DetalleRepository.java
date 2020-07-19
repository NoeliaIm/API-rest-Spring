package com.biblioteca.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.rest.entity.Detalle;

public interface DetalleRepository extends JpaRepository<Detalle, Integer> {

}
