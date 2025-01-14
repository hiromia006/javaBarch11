package class7.generic;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Foysal");
        strings.add("Foysal");
        strings.add("mou");
        strings.add("emran");
        strings.add("Imam");
        strings.remove("Foysal");

        Set<String> names = new HashSet<>();
        names.add("s");
        names.add("F");
        names.add("E");

        strings.addAll(names);
        strings.removeAll(names);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
