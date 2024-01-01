import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.EmployeeId= 1;
        emp1.Name = "Neeraj";
        emp1.Age = 25;
        emp.add(emp1);
        Employee emp2 = new Employee();
        emp2.EmployeeId= 2;
        emp2.Name = "Amuj";
        emp2.Age = 15;
        System.out.println(emp);
        emp.add(emp2);

        for(Employee i : emp ){
            System.out.println(i.Age + "" + i.Name + " " + i.EmployeeId);
        }
        var obj =new Employee();
        Object ab=new Employee();
        
    }
}
