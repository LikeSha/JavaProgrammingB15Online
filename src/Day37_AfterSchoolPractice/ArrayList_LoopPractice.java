package Day37_AfterSchoolPractice;

import java.util.ArrayList;

public class ArrayList_LoopPractice {

    public static void main(String[] args) {

        ArrayList<String> nameLst = new ArrayList<>();

        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Guzelnurin");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        nameLst.add("Ayjerenjan");

        System.out.println("nameLst = " + nameLst);

        // find longest name
        String longestName = "" ;
        for (int i = 0; i < nameLst.size() ; i++) {

            String currentName = nameLst.get(i);
            if(currentName.length()>longestName.length()){
                longestName = currentName ;
            }

        }
        System.out.println("longestName = " + longestName);

    }
}
