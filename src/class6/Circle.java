package class6;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    public double calculateArea() {
        double redis = 7.25;
        return 3.1416 * redis * redis;
    }
}
