package TwoDimensionalArray;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] [] arr= {
        {23,4,1},
        {18,2,3,9},
        {78,99,34,56},
        {18,12}
    };
    int target= 34;
    int [] ans = Linear_Search(arr, target);
    System.out.println((Arrays.toString(ans)));

    }
    
   
    static int[] Linear_Search(int [][] arr , int target ){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]== target){
                    return new int [] {i,j} ;
                }
            }
        }

        return new int[] {-1,-1};

    }

}
