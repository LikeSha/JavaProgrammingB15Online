package office_hour.practice02_03_2020MT;

public abstract class ScrumTeam {
    /**
     * inherited features :
     * variables : employeeName, JobTitle, salary
     * methods : getEmployeeInfo
     */

    public String employeeName;
    public String jobTitle;
    public double salary;

    public abstract void Demo();
    public abstract void DailyStandUp();

    public void getEmployeeInfo(){

        System.out.println("==============================================");
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Job Title : " + jobTitle);
        System.out.println("Salyary : " + salary);
        System.out.println("================================================");
    }
}
