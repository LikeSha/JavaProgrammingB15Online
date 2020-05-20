package RebootCamp1.day1_StringAndLoops;

public class CountJava {

    public static void main(String[] args) {

        String str = "java is fun. java is the best . java";
        int java = 0;
        // approach one

        for(int i =0; i<str.length()-3; i++){ // i<= str.length()-4;
            if(str.substring(i,i+4).equalsIgnoreCase("java"))
                java++;
        }
        System.out.println("Java was found : " + java);

        //approach two

        int java2 = 0;

        while(str.contains("java")){
            java2++;

            str = str.replaceFirst("java","");
        }

        System.out.println("java 2 " + java2);

        //task 3
        //Given any String determine if it is Palindrome. Print "Palindrome" if it is and "Not Palindrome" if it is not



    }
}
