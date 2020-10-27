package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.el.parser.ParseException;

@Controller
public class EtudiantController {

	@Autowired
	EtudiantService etudiantService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "AjoutEtudiant";
	}
	@RequestMapping("/saveProduit")
	public String saveProduit(@ModelAttribute("etudiant") Etudiant etudiant,
	 @RequestParam("date") String date,
	 ModelMap modelMap) throws ParseException, java.text.ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date datenais = dateformat.parse(String.valueOf(date));
	 etudiant.setDatenais(datenais);

	Etudiant saveEtudiant = etudiantService.save(etudiant);
	String msg ="produit enregistré avec Id "+saveEtudiant.getIdEtudiant();
	modelMap.addAttribute("msg", msg);
	return "createProduit";
	}
	
	@RequestMapping("/ListeEtudiant")
	public String listeProduits(ModelMap modelMap)
	{
	List<Etudiant> Etud = etudiantService.getAll();
	modelMap.addAttribute("etudiants", Etud);
	return "listeEtudiant";
	}
	
	@RequestMapping("/supprimerProduit")
	public String supprimerProduit(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	etudiantService.deleteById(id);
	List<Etudiant> etud = etudiantService.getAll();
	modelMap.addAttribute("Etudiant", etud);
	return "listeEtudiant";
	}

	
	}

