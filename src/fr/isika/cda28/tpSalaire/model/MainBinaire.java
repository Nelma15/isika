package fr.isika.cda28.tpSalaire.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MainBinaire {

	public static void main(String[] args) {
		// RandomAccesFile

		RandomAccessFile raf;
		try {
			raf = new RandomAccessFile("src/mesFichiers/binaire.bin", "rw");
			// ecriture

			int[] tab = { 1234, 5678, 908, 543, 432 };
			for (int i = 0; i < 5; i++) {
				raf.writeInt(tab[i]);
			}
			String s = "toto";
			raf.writeChars(s);

			// taille = 5 * 4 + 4 * 2 = 28 octets

			System.out.println("taille fichier " + raf.length());
			//lecture 
			//remets le curseur au debut du fichier 
			raf.seek(0);
			for(int i = 0; i<5;i++) {
				System.out.println(raf.readInt());
			}
			String slue ="";
			for(int i =0 ;i<s.length();i++ ) {
				slue+= raf.readChar();
			}
			System.out.println(slue);

			raf.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
