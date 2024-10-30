package fr.isika.cda28.tpSalaire.model;

import java.util.Date;

public abstract class Employe {
	
	//attributs
	private String nom;
	private String prenom;
	private int age;
	private Date datePriseDePoste;
	
	
	//constructeurs	
	public Employe() {
		super();
	}
	
	public Employe(String nom, String prenom, int age, Date datePriseDePoste) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.datePriseDePoste = datePriseDePoste;
	}

	//getters & setters
	
	public String getNom() {
		return  nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDatePriseDePoste() {
		return datePriseDePoste;
	}

	public void setDatePriseDePoste(Date datePriseDePoste) {
		this.datePriseDePoste = datePriseDePoste;
	}
	
	//méthodes spécifiques
	
	public abstract int calculerSalaire();
	public abstract void rapportActivite(int nbLignesDeCode, double chiffreAffaire, int nbBugs);
	public abstract void afficherRapportActivite();
	
}
