package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
	public static void main(String[] args) {
		int nb = 0;
		Scanner scanner = new Scanner(System.in) ;
		System.out.print("Saisisez un nombre : ");
		nb = scanner.nextInt() ;
		/**
		 * Affiche les 10 nombre suivant
		 */
		for (int i = nb; i <= nb+10; i++) {
			System.out.print(i + " ");
		}
	}
}
