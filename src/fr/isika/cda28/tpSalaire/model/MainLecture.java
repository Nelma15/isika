package fr.isika.cda28.tpSalaire.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainLecture {

	public static void main(String[] args) {
		// object pour lire un fichier
		try {
			FileReader fr = new FileReader("src/mesFichiers/premierText.txt");
			BufferedReader br = new BufferedReader(fr);
			String lignes = "";

			// tant que buffered a quelques chose a lire
			// lis la ligne et concatene la dans String lignes

			while (br.ready()) {
				lignes += br.readLine();
				lignes += "\n"; // pour revenir a la ligne 
			}
			System.out.println(lignes);
			

			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
