package class7.nonGeneric;

public class NonGenericMain {
    public static void main(String[] args) {
        IntegerTest test=new IntegerTest(1200);
        System.out.println("Integer Value : "+test.getInter());

        StringTest test1=new StringTest("Emran is very Good man");
        System.out.println("String Value : "+test1.getString());

        DoubleTest test2=new DoubleTest(876.51);
        System.out.println("Double Value : "+test2.getaDouble());


    }
}
