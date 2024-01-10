package Generics;

import java.util.ArrayList;
import java.util.List;

public class evenodd {
    public static <T extends Number> int SumEvenOdd(List <T> numbers){
       
        int SumEven=0;
        int SumOdd=0;
       

        for (int index = 0; index < numbers.size(); index++) {
            if( numbers.get(index).intValue() %2 == 0){
                SumEven += index;

            }
            else{
                SumOdd=SumOdd+index;
            }
            
        }

        return SumEven + SumOdd;
    }
        
  public static void main(String[] args) {
    
    ArrayList<Integer> arr= new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);
    arr.add(6);
    System.out.println(arr);
    System.out.println(SumEvenOdd(arr));
    

    }
}
