package fr.isika.cda28.tpSalaire.model;

import java.util.Date;

public class Developpeur extends Employe{

	//attributs
	private final double VALEUR_LIGNE_CODE = 0.50;
	private int nombreLignesDeCode;
	
	
	
	public Developpeur() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Developpeur(String nom, String prenom, int age, Date datePriseDePoste, int nombreLigneDeCode) {
		super(nom, prenom, age, datePriseDePoste);
		this.nombreLignesDeCode = nombreLigneDeCode;
	}



	@Override
	public int calculerSalaire() {
		return (int)(this.nombreLignesDeCode*VALEUR_LIGNE_CODE);
	}



	@Override
	public void rapportActivite(int nbLignesDeCode, double chiffreAffaire, int nbBugs) {
		this.nombreLignesDeCode=nbLignesDeCode;
	}



	public int getNombreLignesDeCode() {
		return nombreLignesDeCode;
	}



	public void setNombreLignesDeCode(int nombreLignesDeCode) {
		this.nombreLignesDeCode = nombreLignesDeCode;
	}



	@Override
	public void afficherRapportActivite() {
		System.out.println("Ligne ecrite par "+super.getNom()+ " "+super.getPrenom() +" est: "+this.nombreLignesDeCode);
		
	}

	



}
