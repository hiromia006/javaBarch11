package class5;

public class OverloadingTest {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add());
        System.out.println(cal.add(98, 50));
        System.out.println(cal.add(98, 57, 987));
    }
}
