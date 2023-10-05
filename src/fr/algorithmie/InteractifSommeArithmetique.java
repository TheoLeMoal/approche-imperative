package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		int nb = 0;
		int somme = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Saisisez un nombre : ");
		nb = scanner.nextInt() ;
		/**
		 * Calcule la somme de tous les entiers compris entre 1 et nb
		 */
		for (int i = 1; i <= nb; i++) {
			somme += i; 
		}
		System.out.println("La somme de tous les entiers compris entre 1 et " + nb + " est de " + somme);
	}

}
