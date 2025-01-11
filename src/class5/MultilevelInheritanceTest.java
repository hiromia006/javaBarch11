package class5;

public class MultilevelInheritanceTest {
    public static void main(String[] args) {
        Pappy pp=new Pappy();
        //Pappy
        pp.sound();

        //Parent
        System.out.println(pp.height);
        pp.bark();

        // Grand Parent
        System.out.println(pp.color);
        pp.eat();


    }
}
