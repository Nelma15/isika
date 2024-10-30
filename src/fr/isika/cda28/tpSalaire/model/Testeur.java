package fr.isika.cda28.tpSalaire.model;

import java.util.Date;

public class Testeur extends Employe{

	private final int TARIF_BUG = 5;
	private int nbBugs;
	
	
	
	public Testeur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Testeur(String nom, String prenom, int age, Date datePriseDePoste,int nbBugs) {
		super(nom, prenom, age, datePriseDePoste);
		this.nbBugs = nbBugs;
	}

	@Override
	public int calculerSalaire() {
		return nbBugs*TARIF_BUG;
	}

	@Override
	public void rapportActivite(int nbLignesDeCode, double chiffreAffaire, int nbBugs) {
		this.nbBugs = nbBugs;
	}

	public int getNbBugs() {
		return nbBugs;
	}

	public void setNbBugs(int nbBugs) {
		this.nbBugs = nbBugs;
	}

	@Override
	public void afficherRapportActivite() {
		System.out.println("Nombre Bugs corrigés par "+super.getNom()+ " "+super.getPrenom() +" est: "+this.nbBugs);
		
	}
	
	

}
