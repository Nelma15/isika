package fr.isika.cda28.tpSalaire.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Personnel {

	//List<> c'est une interface
	private List<Employe> salaries;
	
	public Personnel() {
		this.salaries = new LinkedList<Employe>();
	}
	
	public void ajouteEmploye(Employe employe) {
		this.salaries.add(employe);
	}
	
	public void calculerSalaire() {
		for(Employe e : salaries) {
			System.out.println(e.getNom() + " a reçu le salaire de " + e.calculerSalaire() + "€");
		}
	}
	
	public void rapportActiviteEquipe(int nbLignesDeCode, double chiffreAffaire, int nbBugs) {
		for(Employe e : salaries) {
			e.rapportActivite(nbLignesDeCode, chiffreAffaire, nbBugs);
		}
	}
}
