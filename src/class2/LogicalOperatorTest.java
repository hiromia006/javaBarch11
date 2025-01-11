package class2;

public class LogicalOperatorTest {
    public static void main(String[] args) {
        int mark1 = 98, mark2 = 87;
        System.out.println(  mark1 > mark2 && mark1 == mark2 && mark2 < mark1 );
        System.out.println(  mark1 > mark2 && mark1 < mark2  || mark1 != mark2);
    }
}
