package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.entity.Curso;

public interface CursoDao {
	Curso create(Curso cu);
	Curso update(Curso cu);
	void delete(Long id);
	Optional<Curso> read(Long id);
	List<Curso> readAll();
}
