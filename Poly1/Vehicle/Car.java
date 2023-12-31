package Poly1.Vehicle;

public class Car extends Vehicle {
    

    public int  Speedup(int speed){
        if(speed<100){
           Speed=Speed+speed;
          }
          else{
           System.out.println("Speed is high");
          }
          return Speed;

   };
}
