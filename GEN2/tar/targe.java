package GEN2.tar;

import java.util.List;

public class targe {
public static <T> int target(List <T> numbers, T Target ) {

    for(int i=0; i<=numbers.size();i++){
         if(numbers.get(i) == Target){
            return i;
        }  
    }
    return -1;
}
}
