package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "notas")
public class Nota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nota")
	private Long id;
	@Column(name = "nota_1")
	private Double nota_1;
	@Column(name = "nota_2")
	private Double nota_2;
	@Column(name = "nota_3")
	private Double nota_3;
	@Column(name = "promedio")
	private Double promedio;
	
	@ManyToOne
	@JoinColumn(name = "id_alumno", nullable = false)
	private Alumno alumno;
	
	@ManyToOne
	@JoinColumn(name = "id_curso", nullable = false)
	private Curso curso;
}
