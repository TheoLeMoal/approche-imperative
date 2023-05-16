package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int[] array = new int[10];
        //On récupère les valeurs
        for (int i = 0; i < 10; i++) {
            System.out.print("Veuillez entrer un nombre : ");
            nb = scanner.nextInt() ;
            array[i] = nb;
        }
        //On récupère la valeur max
        int valeurMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > valeurMax) {
                valeurMax = array[i];
            }
        }
        System.out.println("valeurMax = " + valeurMax);
    }
}
