package Abstract1;


import Abstract1.Animal3.bird;
import Abstract1.Animal3.dog;

public class MAIN {
    public static void main(String[] args) {
        dog a = new bird() ;
        a.fly();
        a.makeSound();
    }
}
