package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        int nbElementsCommun = 0;

        /**
         * On cherche les élément en commun
         */
        for (int value1 : array1) {
            for (int value2 : array2) {
                if (value1 == value2) {
                	nbElementsCommun++;
                    break;
                }
            }
        }

        /**
         * Afficher le nombre d'éléments en commun
         */
        System.out.println("Nombre d'éléments en communs : " + nbElementsCommun);
	}

}
