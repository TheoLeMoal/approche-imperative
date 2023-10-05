package fr.algorithmie;

public class Rotation {

	public static void main(String[] args) {
		int[] array =  {0,1,2,3};
        int dernierElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
        	array[i] = array[i - 1];
        }
        array[0] = dernierElement;
        for (int i : array) {
			System.out.println(i + " ");
		}
	}

}
