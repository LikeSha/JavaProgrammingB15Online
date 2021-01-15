package InterviewsCodeKnowledge;

public class FindHowManyCharacerInString {

    public static void main(String[] args) {

        // in this case ,we use nested loop
        String str = "java";
        String check = "";

        for (int i = 0; i < str.length(); i++) {

            if(check.contains(str.charAt(i) + ""))
                continue;// continue means : go back the top loop start it again, just ignore the
                         // rest of bottom part.in this case go back tgo line 3 and loop it again.

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j))
                    count++;

            }
            System.out.println(str.charAt(i) + " - " + count);
            check += str.charAt(i);
        }

    }
}
