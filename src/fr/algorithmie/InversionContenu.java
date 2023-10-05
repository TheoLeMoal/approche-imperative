package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		/**
		 * Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais 
		 * dans l’ordre inverse.
		 */
		int[] arrayCopy = new int[array.length];
		int index = 0;
        for (int i = array.length-1; i >= 0; i--) {
            arrayCopy[index] = array[i];
            index++;
        }
        /**
         * Afficher l’ensemble des éléments des 2 tableaux
         */
        System.out.println("Éléments de arrayCopy :");
        for (int i : arrayCopy) {
			System.out.println(i);
		}
		System.out.println("------------------------------------------------");
        System.out.println("Éléments de array :");
        for (int i : array) {
			System.out.println(i);
		}
	}
}
