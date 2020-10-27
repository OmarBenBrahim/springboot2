package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClasseApplicationTests {

	@Autowired
	private EtudiantRepository etudiantRepository;
	@Test
	public void testCreateProduit() {
	Etudiant Etud = new Etudiant("Omar",15.5,new Date());
	etudiantRepository.save(Etud);
	}
	
	@Test
	public void testFindProduit()
	{
	Etudiant e = etudiantRepository.findById(1L).get();
	System.out.println(e);
	}
	@Test
	public void testUpdateProduit()
	{
	Etudiant p = etudiantRepository.findById(1L).get();
	p.setMoy(17.5);
	etudiantRepository.save(p);
	}
	@Test
	public void testDeleteProduit()
	{
	etudiantRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousProduits()
	{
	List<Etudiant> Etud = etudiantRepository.findAll();
	for (Etudiant e : Etud)
	{
	System.out.println(e);
	}
	}


}
