package class6;

public class TriAngle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a TriAngle");
    }

    @Override
    public double calculateArea() {
        return .5*8*78;
    }
}
