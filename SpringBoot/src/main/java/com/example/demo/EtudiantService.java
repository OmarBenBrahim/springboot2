package com.example.demo;

import java.util.List;

public interface EtudiantService {

	Etudiant save(Etudiant e);
	
	Etudiant update(Etudiant e);
	
	void delete(Etudiant e);
	
	void deleteById(Long id);
	
	Etudiant get(Long id);
	
	List<Etudiant> getAll();
}
