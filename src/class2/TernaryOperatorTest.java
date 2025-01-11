package class2;

public class TernaryOperatorTest {
    public static void main(String[] args) {
        int mark1 = 98, mark2 = 2147483647;

        int number= (mark1 > mark2 && mark1 == mark2 && mark2 < mark1) ? mark1:mark2;
        System.out.println(number);
    }
}
