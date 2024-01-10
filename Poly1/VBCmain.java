package Poly1;

import java.util.Scanner;

import Poly1.Vehicle.Bycycle;
import Poly1.Vehicle.Car;
import Poly1.Vehicle.Vehicle;

public class VBCmain {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      Car c1= new Car();
       Bycycle b1=new Bycycle();
       Vehicle v1=new Vehicle();
      int speed = sc.nextInt();
      System.out.println(c1.Speedup(speed));
      System.out.println(c1.Speedup(speed));
      System.out.println(b1.Speedup(speed));
      System.out.println(b1.Speedup(speed));
      System.out.println(v1.Speedup(speed));
      System.out.println(v1.Speedup(speed));
    //   similarly for vehicle and bycycle
    }
      
    }
}
