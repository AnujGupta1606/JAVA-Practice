package Poly1.Vehicle;

public class Bycycle extends Vehicle{
    
    public int  Speedup(int speed){
        if(speed<20){
           Speed=Speed+speed;
          }
          else{
           System.out.println("Speed is high");
          }
          return Speed;

   };
}
