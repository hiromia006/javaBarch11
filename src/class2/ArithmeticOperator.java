package class2;

public class ArithmeticOperator {
    public static void main(String[] args) {
        int number1 = 85, number2 = 50, number;

        number = number1 + number2;// 85+50=135
        System.out.println(number);

        number1 = number - number1; // 135 - 85=50;
        System.out.println(number1);

        number = number1 * number2; // 50 * 50=2500
        System.out.println(number);

        number2=number/50;
        System.out.println(number2); //50

        System.out.println(number%number2);
    }
}
