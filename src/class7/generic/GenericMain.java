package class7.generic;

import class1.VariableTest;

public class GenericMain {
    public static void main(String[] args) {
// generic without bound
        DataType<Integer> type = new DataType<>(987);
        System.out.println("Integer Value : " + type.getData());

        DataType<Float> dataType = new DataType<>(741.25f);
        System.out.println("Float Value : " + dataType.getData());

        DataType<String> dataType1 = new DataType<>("Mou");
        System.out.println("String Value : " + dataType1.getData());

        DataType<Double> dataType2 = new DataType<>(963.25);
        System.out.println("Double Value : " + dataType2.getData());

        DataType<VariableTest> dataType3 = new DataType<>(new VariableTest());
        dataType3.getData().printSalary();

        // generic with bound
        NumberDataType<Integer> type1 = new NumberDataType<>(951);
        System.out.println("Integer number value: " + type1.getNumber());

        NumberDataType<Double> type2 = new NumberDataType<>(753.25);
        System.out.println("Double number value: " + type2.getNumber());

        NumberDataType<Float> type3 = new NumberDataType<>(7053.25f);
        System.out.println("Float number value: " + type3.getNumber());
    }
}
