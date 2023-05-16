package fr.algorithmie;

public class RechercheMax {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Rechercher le plus grand élément du tableau
        int valeurMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > valeurMax) {
                valeurMax = array[i];
            }
        }
        System.out.println("valeurMax = " + valeurMax);
    }
}
