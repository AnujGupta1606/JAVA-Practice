package GEN2.tar;
 import java.util.ArrayList;
import java.util.List;
public class newlist {
   
  public static <T> List <T> reverseList(List <T> L1) {
    List <T> L2 = new ArrayList <> ();

    for (int i = L1.size() - 1; i >= 0; i--) {
      L2.add(L1.get(i));
    }

    return L2;
  }

  public static void main(String[] args) {

    ArrayList <Integer> a1=new ArrayList<Integer>();
    
    a1.add(1);
    a1.add(2);
    a1.add(3);
    a1.add(4);
    
    System.out.println(reverseList(a1));
  }
}
