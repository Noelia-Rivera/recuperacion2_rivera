package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.CursoDao;
import com.example.entity.Curso;
import com.example.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao{
	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso create(Curso cu) {
		// TODO Auto-generated method stub
		return repository.save(cu);
	}

	@Override
	public Curso update(Curso cu) {
		// TODO Auto-generated method stub
		return repository.save(cu);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
