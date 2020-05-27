package rebootCamp1.day5_Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");//index 0
        list.add("b");//index 1
        list.add("c");//index 2
        list.add("c");
        list.add(null);
        list.set(0,"0");

        System.out.println(list);
    }
}
