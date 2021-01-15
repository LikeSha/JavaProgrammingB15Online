package InterviewsCodeKnowledge;

public class CountHowManyJava {

    /*
    Write a program that will count
    how many times “java” is found in any given String
     */

    public static void main(String[] args) {

        String str = "java is fun. java is the best . java";
        int countOfJava = 0;

        // method 1 :

        for (int i = 0; i < str.length() - 3; i++) {// i<= str.length()-4;
            if(str.substring(i,i+4).equalsIgnoreCase("java"))
                countOfJava++;
        }
        System.out.println("found java : " + countOfJava);

        // method 2 : we gonna find each " java" and remove it ,so left the total count of "java"
        System.out.println("------------ method 2-----------------------");

        int countOfJava2 = 0;

        while(str.contains("java")){

            countOfJava2++;
            str = str.replaceFirst("java","");
        }

        System.out.println("found java : " + countOfJava2);



    }
}
