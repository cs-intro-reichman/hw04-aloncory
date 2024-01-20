/* This class offers some functions for processing arrays */
public class ArrayOps {
    public static void main(String[] args) {
        System.out.println("Tests ArraysOps:");
        System.out.println("Checks the function \"findMissingInt\" :");
        System.out.println(findMissingInt(new int[] {3, 0, 1})); // 2
        System.out.println(findMissingInt(new int[] {0, 1, 2, 3, 4, 6})); // 5
        System.out.println(findMissingInt(new int[] {0})); // 1
        System.out.println(); // Prints an empty line
        System.out.println("Checks the function \"secondMaxValue\" :");
        System.out.println(secondMaxValue(new int[] {6, 9, 4, 7, 3, 4})); // 7
        System.out.println(secondMaxValue(new int[] {1, 2, 3, 4, 5})); // 4
        System.out.println(secondMaxValue(new int[] {2, 8, 3, 7, 8})); // 8
        System.out.println(secondMaxValue(new int[] {1, -2, 3, -4, 5})); // 3
        System.out.println(secondMaxValue(new int[] {-202, 48, 13, 7, 8})); // 13
        System.out.println(); // Prints an empty line
        System.out.println("Checks the function \"containsTheSameElements\" :");
        System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1})); // true
        System.out.println(containsTheSameElements(new int[] {2, 2, 3, 7, 8, 3, 2}, new int[] {8, 2, 7, 7, 3})); // true
        System.out.println(containsTheSameElements(new int[] {1, 2, 3}, new int[] {1, 2, 3})); // true
        System.out.println(containsTheSameElements(new int[] {3, -4, 1, 2, 5}, new int[] {1, 3, -4, 5})); // false
        System.out.println(); // Prints an empty line
        System.out.println("Checks the function \"isSorted\" :");
        System.out.println(isSorted(new int[] {7, 5, 4, 3, -12})); // true
        System.out.println(isSorted(new int[] {1, 2, 3})); // true
        System.out.println(isSorted(new int[] {1, -2, 3})); // false
        System.out.println(isSorted(new int[] {1, 1, 500})); // true
        System.out.println(isSorted(new int[] {1, 3, 2})); // false
        System.out.println(isSorted(new int[] {1, -2})); // true
        System.out.println(isSorted(new int[] {1, 2})); // true
        System.out.println(isSorted(new int[] {1, 1})); // true
        System.out.println(isSorted(new int[] {1})); // true
    }
    /* This function takes a single parameter: an array of integer values. Assume that the length
    of this array is n. The array contains each integer 0 ≤𝑥≤𝑛, exactly once, except for one of these
    integers, which is missing. The integers are stored in the array in no particular order. The
    function returns the missing integer. Assume that the input is valid (obeys the rules described
    above), and that the array’s length is ≥ 1 */
    public static int findMissingInt (int [] array) {
        int n = array.length; // Initializing n as the length of the array input
        // Loops through all interegs between 0 and n , inclusive , unless a missing int is found
        // #feedback: better to use here for loop
        for (int i = 0; i <= n; i++) {
            boolean isMissing = true;
            // Checks if the integer i is already included in the array, else, it retruns the value of i as the missing integer.
            for (int j = 0; j < array.length && isMissing; j++) {
                isMissing = isMissing && (array[j] != i);
            }
            if (isMissing) {
                return i;
            }
        }
        // #feedback: as in the example provided of {0} you should return 1, so here you should return n (since it's not in non-missing integer array of size n)
        return n; // Compilation requirement
    }
    /* This function takes an array of integers, and returns the second largest number in the array. The
    numbers in the array may appear more than once. Assume that the array’s length is > 1. */
    public static int secondMaxValue(int [] array) {
        int maxValue = array[0];
        int maxIndex = 0; // A varible that saves the idex of the largest number in the array 
        // Calculates the largest number in the array , and saves it's index.
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        /*
            #feedback:
            What about the case maxIndex = 0? it lead a wrong answer...
            Consider this array {3, 2, 1}
            secondMaxValue = 3 so no different max will be found.
        */
        int secondMaxValue;
        if (maxIndex == 0) {
            secondMaxValue = arr[1];
        } else {
            secondMaxValue = arr[0];
        }
        // Calculates the second largest number in the array.
        for (int j = 0; j < array.length; j++) {
            if (array[j] > secondMaxValue && j != maxIndex) {
                secondMaxValue = array[j];
            }
        }
        return secondMaxValue; // Returns the second largest number in the array.
    }
    /* This function takes two arrays of integers, and returns true if both arrays contain the same
    numbers. The number of occurrences of each number, and their order, are not important (note:
    this is similar to checking the identity of sets in mathematics). */
    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for (int i = 0; i < array1.length; i++) {
            boolean isMember = false;
            for (int j = 0; j < array2.length; j++) {
                isMember = isMember || (array1[i] == array2[j]);
            }
            if (!isMember) {
                // #feedback: be clear with return value in such case there is only one possible result 
                return false;
            }
        }
        return true;
    }
    /* This function takes an array of integers and checks if the array is sorted increasingly, from the
    minimum value to the maximum value, or decreasingly, from the maximum value to the
    minimum value. */
    public static boolean isSorted(int [] array) {
        boolean isSortedIncreasingly = true;
        boolean isSortedDecreasingly = true; 
        // #feedback: You could merge logics within same loop.
        // Checks if the array is sorted decreasingly
        for (int i = 0; i < array.length - 1; i++) {
            if (array [i + 1] > array[i]) {
                isSortedDecreasingly = false;
            } 
            if (array [i + 1] < array[i]) {
                isSortedIncreasingly = false;
            } 
            if (!isSortedDecreasingly && !isSortedIncreasingly) {
                return false;
            }
        }

        return true;
    }
}
