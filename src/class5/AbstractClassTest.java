package class5;

public class AbstractClassTest {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.draw();
        rec.printShap();


        Circle cir = new Circle();
        cir.draw();
        cir.printShap();

        System.out.println("=========================");
        Shape sp = new Rectangle();

    }
}
