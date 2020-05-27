package rebootCamp1.day5_Collections;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(4,"four");
        map.put(null,"this null");
        map.put(2,"two");
        map.put(1,"one");

        System.out.println(map); // order must be maintained {4=four, null=this null, 2=two, 1=one}

    }
}
