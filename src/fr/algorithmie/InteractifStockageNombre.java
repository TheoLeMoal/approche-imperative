package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        String menu = "1. Ajouter un nombre\n2. Afficher les nombres existants.\n3. Exit";
        int[] array = new int[0];
        int[] temp = array;
        System.out.println(menu);
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int number;
        do {
            System.out.print("Saisir une instruction (code) : ");
            nb = scanner.nextInt() ;
            switch (nb) {
                case (1):
                    System.out.print("Saisir un nombre a ajouter : ");
                    number = scanner.nextInt();
                    int[] newArray = new int[array.length + 1];
                    temp = array;
                    array = newArray;
                    for (int i = 0; i < temp.length; i++) {
                        array[i] = temp[i];
                    }
                    array[array.length-1] = number;
                    break;
                case (2):
                    for (int value: array) {
                        System.out.println("value = " + value);
                    }
                    break;
                default:
                    break;
            }
        }while (nb != 3);

    }
}
