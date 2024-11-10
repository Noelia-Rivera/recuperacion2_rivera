package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CursoDao;
import com.example.entity.Curso;
import com.example.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoDao dao;

	@Override
	public Curso create(Curso cu) {
		// TODO Auto-generated method stub
		return dao.create(cu);
	}

	@Override
	public Curso update(Curso cu) {
		// TODO Auto-generated method stub
		return dao.update(cu);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
