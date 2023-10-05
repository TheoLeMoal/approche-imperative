package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[10];
        int nombreElements = 0;
        while (true) {
            System.out.println("----------------Menu----------------");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    if (nombreElements == tableau.length) {
                        // Si le tableau est plein, agrandir le tableau
                        int nouvelleTaille = tableau.length * 2;
                        int[] nouveauTableau = new int[nouvelleTaille];
                        for (int i = 0; i < tableau.length; i++) {
                        	nouveauTableau[i] = tableau[i];
						}
                        System.out.println("Le tableau a été agrandi à une taille de " + nouvelleTaille + ".");
                        tableau = nouveauTableau;
                    }
                    System.out.print("Entrez un nombre : ");
                    int nombre = scanner.nextInt();
                    tableau[nombreElements] = nombre;
                    nombreElements++;
                    break;
                case 2:
                    System.out.println("Nombres existants :");
                    for (int i = 0; i < nombreElements; i++) {
                        System.out.print(tableau[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Option invalide.");
                    break;
            }
        }
    }
}
