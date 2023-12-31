package Poly1.Vehicle;

public class Vehicle {
    int Speed=0;
    

    public int  Speedup(int speed){
         if(speed<30){
            Speed=Speed+speed;
           }
           else{
            System.out.println("Speed is high");
           }
           return Speed;

    };
}
