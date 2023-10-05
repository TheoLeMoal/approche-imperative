package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

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
		System.out.println("Le nombre choisie est : " + nb);
	}

}
