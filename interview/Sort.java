package practice2;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 9};

        // Sort the array in ascending order
        Arrays.sort(arr);
        
//     // Sort the array in descending order
//        Arrays.sort(arr, Collections.reverseOrder());


        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

