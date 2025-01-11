package class4;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int mark = 180;
        if (mark <= 100 && mark >= 80) {
            System.out.println("A+");
        } else if (mark <= 80 && mark >= 60) {
            System.out.println("A");
        } else if (mark <= 60 && mark >= 50) {
            System.out.println("B");
        } else {
            System.out.println("FAIL");
        }
    }
}
