package com.lp2.examen.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor  
@Entity
@Table(name = "libro")

public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idLibro;
	@Column(name = "titulo")
	private String titulo;
	@Column(name = "paginas")
	private int paginas;
	@Column(name = "descripcion")
	private String descripcion; 
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_editorial",referencedColumnName = "idEditorial")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Editorial editorial;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_autor",referencedColumnName = "idAutor")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Autor autor;
}
