package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        //Déclarez un tableau d’entiers contenant tous les entiers de 1 à 10.
        int[] nombres = new int[10];
        for(int i = 0; i < 10; i++){
            nombres[i] = i+1;
        }
        //Affichez le premier élément du tableau.
        System.out.println("1er element = " + nombres[0]);
        //Affichez la longueur du tableau en utilisant la propriété length.
        System.out.println("nombres.length = " + nombres.length);
        //Affichez le dernier élément du tableau en utilisant la propriété length.
        System.out.println("nombres[nombres.length-1] = " + nombres[nombres.length-1]);
        //Modifiez la valeur de l’élément d’index 4 et donnez lui la valeur 8.
        nombres[4] = 8;
        System.out.println("nombres[4] = " + nombres[4]);
    }
}
