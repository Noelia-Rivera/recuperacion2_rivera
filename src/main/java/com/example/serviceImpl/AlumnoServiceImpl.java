package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AlumnoDao;
import com.example.entity.Alumno;
import com.example.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	@Autowired
	private AlumnoDao dao;
	
	@Override
	public Alumno create(Alumno al) {
		// TODO Auto-generated method stub
		return dao.create(al);
	}

	@Override
	public Alumno update(Alumno al) {
		// TODO Auto-generated method stub
		return dao.update(al);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
