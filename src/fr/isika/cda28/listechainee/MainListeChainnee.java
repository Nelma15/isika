package fr.isika.cda28.listechainee;

import java.util.LinkedList;
import java.util.List;

public class MainListeChainnee {
	public static void main(String[] args) {
		List<String> animals = new LinkedList<>();
		animals.add("chien");
		animals.add("chat");
		animals.add("canard");
		animals.add("elepahnt");
		animals.add("potame");
		System.out.println("Liste d'animaux  " + animals);
		System.out.println(animals.get(0));
		System.out.println(animals.get(animals.size() - 1));
		System.out.println(animals.get(3));
		animals.set(1, "tigre");
		System.out.println("liste d'animaux mise ajour " + animals);
		animals.remove(3);
		System.out.println("liste d'animaux apres supression  " + animals);
		for (String animal : animals) {
			System.out.println(animal);
			System.out.println(" taille de la liste " + animals.size());
			if (animals.contains("chat")) {
				System.out.println("la liste contient un chat");
			} else {
				System.out.println("la liste ne contient pas de chat");

			}

		}
	}

}
