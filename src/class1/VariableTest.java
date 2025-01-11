package class1;

public class VariableTest {
    int age = 22;
   public static String name = "Foysal";

    public void printName() {
        System.out.println("Name is " + name);
    }

    public void printSalary() {
        int salary = 25000;
        System.out.println("salary " + salary);
    }

    public static void main(String[] args) {
        new VariableTest();
    }

}
