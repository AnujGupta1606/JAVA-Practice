package Abstract1.Animal3;

public class bird extends dog {
     
    public void sing(){
        System.out.println("chirupping");
    }

    @Override
    public void makeSound() {
        throw new UnsupportedOperationException("Unimplemented method 'makeSound'");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Unimplemented method 'fly'");
    }
}
