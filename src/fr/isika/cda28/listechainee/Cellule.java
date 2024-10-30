package fr.isika.cda28.listechainee;

import fr.isika.cda28.tpSalaire.model.Employe;

public class Cellule {
	// attribues
	Employe valeur;
	Cellule suivant;

	// constructeurs
	public Cellule(Employe valeur) {
		super();
		this.valeur = valeur;
		this.suivant = null;
	}

	// getters et setters
	public Employe getValeur() {
		return valeur;
	}

	public void setValeur(Employe valeur) {
		this.valeur = valeur;
	}

	public Cellule getSuivant() {
		return suivant;
	}

	public void setSuivant(Cellule suivant) {
		this.suivant = suivant;
	}

	// methodes specifiques
	public void add(Employe nouvelEmploye) {
		if (this.suivant != null) {
			this.suivant.add(nouvelEmploye);
		} else {
			this.suivant = new Cellule(nouvelEmploye);
		}
	}

	@Override
	public String toString() {
		if (this.suivant != null) {
			return "(" + this.valeur.getPrenom() + ")->" + this.suivant.toString();
		} else {
			return "(" + this.valeur.getPrenom() + ")->" + "x";
		}

	}

	public int size() {
		if (this.suivant != null) {

			return this.suivant.size() + 1;
		}
		return 1;
	}

	public boolean contains(String nom, String prenom) {
		if (this.valeur.getNom().equals(nom) && this.valeur.getPrenom().equals(prenom)) {
			return true;
		} else if(this.suivant!= null) {
			return this.suivant.contains(nom, prenom);

		}else {
			return false;
		}

	}
	
	public void rapportAcitiviteEquipe(int nbLigneDeCode, double chiffreAffaire,int nbBug) {
		// met a jour le rapport d'activite de tous les employe de la liste chainee
		if (this.suivant != null) { //tant qu'on est pas a la fin et qu'il y a une cellule suivante alors 
			valeur.rapportActivite(nbLigneDeCode, chiffreAffaire, nbBug); // on affiche la valeur de la cellule courant 
			suivant.rapportAcitiviteEquipe(nbLigneDeCode, chiffreAffaire, nbBug); //on appel la methode sur la cellule suivante
		}
		else {
			valeur.rapportActivite(nbLigneDeCode, chiffreAffaire, nbBug); // on est arrivé a la dernière cellule on afficher la valeur
		}
	}
	
	// méthode pour afficher les rapport d'activité
	public void afficher() {
		// TODO Auto-generated method stub
		if(suivant!=null) { //tant qu'on est pas a la fin et qu'il y a une cellule suivante alors  
			valeur.afficherRapportActivite(); // on affiche le rapport de la cellule courant
			suivant.afficher(); // on appel la methode afficher sur la cellule suivante
		}
		else {
			valeur.afficherRapportActivite(); // on est arrivée a la dernière cellule le rapport de la cellule
		}
	}

}
