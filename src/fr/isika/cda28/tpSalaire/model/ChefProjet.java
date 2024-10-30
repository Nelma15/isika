package fr.isika.cda28.tpSalaire.model;

import java.util.Date;

public class ChefProjet extends Employe{

	private final int PRIME = 400;
	private double chiffreAffaireMensuel;
	
	public ChefProjet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChefProjet(String nom, String prenom, int age, Date datePriseDePoste, double chiffreAffaireMensuel) {
		super(nom, prenom, age, datePriseDePoste);
		this.chiffreAffaireMensuel = chiffreAffaireMensuel;
	}

	@Override
	public int calculerSalaire() {
		return (int)(this.chiffreAffaireMensuel*0.20+PRIME);
	}

	@Override
	public void rapportActivite(int nbLignesDeCode, double chiffreAffaire, int nbBugs) {
		this.chiffreAffaireMensuel=chiffreAffaire;
	}

	public double getChiffreAffaireMensuel() {
		return chiffreAffaireMensuel;
	}

	public void setChiffreAffaireMensuel(double chiffreAffaireMensuel) {
		this.chiffreAffaireMensuel = chiffreAffaireMensuel;
	}

	public int getPRIME() {
		return PRIME;
	}

	@Override
	public void afficherRapportActivite() {
		System.out.println("Le Chiffre d'affaires de "+super.getNom()+ " "+super.getPrenom() +" est: "+this.chiffreAffaireMensuel+" €");
		
	}
	
	
	
}
