package class6;

public class InterfaceMain {
    public static void main(String[] args) {
        Circle cir = new Circle();
        cir.draw();
        System.out.println("Area " + cir.calculateArea());

        Shape sp = new TriAngle();
        sp.draw();
        System.out.println("Area "+sp.calculateArea());

    }
}
