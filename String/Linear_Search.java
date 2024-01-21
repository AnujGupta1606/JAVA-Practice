package String;

public class Linear_Search {
   public static void main(String[] args) {
      String name = "Anuj Gupta";
      char target = 'u';
      boolean ans = LinearSearch1(name, target);
      System.out.println(ans);


   }

   static boolean LinearSearch1(String s, char target ){
         
    if(s == null){
         return false;
    }
    for (int i = 0; i < s.length(); i++) {
        char element= s.charAt(i);
         if(element == target){
            return true;
         }

    }
    return false;

   }
    
}