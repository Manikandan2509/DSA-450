package src.Stack;
import java.util.*;
public class MergingTwoArraysUsingInsertionSort {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 8, 9, 10};
        int arr2[] = {4, 5, 7};
        int i = 0;
        int j = 0;
        while (i < arr1.length) {                     // if arr2[j] < arr1[i]
            if (arr2[j] < arr1[i]) {                    //then swap arr2[j] and arr1[i]
                int temp = arr1[i];
                arr1[i] = arr2[j];                         // if arr1[i] < arr2[j] then i++
                arr2[j] = temp;
                i++;
                Arrays.sort(arr2);
            } else {
                i++;
            }
        }
        System.out.print(Arrays.toString(arr1));
        System.out.print(Arrays.toString(arr2));

    }
}
