package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;
        System.out.println("nombreAleatoire = " + nombreAleatoire);
        Scanner scanner = new Scanner(System.in) ;
        int nb;
        int count = 0;
        do {
            System.out.print("Veuillez entrer un nombre entre 1 et 100 : ");
            nb = scanner.nextInt();
            count++;
        } while (nb != nombreAleatoire);
        System.out.println("Vous avez gagné en "+count+" coups !");

    }
}
