package fr.operateurs;

public class DeclarationOperateur {

	public static void main(String[] args) {
		/**
		 * Testez les Operateurs && et ||
		 */
		int a = 10;
		int b = 20;
		//Test &&
		boolean testEt = a>0 && b<10;
		System.out.println(testEt);
		//Test ||
		boolean testOu = a>0 || b<10;
		System.out.println(testOu);
		/**
		 * Testez les operateurs combines
		 */
		a=a+1;
		System.out.println(a);
		a++;
		System.out.println(a);
		a+=1;
		System.out.println(a);
		/**
		 * Testez l'operateurs ternaire
		 */
		String c = a>0 ? "a est plus grand que 0" : "a est inférieur a 0";
		System.out.println(c);
	}

}
