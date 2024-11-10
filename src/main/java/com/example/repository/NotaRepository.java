package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long>{

}
