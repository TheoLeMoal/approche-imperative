package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //Afficher l’ensemble des éléments du tableau grâce à une boucle.
        System.out.println("Afficher l’ensemble des éléments du tableau grâce à une boucle. \n");
        for (int value : array) {
            System.out.println("value = " + value);
        }
        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau.
        System.out.println("Afficher l’ensemble des éléments dans l’ordre inverse du tableau. \n");
        for (int i = array.length-1; i > 0 ; i--) {
            System.out.println("array["+i+"] = " + array[i]);
        }
        System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3 \n");
        for (int value : array) {
            if (value > 3){
                System.out.println("value = " + value);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers pairs \n");
        for (int value : array) {
            if (value%2 == 0){
                System.out.println("value = " + value);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        System.out.println("Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs \n");
        for (int i = 0; i < array.length-1 ; i++) {
            if (i%2 == 0 && i != 0){
                System.out.println("i = " + i);
            }
        }
        //Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        System.out.println("Combiner une boucle et un test de manière à n’afficher que les entiers impairs \n");
        for (int value : array) {
            if (value%2 == 1 || value%2 == -1){
                System.out.println("value = " + value);
            }
        }
    }
}
