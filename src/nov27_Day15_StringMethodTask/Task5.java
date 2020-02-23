package nov27_Day15_StringMethodTask;

public class Task5 {

    public static void main(String[] args) {

        //TASK 5
        // Given a name with prefix, stored in a String variable called name
        // for example :
        //Dr. Dru, Mr. Robot, Ms. Lois, Mrs. Brown
        //--in case insensitive condition -----
        // print as below :
        // If the name Started with (Dr)-->>Doctor
        //If the name Started with (Mr)--Male
        //If the name Started with (Miss) --->>Single female
        //If the name Started with (Mrs) -->>Married female

        String name = "Mr.Brown" ;

        if(name.startsWith("Dr")){
            System.out.println("Doctor");
        }if(name.startsWith("Mr")){
            System.out.println("Male");
        }if(name.startsWith("Miss")){
            System.out.println("Single female");
        }if(name.startsWith("Mrs")){
            System.out.println("Married female");
        }


    }

}
