package fr.isika.cda28.listechainee;

import java.util.Date;

import fr.isika.cda28.tpSalaire.model.ChefProjet;
import fr.isika.cda28.tpSalaire.model.Developpeur;
import fr.isika.cda28.tpSalaire.model.Employe;
import fr.isika.cda28.tpSalaire.model.Testeur;

public class Lanceurtestlistechainee {

	public static void main(String[] args) {
		// on cree un exemple avec une liste chainee contenat 3 cellules 
		//1ere cellule :(new ChefProjet("Andreux", "Guillaume", 32, new Date(2012, 12, 12), 10000));
		//2ème cellule : new Developpeur("Statek", "Anthony", 32, new Date(2010, 2, 7), 15000);
		//3ème cellule : new Testeur("Tamo", "Raoul", 32, new Date(2002, 06, 22), 500);

	
	Cellule maPremiereCellule = new Cellule(new ChefProjet("Andreux", "Guillaume", 32, new Date(2012, 12, 12), 10000));
	System.out.println("salaire de "+  maPremiereCellule.valeur.getNom()+" = "+  maPremiereCellule.valeur.calculerSalaire());
	maPremiereCellule.add(new Developpeur("Statek", "Anthony", 32, new Date(2010, 2, 7), 15000));
	maPremiereCellule.add( new Testeur("Tamo", "Raoul", 32, new Date(2002, 06, 22), 500));
	maPremiereCellule.add(new Developpeur ("Merini", "Manel", 32, new Date(2020, 9, 12), 15000));
	
	System.out.println("Salaire de " +maPremiereCellule.valeur.getNom() +" = "+ maPremiereCellule.valeur.calculerSalaire());
	System.out.println("Salaire de " +maPremiereCellule.getSuivant().valeur.getNom() +" = "+ maPremiereCellule.getSuivant().valeur.calculerSalaire());
	System.out.println("Salaire de " +maPremiereCellule.getSuivant().getSuivant().valeur.getNom() +" = "+ maPremiereCellule.getSuivant().getSuivant().valeur.calculerSalaire());
	System.out.println("Salaire de " +maPremiereCellule.getSuivant().getSuivant().getSuivant().valeur.getNom() +" = "+ maPremiereCellule.getSuivant().getSuivant().getSuivant().valeur.calculerSalaire());
	System.out.println(maPremiereCellule);
	System.out.println(maPremiereCellule.size());
	System.out.println(maPremiereCellule.contains("Statek","Anthony"));
	maPremiereCellule.rapportAcitiviteEquipe(25000, 20000, 3);
	maPremiereCellule.afficher();
	
	}



	

}
