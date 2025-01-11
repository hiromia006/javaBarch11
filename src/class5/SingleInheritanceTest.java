package class5;

public class SingleInheritanceTest {
    public static void main(String[] args) {
        Dog dg = new Dog();
        System.out.println("H "+dg.height);
        dg.bark();

        System.out.println("Color "+dg.color);
        dg.eat();
    }
}
