package softSkillClass;

public class Day2_Dec5_2019 {

    public static void main(String[] args) {

        // today agenda : we will review types of testing
        // kahoot game

        /* What is Verification ?
        Verification is a process to make sure the product satisfies the conditions imposed
        at the start of the development phase . To make sure the product behaves the way we want it to

        what is Validation ?
        Validation is the process to make sure the product satisfied the requirement at the
        end of the development phase.to make sure ....

        what is software testing : combination of verification and validation process
        as tester we do static testing by peer reviewing test case document .

        for testing new functionalies
        1, analyze the requirement
        2, create test case document
        3, peer review test case doc.
        4, start to perform manual testing

        example test case :
        step 1, open url www.amazon.com
             2, enter valid user name and password
             3, click on sign in
             (test case must be specific , must practice in excel sheet first ,then imported to
             jira )

             White box Testing are mostly done by Developers , SDETs sometime do it too .
             (market needs a lot a lot QA testers !!) SDETs is higher than QA testers ,QA
             are mainly about manual testers ,SDETs are mainly automation testers

             Title : QA testers, QA analyst, QA test engeneering , SDET -- they are all same !
             the difference is the level is different .SDETs is the highest level .Our job is
             doing both manual test and automation test .SDETs need to pick from manual testers , to
             check which functionalities can be automation which one can not .every project at least
             manual testing once .

             AD-HOC testing also called random testing or informal testing .
             Adhoc testing VS Exploratory testing :
             both are random or informal testing .

             ad-hoc testing : done by testers who know the application very well --purpose : finding the bug
             Exploratory testing : done by tester who dose not know anything about the application.--purpose:
             learn and explore the application.

             the purpose of ad hoc testing is : finding the bug
             the purpose of exploratory testing is :  learn and explore the application

             Unit test document is very helpful for testers .unit test is done by developer himself
             they do it to find bugs before testers find them. unit testing normally testing the code.

             component testing == module testing ==program testing
             component testing : when you perform component testing , you actually testing independent
             module/or component


             integration testing tests after integrating multiple component if the system works fine or not
             single component might work fine by itself but when integrated with multiple
             components it might fail.

             system testing : you testing every single component , its testing whole application itself
             componenet ,integration and system testing can be black box or white box testing
             as for us , we dont do white box testing , for example : we test amazon home page function:
             log in module, prime member module ......


             acceptance testing is done by users

             Why UAT ? UAT testing is User Acceptance Testing

             UAT testing has two type :
                1, alpha testing :done by technical people
                2,beta testing : done by clients ,customers and end users

             ( real life case ,her own work experience )
             Project name : schools and library program
             company or client :USAC
             end-user: Internal end user : who ever review those application and approve or deny
                       External end user : applicants from schools and libraries

              UAT testing in this company is done by internal end user.

             REGRESSION TESTING ---VERY VERY IMPORTANT . IN INTERVIEW THEY ASK YOU :
              HOW DO YOU DO YOUR REGRESSION TESTING ???

              Minor regression testing  happening each time at the  end of the sprint(
              bug fixing must do on each sprint )
              major regression each 3 month ( 6 sprint)
              the major regression testing should be done before the release .

              UNDERSTAND REGRESSION IS THE REASON WHY THEY WANT TO HIRE AND PAY SDET

              Interview questions :
              1, What type of testing have you done so far ?
              answers: my previous project , I working on functional testing ,
              smoke testing ,manual and automation ( joining automation team) ,learning it ,
              I join the smoke testing ,I do system testing ,functional testing ,( teachers answer :
              I have working on smoke testing, integration ,system testing , and regression
              testing .I did manual and automation .for safe perspective ,dont say
              you did UAT testing ,otherwise they will ask you how did you do it .

              The critical functionalities for amazon : log in , search,add to cart,purchase .
              smoke testing dose not require to include a lot functionalities .
              it's just focus on a few functionalities but should be critical

              Interview questions:
              How many test cases in your smoke testing ?
              Answer: about 20-30 cases ,it can be done within 30 minutes

              the purpose of smoke testing is :
              make sure the environment is up and running ,make sure the application is stable .

              the advantage of smoke testing is :
              1, it will help us quickly to identify the issue
              2, testing team will not waste their time on perform any type of testing on
              faulty build.

              some of the companies they do smoke testing after integration testing
              (her personal experience is : do smoke testing everyday ,to make sure the
              system is stable , make job easier)

              System Testing :
               is the tesing of a complete and fully integrated software product. system testing
               tests the combination of software and hardware .is also called
               End to End testing . Testers do the system testing .

              Testing Hierarchy :
               unit-->component-->integration-->system -->UAT testing (Acceptance testing)

               non-functional testing == performance testing
               we dont do performance testing in cybertek school
               we only do functional testing













         */






    }
}
