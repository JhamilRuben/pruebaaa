package com.lp2.examen.service;

import java.util.List;

import com.lp2.examen.model.Autor;

public interface SAutor {
	Autor create (Autor autor);
	List<Autor> readAll();
	Autor read (Long id);
	void delete (Long id);
	Autor update(Autor autor);
}
