package com.example.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dao.NotaDao;
import com.example.entity.Nota;
import com.example.repository.NotaRepository;

@Component
public class NotaDaoImpl implements NotaDao{
	@Autowired
	private NotaRepository repository;
	
	@Override
	public Nota create(Nota no) {
		// TODO Auto-generated method stub
		return repository.save(no);
	}

	@Override
	public Nota update(Nota no) {
		// TODO Auto-generated method stub
		return repository.save(no);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
