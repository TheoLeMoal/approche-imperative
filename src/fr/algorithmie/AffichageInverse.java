package fr.algorithmie;

public class AffichageInverse {

	public static void main(String[] args) {
		/**
		 * Afficher l’ensemble des éléments du tableau grâce à une boucle
		 */
		
		System.out.println("éléments du tableau grâce à une boucle");
		int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		for (int i : array) {
			System.out.print(i+ " ");
		}
		
		System.out.println("\n------------------------------------------------");
		
		/*
		 * Afficher l’ensemble des éléments dans l’ordre inverse du tableau
		 */
		
		System.out.println("éléments dans l’ordre inverse du tableau");
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]+ " ");
		}
		
		System.out.println("\n------------------------------------------------");
		
		/**
		 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
		 */
		
		int[] arrayCopy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        
        /**
         *  Afficher les éléments de arrayCopy pour vérifier la copie
         */
        System.out.println("Éléments de arrayCopy :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
	}

}
