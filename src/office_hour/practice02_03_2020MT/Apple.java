package office_hour.practice02_03_2020MT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apple {

    public static void main(String[] args) {

        Testers Hasan = new Testers("Hasan","Manual Tester",85000);

//        System.out.println(Hasan.jobTitle);//Manual Tester
//        System.out.println(Hasan.employeeName);//Hasan
//        System.out.println(Hasan.salary);//85000

        Hasan.getEmployeeInfo();

        Testers Alisa = new Testers("Alisa","SDET",120000);
        Testers Rauf = new Testers("Rauf","QA",100000);

        List<Testers> testersTeam = new ArrayList<>();
        testersTeam.addAll(Arrays.asList(Hasan,Alisa,Rauf));

        for(Testers each :testersTeam){
            each.getEmployeeInfo();
            System.out.println("=====================================");
        }

        Developers Vladislav = new Developers("Vladislav",130000);
        Vladislav.getEmployeeInfo();

        Developers Emel = new Developers("Emel",130005);
        Developers Muge = new Developers("Muge",130010);

        List<Developers> develpersTeam = new ArrayList<>();
        develpersTeam.addAll(Arrays.asList(Vladislav,Emel,Muge));

        for(Developers each:develpersTeam){
            each.getEmployeeInfo();
            each.fixingBug();
            System.out.println("==============================================");
        }


        List<ScrumTeam> scrum = new ArrayList<>();
        scrum.addAll(testersTeam);// parent class can reference to the child class object
        scrum.addAll(develpersTeam);

        for(ScrumTeam eachMember:scrum){
            eachMember.getEmployeeInfo();
        }


    }
}
