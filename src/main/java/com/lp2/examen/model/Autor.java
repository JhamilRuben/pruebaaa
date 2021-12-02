package com.lp2.examen.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor  
@Entity
@Table(name = "autor")

public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAutor;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellidos")
	private String apellidos;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autor")
	private List<Libro> libro;
}