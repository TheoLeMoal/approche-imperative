package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
	public static void main(String[] args) {
		int nb = 0;
		boolean verif = false;
		while(verif == false) {
			Scanner scanner = new Scanner(System.in) ;
			nb = scanner.nextInt() ;
			if (nb >= 1 && nb <= 10) {
				verif = true;
			}
		}
		for (int i = 1; i <= 10; i++) {
			System.out.println(nb + " * " + i + " = " + nb*i);
		}
	}
}
