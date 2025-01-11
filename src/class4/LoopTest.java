package class4;

public class LoopTest {
    public static void main(String[] args) {
//synTax: initial value;condition;increament or decreament
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("Iteration " + 1);
//        }
//
//        System.out.println("==================");
//        int j = 1;
//        for (; j <= 20; ) {
//            System.out.println(j);
//            j += 3;
//        }
//
//        System.out.println("==================");
//        for ( int i=50;i>=0;i-=5){
//            System.out.println(i);
//        }

        int[] numbers={11,22,33,66,44,44};
        for (int n:numbers){
            System.out.println(n);
        }


        String names[]={"aaaa","asd", "dasdas", "ssdasda"};
        for (String raf:names){
            System.out.println(raf);
        }

    }
}
