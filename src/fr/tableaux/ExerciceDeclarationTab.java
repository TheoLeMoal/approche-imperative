package fr.tableaux;

public class ExerciceDeclarationTab {

	public static void main(String[] args) {
		/**
		 * Déclaration de base
		 */
		int [] myArray = {0,-7,12,1,-2,14,17,9};
		System.out.println(myArray[0]);
		System.out.println(myArray.length);
		System.out.println(myArray[myArray.length-1]);
		/**
		 * System.out.println(myArray[10]);
		 * Cette ligne ne marche pas car il y as que 8 élements dans le tableau
		 */
	}

}
