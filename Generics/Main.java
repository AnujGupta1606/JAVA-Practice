package Generics;

import java.util.Arrays;

import Generics.Twoarray.Twoarray;

public class Main {

    public static <T> boolean compare_Arrays(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
          return false;
        }
    
        for (int i = 0; i < arr1.length; i++) {
          if (!arr1[i].equals(arr2[i])) {
            return false;
          }
        }
        return true;
      }
    public static void main(String[] args) {
        Twoarray<Integer> arr3 = new Twoarray<Integer>();
        Integer[] arr1={2,3,4,5};
        Integer[] arr2={2,3,4,5};
        System.out.println("Original arrays:");
    System.out.println("arr1: " + Arrays.toString(arr1));
    System.out.println("arr2: " + Arrays.toString(arr2));
    // System.out.println("\nCompare arr1 and arr2: " + arr3.compare_Arrays(arr1, arr2)); 
    System.out.println(compare_Arrays(arr1, arr2));
    }

}
