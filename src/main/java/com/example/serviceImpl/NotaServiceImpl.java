package com.example.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.NotaDao;
import com.example.entity.Nota;
import com.example.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{
	@Autowired
	private NotaDao dao;

	@Override
	public Nota create(Nota no) {
		// TODO Auto-generated method stub
		return dao.create(no);
	}

	@Override
	public Nota update(Nota no) {
		// TODO Auto-generated method stub
		return dao.update(no);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
