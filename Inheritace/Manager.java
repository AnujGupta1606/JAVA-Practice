package Inheritace;

public class Manager extends Employe {
    String Name;
    String Address;
    int Salary;
    String Jobtitle;

    public void calculateBonus(int amount){
        CalculateBonus = CalculateBonus + amount;
        System.out.println(CalculateBonus);
    }
     public void genratingPerformance(String perform){
        Performance=perform;
        
    }
     public void managingProject(int quantity){

        if(Project==0){
            System.out.println("None");
        }

        else{
            Project=Project+quantity;
        }
        
    }

    
}
