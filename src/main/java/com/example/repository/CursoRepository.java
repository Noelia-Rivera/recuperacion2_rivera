package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
