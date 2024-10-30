package fr.isika.cda28.introductionFichiers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExempleCreationFichiers {

	public static void main(String[] args) {

		// java.IO
		// pathname : chemin qui décrit l'adresse du fichier sur le disque dur
		// Chemin absolu (adresse depuis la racine du système
		// D:\CDA28\Reprise_TP_Employes\Salaires\src\mesFichiers
		// Chemin relatif (adresse depuis la racine du projet)
		File rep = new File("src/mesFichiers"); // Classe qui peut contenir des répertoires et des fichiers

		File fichierVide = new File("src/mesFichiers/toto.txt");

		try {
			fichierVide.createNewFile();
		} catch (IOException e) {
			System.out.println("Je n'ai pas réussi à écrire le fichier sur le disque dur");
		}

		File rep2 = new File("src/mesFichiersCreeDepuisJava");
		rep2.mkdir();
		
		System.out.println("Est ce que rep est un répertoire : " + rep.isDirectory());
		System.out.println("Est ce que fichierVide est un répertoire : " + fichierVide.isDirectory());

		// FileWriter
		try {
			// ouvre un flux entre le systeme et le fichier
			FileWriter fw = new FileWriter("src/mesFichiers/premierText.txt", false);

			fw.write("J'écris ma première ligne en java\n");
			fw.write("j'écris une autre ligne\n");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
