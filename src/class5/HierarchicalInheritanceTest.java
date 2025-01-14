package class5;

public class HierarchicalInheritanceTest {
    public static void main(String[] args) {
        Dog dg=new Dog();
        System.out.println(dg.height);
        dg.bark();

        //parent
        System.out.println(dg.color);
        dg.eat();


        //Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance ===============");
        Cat ct=new Cat();
        ct.meow();

        //parent
        System.out.println(ct.color);
        ct.eat();
    }
}
