package office_hour.practice_01_14_2020;

public class ScrumTeam {

    public static void main(String[] args) {

        // we are going to create an object
                          // reference        // object
        ScrumTeamEmployee employee01 = new ScrumTeamEmployee();
        employee01.name = "Hasan";
        employee01.employee_ID = 123;
        employee01.jobTitle = "PO";
                                             // object
        ScrumTeamEmployee employee02 = new ScrumTeamEmployee();
        employee02.jobTitle = "Tester";
        employee02.name = "Maiia";

        // method
        employee02.standUp();


                                             // object
        ScrumTeamEmployee employee03 = new ScrumTeamEmployee();
        employee03.jobTitle = "Developer";
        employee03.name = "Ershat";
        employee03.employee_ID = 345;

        employee03.standUp();

        System.out.println("===============");

        System.out.println("employee01's name is " + employee01.name);

        // employee01.name.standUp  this is wrong name is variable ,standUp() is method
        // you can not chain variable with method together

        System.out.println("employee01's job title is " + employee01.jobTitle);
        System.out.println("employee01's ID is " + employee01.employee_ID);

        System.out.println("===========================");

        employee01.getEmployeeInfo();
        employee02.getEmployeeInfo();

        employee01.demo();
        employee02.demo();
        employee03.demo();



    }
}
