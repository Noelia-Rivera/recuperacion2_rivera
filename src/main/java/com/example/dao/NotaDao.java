package com.example.dao;

import java.util.List;
import java.util.Optional;

import com.example.entity.Nota;

public interface NotaDao {
	Nota create(Nota no);
	Nota update(Nota no);
	void delete(Long id);
	Optional<Nota> read(Long id);
	List<Nota> readAll();
}
