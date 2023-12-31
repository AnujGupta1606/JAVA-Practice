package Inheritace;

public class Employee extends Person {
    int Empid;
    String jobtitle;

    void getEmployeeId(int id){
       Empid=id;
    }

    public String SetLastName(String Lastname){
        var LastName =  Lastname + jobtitle;
        return LastName;
    }
    
}
