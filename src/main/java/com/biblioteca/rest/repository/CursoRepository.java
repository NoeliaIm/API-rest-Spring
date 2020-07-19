package com.biblioteca.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.rest.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
