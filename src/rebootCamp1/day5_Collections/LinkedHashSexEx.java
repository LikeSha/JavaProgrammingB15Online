package rebootCamp1.day5_Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSexEx {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("z");
        set.add("y");
        set.add(null);
        set.add("z"); // Set is not allow to duplicate element
        set.add("80");
        set.add("/");
        set.add(null);
        set.add("z");
        set.add("a");

        System.out.println(set);


    }
}
