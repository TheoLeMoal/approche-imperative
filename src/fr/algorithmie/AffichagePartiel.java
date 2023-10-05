package fr.algorithmie;

public class AffichagePartiel {
	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		
		/**
		 * Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		 */
		
		System.out.println("Affichage des entier supérieur a 3");
		for (int i : array) {
			if (i > 3) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n------------------------------------------------");
		
		/**
		 * Combiner une boucle et un test de manière à n’afficher que les entiers pairs
		 */
		
		System.out.println("Affichage des entier pairs");
		for (int i : array) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n------------------------------------------------");
		
		/**
		 * Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant 
		 * aux index pairs
		 */
		
		System.out.println("Affichage des valeurs correspondant aux index pairs");
		for (int i = 0; i < array.length; i++) {
			if (i%2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		
		System.out.println("\n------------------------------------------------");
		
		/**
		 * Combiner une boucle et un test de manière à n’afficher que les entiers impairs
		 */
		
		System.out.println("Affichage des entier impairs");
		for (int i : array) {
			if (i%2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}
