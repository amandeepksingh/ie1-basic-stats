package Controllers;

public class MinMaxCalculator {

    // Method to calculate the minimum and maximum values in an array
    public static int[] MinMaxCalculation(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int min = array[0];
        int max = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        return new int[]{min, max};
    }
}
