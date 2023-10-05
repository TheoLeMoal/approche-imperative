package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

    public static void main(String[] args) {
    	int maxNumber = 100;
    	int minNumber = 1;
        Random rand = new Random();
        int nbAleatoire = rand.nextInt(maxNumber) + minNumber;
        int nbEssais = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devinez le nombre entre "+ minNumber+ " et " + maxNumber +".");

        while (true) {
            System.out.print("Entrez votre proposition : ");
            int proposition = scanner.nextInt();
            if (proposition < 1 || proposition > 100) {
                System.out.println("Votre proposition doit être comprise entre "+ minNumber+ " et " + maxNumber +".");
            } else if (proposition < nbAleatoire) {
                System.out.println("Le nombre recherché est plus grand.");
                nbEssais++;
            } else if (proposition > nbAleatoire) {
                System.out.println("Le nombre recherché est plus petit.");
                nbEssais++;
            } else {
                System.out.println("Bravo, vous avez trouvé en " + nbEssais + " coups !");
                nbEssais++;
                break;
            }
        }

        scanner.close();
    }

}
