package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int tailleMax = Math.max(array1.length, array2.length);
        int[] somme = new int[tailleMax];
        for (int i = 0; i < tailleMax; i++) {
            int valeurArray1 = 0;
            int valeurArray2 = 0;
            if (i < array1.length) {
                valeurArray1 = array1[i];
            }
            if (i < array2.length) {
                valeurArray2 = array2[i];
            }
            somme[i] = valeurArray1 + valeurArray2;
        }
        for (int element : somme) {
            System.out.println("element = " + element);
        }
    }
}
