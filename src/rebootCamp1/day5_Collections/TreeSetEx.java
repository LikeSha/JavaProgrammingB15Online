package rebootCamp1.day5_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

    public static void main(String[] args) {

        TreeSet<String> set = new TreeSet<>();
        set.add("z");
        set.add("y");
//        set.add(null);
        set.add("z"); // Set is not allow to duplicate element
        set.add("80");
        set.add("/");
//        set.add(null);  TreeSet is not allow to null
        set.add("z");
        set.add("a");

        System.out.println(set);

        // the outcome coming from ASCII order


    }
}
