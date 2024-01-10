package Inheritace;

import java.util.Scanner;

public class MDPE {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Manager m1 = new Manager();
            Developer d1 = new Developer();
            Programmer p1 = new Programmer();
            System.out.println("Enter the Amount:");
            int amount=sc.nextInt();
            System.out.println("Enter the Quantity");
            int quantity=sc.nextInt();
            System.out.println("Enter the Performance");
            sc.nextLine();
            m1.calculateBonus(amount);
            d1.calculateBonus(amount);
            p1.calculateBonus(amount);
            m1.managingProject(quantity);
            d1.managingProject(quantity);
            p1.managingProject(quantity);
        }
        

    }
}
