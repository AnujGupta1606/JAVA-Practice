package Inheritace;

public class Rectangle extends Shape {
    
    private double Length;
    private double Width;
    
    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }
  @Override
    public double getArea() {
        return Length * Width;
    }
}
