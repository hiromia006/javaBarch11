package class4;

public class JumpStatements {
    public static void main(String[] args) {
        for (int i=0;i<20;i++){
            if (i==10) break;
            System.out.println(i);
        }
        System.out.println("=========================");
        for (int i=0;i<10;i++){
            if (i==5) continue;
            System.out.println(i);
        }
    }
}
