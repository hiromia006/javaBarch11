package class7.generic;

import class7.nonGeneric.IntegerTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Object> json = new HashMap<>();
        json.put("name", "mou");
        json.put("salary", 30000);
        json.put("mark", 75);

        System.out.println("salary : "+json.get("salary"));
    }
}
