package InterviewsCodeKnowledge;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/*
Write a method that can return the minimum value from ta map (DO NOT use sort method)
 */
public class MapMininumValue {

    public static void main(String[] args) {


    }

    public static int minimumValue(Map<String,Integer> map){

        SortedSet<Integer> sm = new TreeSet<>(map.values());
        return sm.first();
    }

}
