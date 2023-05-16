package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array =  {0,1,2,3};
        int[] arrayRotation = new int[array.length];
        int dernierElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            arrayRotation[i] = array[i - 1];
        }
        arrayRotation[0] = dernierElement;
        for (int value : arrayRotation) {
            System.out.println("value = " + value);
        }
    }
}
