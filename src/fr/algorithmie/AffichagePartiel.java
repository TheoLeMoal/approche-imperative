package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3.
        System.out.println("\nAfficher que les entiers supérieurs à 3");
        for (int value: array) {
            if (value > 3){
                System.out.println("value = " + value);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les entiers pairs.
        System.out.println("\nAfficher que les entiers pairs");
        for (int value: array) {
            if (value%2 == 0){
                System.out.println("value = " + value);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
        System.out.println("\n’Afficher que les valeurs correspondant aux index pairs");
        for (int i = 0; i < array.length-1; i++) {
            if (i%2 == 0){
                System.out.println("value = " + array[i]);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("\nAfficher que les entiers impairs");
        for (int value: array) {
            if (value%2 == 1 || value%2 == -1){
                System.out.println("value = " + value);
            }
        }
    }
}
