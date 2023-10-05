package fr.algorithmie;

public class FabriquerMur {
	public static void main(String[] args) {
		// Tests de vérification
		verifier(3, 1, 8, true);
		verifier(3, 1, 9, false);
		verifier(3, 2, 10, true);
		verifier(3, 2, 8, true);
		verifier(3, 2, 9, false);
		verifier(6, 1, 11, true);
		verifier(6, 0, 11, false);
		verifier(1, 4, 11, true);
		verifier(0, 3, 10, true);
		verifier(1, 4, 12, false);
		verifier(3, 1, 7, true);
		verifier(1, 1, 7, false);
		}
	
		static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
			boolean resultat = false;
			//On vérifie le nombre de briques de longueur 5 que l'on peux mettre
			if (nbBig != 0) {
				for (int i = 0; i < nbBig; i++) {
					if (longueur >= 5) {
						longueur -= 5;
					}else {
						break;
					}
					
				}
			}
			//On vérifie le nombre de briques de longueur 1 que l'on peux mettre
			if (nbSmall != 0) {
				for (int i = 0; i < nbSmall; i++) {
					if (longueur >= 1) {
						longueur -= 1;
					}else {
						break;
					}
				}
			}
			//Si le nombre de brique est suffisant pour remplire la longueur alors le résultat est true
			if (longueur == 0) {
				resultat = true;
			}
			return resultat;
		}

		private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
		if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
			System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + 
			longueur + ") NON passant.");
		} 
	}
}

