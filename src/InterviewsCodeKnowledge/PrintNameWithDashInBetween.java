package InterviewsCodeKnowledge;

public class PrintNameWithDashInBetween {

    public static void main(String[] args) {

        // create a method to spell your name : Seda-->> S-e-d-a
       
       // method 1 :

        System.out.println("------------method 1------------------");
        String name = "salik";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i));
            if(name.charAt(i) !=name.charAt(name.length()-1)){
                System.out.print("-");
            }
        }

        System.out.println();

        // method 2:

        System.out.println("-----------method 2-----------------");
        
        String name2 = "salik";
        String name2Stored = "";
        for (int i = 0; i < name2.length(); i++) {
            name2Stored += name2.charAt(i) + "-";
        }
        name2 = name2Stored.substring(0,name2Stored.length()-1);
        System.out.println(name2);

        // method 3

        System.out.println("-------------------method 3--------------------------");

        String name3 = "salik";
        for (int i = 0; i < name3.length(); i++) {
            if(i==name3.length()-1){
                System.out.println(name3.charAt(i));
            }else{
                System.out.print(name3.charAt(i) + "-");
            }
        }
        
    }
}
