package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        System.out.print("Veuillez entrer un nombre : ");
        nb = scanner.nextInt() ;
        int somme = 0;
        for (int i = 1; i <= nb; i++) {
            somme += i;
        }
        System.out.println("somme = " + somme);
    }
}
