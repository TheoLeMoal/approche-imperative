package fr.declaration.variable;

public class DeclarationApp {
	public static void main(String[] args) {
		/**
		 * Déclaration de chacun des types avec un littéral différent de 0 pour les chiffres
		 */
		byte byteVariable = 1;
		short shortVariable = -17282;
		int intVariable = 2846325;
		long longVariable = 10000L;
		float floatVariable = 2.5F;
		double doubleVariable = 6.4D;
		char charVariable = 'a';
		boolean booleanVariable = true;
		String stringVariable = "String";
		/**
		 * Affichage des valeurs
		 */
		System.out.println(byteVariable);
		System.out.println(shortVariable);
		System.out.println(intVariable);
		System.out.println(longVariable);
		System.out.println(floatVariable);
		System.out.println(doubleVariable);
		System.out.println(charVariable);
		System.out.println(booleanVariable);
		System.out.println(stringVariable);
		/**
		 * Retour a la ligne dans une chaine de caractère
		 */
		String randomString = "Voici le résultat d'un calcul : 5+1=6";
		System.out.println(randomString);
		randomString = "Voici le résultat d'un calcul : \n5+1=6";
		System.out.println(randomString);
	}
}
 