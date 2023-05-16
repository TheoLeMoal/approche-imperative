package fr.algorithmie;
public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy mais dans l’ordre inverse.
        int[] arrayCopy = new int[array.length];
        int index = 0;
        for (int i = array.length-1; i > 0; i--) {
            arrayCopy[index] = array[i];
            index++;
        }
        //Afficher l’ensemble des éléments des 2 tableaux
        System.out.println("\nValeur de array :");
        for (int value: array) {
            System.out.println("value = " + value);
        }
        System.out.println("\nValeur de arrayCorpy :");
        for (int value: arrayCopy) {
            System.out.println("value = " + value);
        }
    }
}
