package class7.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(98);
        integerList.add(874);
        integerList.add(874);
        integerList.add(600);
        integerList.add(1, 753);
        integerList.add(1, 73);
        integerList.remove(1);

        List<Integer> list= Arrays.asList(9,8,7,5);
        integerList.addAll(list);
        integerList.removeAll(list);


        for (Integer i : integerList) {
            System.out.println(i);
        }

    }
}
