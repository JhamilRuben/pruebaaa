package com.lp2.examen.service;

import java.util.List;


import com.lp2.examen.model.Editorial;

public interface SEditorial {
	Editorial create (Editorial editorial);
	List<Editorial> readAll();
	Editorial read (Long id);
	void delete (Long id);
	Editorial update(Editorial editorial);
}
