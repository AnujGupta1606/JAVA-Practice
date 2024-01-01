public class Generics {
    public static void main(String[] args) {
        Addition<Employee> obj = new Addition<>();
        Employee obj1 = new Employee();
        obj.SetValues(obj1, obj1);
    }
}
