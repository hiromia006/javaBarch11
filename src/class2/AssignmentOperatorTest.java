package class2;

public class AssignmentOperatorTest {
    public static void main(String[] args) {
        int number1 = 85, number2 = 50, number = 0;

        number1 += number1; //number1=number1+number1;
        System.out.println(number1);

        number += number1;
        System.out.println(number);

        number-=50;
        System.out.println(number);

        number*=10;

    }
}
