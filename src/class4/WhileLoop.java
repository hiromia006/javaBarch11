package class4;

public class WhileLoop {
    public static void main(String[] args) {
        // initial value; condition ; increamemnt

        int count = 0;
        while (count < 10) {
            System.out.println("While Loop " + count);
            ++count; // 0-1=-1, -1-1=-2
        }
        System.out.println("============================");
        int i = 15;
        do {
            System.out.println("Do While Loop " + i);
            i -= 10;
        } while (i >= 3);
    }
}
