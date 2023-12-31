package Inheritace;
 
 
 public abstract class Employe {
 protected int CalculateBonus;
 protected String Performance;
 protected int Project;

 public abstract void calculateBonus(int amount);
 public abstract void genratingPerformance(String perform);
 public abstract void managingProject(int quantity);
    
 }