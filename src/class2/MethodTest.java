package class2;

public class MethodTest {
    int salary = 5000;
    String name = "Jabed bhai";

    public void printSalary() {
        System.out.println("istiak Salar " + salary);
    }

    public void printSalary2(String name) {
        System.out.println(name + " Salar " + salary);
    }

    public int sum(int a, int b) {
        System.out.println("aasdkaslkdsa");
        return a + b;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        test.printSalary();
        test.printSalary2("Rana");
        System.out.println(test.sum(987,87));
        System.out.println(test.getName());
    }

}
