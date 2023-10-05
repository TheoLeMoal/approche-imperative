package fr.algorithmie;

import java.util.Scanner;

public class Interactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batonsRestants = 21;
        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Vous jouez contre l'ordinateur. Vous pouvez retirer 1, 2 ou 3 bâtons à chaque tour.");
        // Si true, c'est le tour du joueur, sinon, c'est le tour de l'ordinateur
        boolean tourJoueur = true; 
        while (batonsRestants > 0) {
            System.out.println("\nBâtons restants : " + batonsRestants);

            if (tourJoueur) {
                System.out.print("Combien de bâtons souhaitez-vous retirer (1, 2 ou 3) ? ");
                int choixJoueur = scanner.nextInt();

                if (choixJoueur >= 1 && choixJoueur <= 3) {
                    batonsRestants -= choixJoueur;
                    tourJoueur = false;
                } else {
                    System.out.println("Choix invalide. Vous devez retirer entre 1 et 3 bâtons.");
                }
            } else {
                // L'ordinateur essaie de forcer le joueur à prendre le dernier bâton
            	int choixOrdinateur = 0;
                if (batonsRestants <= 4) {
                	choixOrdinateur = 1;
                } else {
                    // Si le nombre de bâtons restants est un multiple de 4, l'ordinateur choisit 1, 2 ou 3 au hasard
                	choixOrdinateur = (int) ((Math.random() * 3) + 1);
                }
                System.out.println("L'ordinateur retire " + choixOrdinateur + " bâton(s).");
                batonsRestants -= choixOrdinateur;
                tourJoueur = true;
            }
        }
        if (tourJoueur) {
            System.out.println("Bravo ! Vous avez gagné !");
        } else {
            System.out.println("L'ordinateur a gagné. Essayez à nouveau !");
        }

        scanner.close();
    }

}
