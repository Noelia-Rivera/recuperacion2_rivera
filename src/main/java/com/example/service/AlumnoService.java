package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Alumno;

public interface AlumnoService {
	Alumno create(Alumno al);
	Alumno update(Alumno al);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
