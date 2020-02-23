package office_hour.practice_01_14_2020;

public class ScrumTeamEmployee {

    // scrum team employees' information --->variable, field , attribute, data
    //SM, PO ,developers + testers
    String jobTitle ;
    String name ;
    double salary;
    int employee_ID ;
    int age ;

    //what can scrum team do ? actions --->method
    public void standUp(){
        System.out.println("This team's stand up meeting is at 10:45am");
    }

     public void demo(){
         System.out.println(name + " is doing demo");
     }

    // create a method which give me all the information about an employee
    public void getEmployeeInfo(){
        System.out.println("Job Title: "+ jobTitle + "\n" +
                "Employee ID: "+  +employee_ID + "\n" +
                "Name: " + name +  "\n" +
                "Salary: " + salary + "\n" +
                "Age: " +age);

    }


    public static void main(String[] args) {

        System.out.println("Hello World");

        int i = 9 ;
        String word = "Java";


    }

    public void hi(){
        String name = "Asiya"; // local variable

    }

    public void hello(String name){ // local variable
        System.out.println("Hello " + name);
    }
}
