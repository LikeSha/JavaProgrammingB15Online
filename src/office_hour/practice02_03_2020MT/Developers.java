package office_hour.practice02_03_2020MT;

public class Developers extends ScrumTeam {
    /**
     * inherited features :
     * variables : employeeName, JobTitle, salary
     * methods : getEmployeeInfo
     */


    public Developers(String empoyeeName, double salary){
        this.jobTitle = "Software developer";
        this.employeeName = empoyeeName;
        this.salary = salary;
    }

    @Override
    public void Demo(){
        System.out.println("Developer " + this.employeeName+ " is doing demo");
    }
    @Override
    public void DailyStandUp(){
        System.out.println("Developer " + this.employeeName+ " is attending the daily stand up");
    }

    public void fixingBug(){
        System.out.println("developer " + this.employeeName+ " is crying ");
    }

}
