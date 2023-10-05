package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le rang N pour la suite de Fibonacci : ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Le rang N doit être un nombre positif.");
        } else {
            int resultat = calculerFibonacci(n);
            System.out.println("Le nombre de rang N dans la suite de Fibonacci est : " + resultat);
        }

        scanner.close();
    }

    // Méthode récursive pour calculer le nombre de rang N dans la suite de Fibonacci
    public static int calculerFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculerFibonacci(n - 1) + calculerFibonacci(n - 2);
        }
    }
}
