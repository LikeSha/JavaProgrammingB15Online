package day63;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {

    /*TASK :
         Create a List of String with your group member names
         then create a map of String ,Integer called nameCharCountPair
         and store the name and character count of each member

         */

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zeliha Sezer");
        names.add("Tugba Bekar");
        names.add("Birnigar Ozyurt");
        names.add("Seda Civan");
        names.add("Nuran Demir");
        names.add("Murat Kilinc");
        names.add("Hakan Durmus");
        names.add("Nuran Demir");
        names.add("Mariia Lukianenko");

        Map<String,Integer> nameCharCountPair = new HashMap<>();
        for( String eachMember : names){
            nameCharCountPair.put(eachMember,eachMember.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }
}
