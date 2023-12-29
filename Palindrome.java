import java.util.Scanner;

public class pallidrome {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num, reversenum=0, rem;
        
        // while (num2!=0) {
        //    rem = num2 % 10;
        //    reversenum=  reversenum*10+rem;
        //    num2=num2/10;
        // }
        for(;num2>0;){
            rem = num2 % 10;
           reversenum=  reversenum*10+rem;
           num2=num2/10;

        }
        if ( reversenum==num) {
            System.out.println("It is PAllindrome number");
        }
        else {
            System.out.println("It is not");
        }

    }
}
