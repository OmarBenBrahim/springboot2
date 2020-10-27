package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantServiceImpl implements EtudiantService{

	@Autowired
	EtudiantRepository etudiantRepository;

	@Override
	public Etudiant save(Etudiant e) {
		return etudiantRepository.save(e);
	}

	@Override
	public Etudiant update(Etudiant e) {
		return etudiantRepository.save(e);
	}

	@Override
	public void delete(Etudiant e) {
		etudiantRepository.delete(e);
		
	}

	@Override
	public void deleteById(Long id) {
		etudiantRepository.deleteById(id);
		
	}

	@Override
	public Etudiant get(Long id) {
		return etudiantRepository.findById(id).get();
	}

	@Override
	public List<Etudiant> getAll() {
		
		return etudiantRepository.findAll();
	}
	

}
