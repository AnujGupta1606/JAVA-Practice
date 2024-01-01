package Poly;

import java.util.Scanner;


import Poly.Animals.Bird;
import Poly.Animals.Cat1;



public class Main {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        String sound1 = sc.nextLine();
        String sound2 = sc.nextLine();
            
            Bird b1=new Bird();
            Cat1 c1=new Cat1();
           
            b1.makeSound(sound1);
            c1.makeSound(sound2);
            
            c1.Count();
    }

        

    }

}
