package Poly.Animals;

public class Animal1 {
    String Sound;
    static int a;
    Animal1(){
        a++;
    }
    public void Count(){
        System.out.println(a);
    }
    public String makeSound(String sound ){
        sound=Sound;
         return Sound; 
    }

}
