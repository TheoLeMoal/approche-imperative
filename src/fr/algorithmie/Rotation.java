package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array =  {0,1,2,3};
        int dernierElement = array[array.length - 1];
        
        /**
         * On inverse l'ordre du tableau
         */
        
        for (int i = array.length - 1; i > 0; i--) {
        	array[i] = array[i - 1];
        }
        
        /**
         * On change le premier element du tableau
         */
        
        array[0] = dernierElement;
        
        /**
         * On affiche les elements du tableau
         */
        
        for (int i : array) {
			System.out.println(i + " ");
		}
	}

}
