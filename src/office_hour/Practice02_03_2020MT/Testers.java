package office_hour.Practice02_03_2020MT;

public class Testers extends ScrumTeam{

    /**
     * inherited features :
     * variables : employeeName, JobTitle, salary
     * methods : getEmployeeInfo
     */

    public Testers(String employeeName,String jobTitle,double salary){
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
        this.salary = salary;
}

    @Override
    public void Demo(){

        System.out.println("Tester " + this.employeeName+ " is doing demo");

    }

    public void DailyStandUp(){

        System.out.println("Tester " + this.employeeName + " is attending the daily stand up meeting");

    }

    public void foundBug(){
        System.out.println("Tester " + employeeName + " reported a bug");// you can use this.employeeName, or only employee
                                                              // for calling this variable in this class
    }

}
