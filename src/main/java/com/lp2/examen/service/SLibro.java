package com.lp2.examen.service;

import java.util.List;

import com.lp2.examen.model.Libro;

public interface SLibro {
	Libro create (Libro libro);
	List<Libro> readAll();
	Libro read (Long id);
	void delete (Long id);
	Libro update(Libro libro);
}
