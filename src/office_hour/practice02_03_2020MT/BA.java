package office_hour.practice02_03_2020MT;

public class BA extends ScrumTeam {

    /**
     * inherited features :
     * variables : employeeName, JobTitle, salary
     * methods : getEmployeeInfo
     */


    public BA(String employeeName,double salary){
        this.jobTitle = "Business Analyst";
        this.employeeName = employeeName;
        this.salary = salary;
    }
    @Override
    public void Demo(){
        System.out.println("Business Analyst " + this.employeeName + " is doing demo");
    }
    @Override
    public void DailyStandUp(){
        System.out.println("Business Analyst " + this.employeeName + " is attending daily stand up meeting");
    }

    public void gatherRequirment(){
        System.out.println("Business Analysit " + this.employeeName + " is gathering requirement");
    }


}
