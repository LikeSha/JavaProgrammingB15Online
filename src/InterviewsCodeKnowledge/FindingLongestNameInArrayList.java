package InterviewsCodeKnowledge;

import java.util.ArrayList;

public class FindingLongestNameInArrayList {

    public static void main(String[] args) {

        // this is the top day37 ArrayList_LoopPractice
        ArrayList<String>  nameLst = new ArrayList<>();

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
        //assume the first one is the longest then compare with the rest

        String longestName = "";
        for (int i = 0; i < nameLst.size(); i++) {
            String currentName = nameLst.get(i);
            if(currentName.length()>longestName.length()){// > will give you first longest name if you have more than one
                // >= will give you last longest name if you have more than one
                longestName=currentName;
            }
        }
        System.out.println("longestName = " + longestName);
        
        
    }
}
