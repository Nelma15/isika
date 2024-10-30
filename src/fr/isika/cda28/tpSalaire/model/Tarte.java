package fr.isika.cda28.tpSalaire.model;

public class Tarte {
	public static int TAILLE_MAX_PARFUM =12;
	public static int TAILLE_TARTE_OCTET= 4 + 2*TAILLE_MAX_PARFUM ;
	private int nbParts;
	String parfum;

	public Tarte() {
		super();
		this.parfum= "";
	}

	public Tarte(int nbParts, String parfum) {
		super();
		this.nbParts = nbParts;
		this.parfum = parfum;
	}
	public String getParfumLong() {
		String parfumLong = parfum;
		if(parfumLong.length()<TAILLE_MAX_PARFUM) {
		for(int i = parfum.length(); i<TAILLE_MAX_PARFUM; i++) 
			parfumLong+="*";
		
		}else {
			parfumLong = parfumLong.substring(0, TAILLE_MAX_PARFUM);
			
		}
		return parfumLong;
		
			
	
	}

	public int getNbParts() {
		return nbParts;
	}

	public void setNbParts(int nbParts) {
		this.nbParts = nbParts;
	}

	public String getParfum() {
		return parfum;
	}

	public void setParfum(String parfum) {
		this.parfum = parfum;
	}

}
