package softSkillClass;

public class Day_3Dec12_2019 {

    public static void main(String[] args) {

        /**Today's Agenda :
         * 1,Continue review from last Thursday class topic
         * 2,Review software methodologies
         * 3,Homework--> different type of testing ,due date will be Wednesday Dec 18,2019
         *
         * non-functional testing == performance testing
         *                we don't do performance testing in cybertek school
         *                we only do functional testing
         *
         *  why you do white box testing ? you are focus on statement logic , if statement ,nested loops..
         *  anyting covered in requirement check the logic of code if missing or not
         *  for example white box testing :
         *  int A,B
         *  int c= A + B
         *  if c > 100
         *   output " its done!"     if c<0 false so the " output " its done!" not show up
         *  else
         *  " its pending "
         *
         *  output " its done!"
         *
         *  my test case for this is :
         *
         *  testcase 01 : I want to use two numbers A = 40 , B = 80 ;
         *  testcase 02 : A = 25 , B = 33 ;
         *  if c < 100   --> false so the " output " its done!" not show up
         *  so we have to add condition " else " to generate out put " its pending "
         *
         *As a tester you can do unit testing
         * when we automate the test to test case ,we need to write the scrip using automation tool.
         * unit testing is white box testing .in general white box testing is done by developer
         * black box testing is for testers , but if needed ,testers also do unit testing (white box testing)
         *
         * we are doing manual testing .( including :system testing ,performance testing ,integration testing )
         * after manual testing done ,you will do automation testing evey day .
         * we are mostly do black box testing
         *
         * regression testing 100% of them are fully automated testing
         * smoke testing could be done in 30 minutes by automation .
         *
         * SQL -- SQL language as a tester we should know this language .right now we are only
         * focus on java automation testing purpose
         *
         * regression testing is during any level of testing hierarchy :
         * unit-->component --->integration--->system--->acceptance
         *
         * Positive  testing : when you enter valid data , you have to see valid output .
         * for example : we go to amazon homepage to test : if i wanna check books . i found search function not work
         * functionaly ,
         *
         * negative testing : enter invalid data ( invalid user name and password)
         * positive : enter valid user name and valid password , system should allows
         *            you to login ---> passed user should be able to
         *            login with valid credential
         *
         * negative : enter invalid user name and invalid password -->error message " the user name
         * and password is not matching  as a tester ,if you see the result like this
         * it means ,your negative testing is passed  !!! if you fail to test it ,you should
         * write report .
         *
         * our job is test all different senarios .
         * Equivalence Class Partitioning --random test
         *
         * boundary test :
         * example :
         * 50$ < credit card < 8000$
         *
         * 5000, 49,90, 7999,99$ , 52$ ,80001 you test those numbers must within the creteria .
         * 49,90 and 8001 are negative testing
         *
         * There will be a lot bugs in production , as long as it's not urgent or not
         * high priority , developers will fix them later
         * if it is too urgent , then developers should fix it immediately.--this is called hotfix
         *
         * hot fix : why there is no requirement , there is no test case for current bug
         * if tester know very well about application ,they can do it help to find bugs and
         * get quick fix .
         *
         * screen reader ; most are government projects . it helps people who has severe visual
         * problem to use computer .it provide information about icons ,menus ,diaglogue box ,
         * files and folders . while you testing this type of functionalities you need to verify
         * whether it works properly or not ,the content is matching with website and whether
         * it can handle different languages.
         *
         * Manual testing : Any new application must be manually tested before its automated .
         * why : analyzing those functionalities , know what functionalites need to be
         * automation testing .manual testing is a key ! it time consuming .productivity
         * is gold and conduct by production .
         *
         * Why we do manual testing ?
         * 1, if it's new application ,we do manual testing to figure out each functionalities
         * 2, find bugs during the manual testing
         * 3, while manual testing we can analyze which functionality should be automate or not .
         *
         * how to perform manual testing ?
         * 1, analyze the requirement
         * 2, create test case document
         * 3,execute test case manually
         * 4,if bug is found ,log in and assign to developers.
         *
         * the tools we need to use in test case :
         * excel sheet : Jira, ALM. Jira is the most popular one .
         *
         * as long as test case is done , you do peer review--- then
         *
         * how to log in the bug and assign to developers ?
         *we gonna learn below in queue :
         * 1, Software methodologies
         * 2, Agile scrum
         * 3, testing life cycle( STLC)
         * 4, jira tool
         * 5, Project
         *
         *Jira is a platform where we get our tickets and work on it.
         * Selenium
         *
         * example : regression testing include 2000 test case , if you do manual you may spend 2 weeks
         *  to complete testing (7-8 testers)
         *  if you automated them you can complete in 2-3 days
         *
         *  in general one test case could have less than 15 steps is better
         *
         *  in our work environment , when our test case more than 15 steps then we just
         *  split test case (to two test cases or more , )
         *  test case are part of smoke test or regression test are automated
         *
         *  which tests cannot be automated ? see powerpoint day 2
         *
         *  once the applicant try to apply new form , new form come with application ID 190000001,
         *  19000002, ........(unique id )  ( 19 stands for 2019 )
         *  next year application id 2000001,200000002.... one time testing means
         *  we don't have to test it again as long as change ID one time . rest all days in 2020
         *  the windows are always opened .
         *
         *  captcha ( we can not automated testing ,because the image changing all the time )
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         *
         */






    }
}
