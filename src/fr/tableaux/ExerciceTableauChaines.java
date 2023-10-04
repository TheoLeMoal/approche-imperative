package fr.tableaux;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		/**
		 * Déclaration et modification
		 */
		String [] villes = {"Livron sur drôme", "Loriol", "Valence", "Paris", "Lyon"};
		//Affichage
		for (String ville : villes) {
			System.out.println(ville);
		}
		System.out.println(villes.length);
		villes[3] = "Reims";
		//Affichage apres modification
		for (String ville : villes) {
			System.out.println(ville);
		}
	}

}
