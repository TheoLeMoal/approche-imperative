package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		int[] tabNb = new int[10];
		int maxNb = 0;
		for (int i = 0; i < tabNb.length; i++) {
			Scanner scanner = new Scanner(System.in) ;
			int nb = scanner.nextInt() ;
			tabNb[i] = nb;
		}
		for (int i : tabNb) {
			if (maxNb < i) {
				maxNb = i;
			}
			
		}
		System.out.println(maxNb);
	}

}
