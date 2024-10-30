package fr.isika.cda28.tpSalaire.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class MainBinaireObject {

	public static void main(String[] args) {
		List<Tarte> tartes = new ArrayList<>();
		tartes.add(new Tarte(4, "fraise"));
		tartes.add(new Tarte(8, "framboise"));
		tartes.add(new Tarte(1, "chocolat"));
		tartes.add(new Tarte(6, "pamplemousse"));

		try {
			RandomAccessFile raf = new RandomAccessFile("src/mesFichiers/Tartes.bin", "rw");
			for (Tarte tarte : tartes) {
				raf.writeInt(tarte.getNbParts());
				raf.writeChars(tarte.getParfumLong());
			}
			// lire le 3eme objet
			raf.seek(2 * Tarte.TAILLE_TARTE_OCTET);
			Tarte tarte3 = new Tarte();
			
			
			// ou est mon curseur 
			System.out.println(raf.getFilePointer());
			
			
			tarte3.setNbParts(raf.readInt());
			for (int i = 0; i < Tarte.TAILLE_MAX_PARFUM; i++) {
				tarte3.setParfum(tarte3.getParfum() + raf.readChar());
			}
			System.out.println("3eme tarte :" + tarte3.getNbParts() + " " + tarte3.getParfum());

			// nb tarte dans le fichier
			int nObject = (int) raf.length() / Tarte.TAILLE_TARTE_OCTET;
			System.out.println("il y a " + nObject + " tartes dans le fichier ");

			raf.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
