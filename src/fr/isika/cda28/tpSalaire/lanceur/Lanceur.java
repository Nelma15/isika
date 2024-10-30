package fr.isika.cda28.tpSalaire.lanceur;

import java.util.Date;

import fr.isika.cda28.tpSalaire.model.ChefProjet;
import fr.isika.cda28.tpSalaire.model.Developpeur;
import fr.isika.cda28.tpSalaire.model.Employe;
import fr.isika.cda28.tpSalaire.model.Personnel;
import fr.isika.cda28.tpSalaire.model.Testeur;

public class Lanceur {

	public static void main(String[] args) {

		Personnel promoCDA28 = new Personnel();

		promoCDA28.ajouteEmploye(new ChefProjet("Lavergne", "Marianne", 32, new Date(2022, 05, 12), 10000));

		promoCDA28.ajouteEmploye(new Developpeur("Merini", "Manel", 32, new Date(2020, 9, 12), 15000));

		promoCDA28.ajouteEmploye(new ChefProjet("Andreux", "Guillaume", 32, new Date(2012, 12, 12), 10000));

		promoCDA28.ajouteEmploye(new Developpeur("Statek", "Anthony", 32, new Date(2010, 2, 7), 15000));
		
		promoCDA28.ajouteEmploye(new Testeur("Tamo", "Raoul", 32, new Date(2002, 06, 22), 500));

		promoCDA28.ajouteEmploye(new Testeur("Gebarzewski", "Solène", 32, new Date(2017, 01, 05), 500));

		promoCDA28.calculerSalaire();

		// on fait le rapport d'activité pour chaque salarié
		System.out.println("Nouveau rapport d'activité avec 25000 lignes de code, 20000€ de chiffre d'affaire et 3 bugs");
		promoCDA28.rapportActiviteEquipe(25000, 20000, 3);
		//On recalcule et on affiche les nouveaux salaires
		promoCDA28.calculerSalaire();
		
	}
}
