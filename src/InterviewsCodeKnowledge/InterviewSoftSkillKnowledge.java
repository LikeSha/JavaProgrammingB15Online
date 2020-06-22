package InterviewsCodeKnowledge;

public class InterviewSoftSkillKnowledge {

    /**
     * Soft skill :
     *
     *         three amigo meeting : developer, tester and Business Analyst ( BA ), its an informal meeting ,we can do anywhere
     *         who write the requirement ? BA
     *
     *         /How to test the application if you don't have any requirement ? (Interview question)
     *             // Answer : Ask developer !!! ( only person you can ask for ) tell them " I don't have user story,
     *             // ask them about functionality and go to test application.
     *
     *             Who assign requirements ( user stories) to testers  ? Answer :
     *             team leader  in developing team, developers assign the user stories to developers ,
     *             in testing team, test lead assign user stories to testers
     *
     *             unit testing done by developers ,and unit testing is white-box testing.
     *             white-box testing needs code knowledge
     *
     *             before testing ,testers need to :
     *
     *             1. read requirement
     *             2, start testing:
     *                 write test case; (after write test case, you start  manual testing)
     *
     *
     *             minor regression -->> is happened at end of each sprint.
     *             major regression--> normally every 3 months or every 6 sprint
     *
     *             is re-testing same as regression testing ? NO
     *                       re-testing : fix bugs( specific functionalities fixed )
     *                       regression testing ( when testing whole production )
     *
     *             How often you do your regression ?
     *                        generally , we do our regression each 3 month or each 6 sprint.
     *                         ( another saying is less than 4 weeks)
     *
     *             // who decide sprint cycle ? scrum master
     *
     *             // how's your regression ? our regression is 65% automated and
     *                     rest of them are done by manual .
     *                     the reason is not all functionalities can be done by automation ,you have to do manually .
     *
     *              our regression normally done by automated and takes about 3-4 hours
     *
     *      Unit testing is white box testing because unit test required test code.
     *
     *         Ad-Hoc testing is tesing without any plan or documentation. its considered as informal testing .
     *         its also call random testing or Monkey testing. also called Exploratory testing .
     *         lots of defects. good to perform ad-hoc testing once official testing is done and still sometimes
     *         left for testing.
     *
     *         Exploratory testing done by tester who dose not know anything about the application.
     *         the purpose of exploratory testing is : to learn and explore the application.
     *
     *         component testing = module testing ,testing each module separately
     *
     *         integreation testing tests after integrating mulitiple components to check
     *         if the system works fine or not.
     *
     *         UAT ---User Acceptance Testing  after system test has corrected ,
     *         the system will delivered to user or customer for acceptance testing ,
     *         sometimes stakeholders may be involved as well.
     *
     *         UAT testing : alpha testing (done by technical people)
     *                       beta testing (done by client, customer)
     *
     *         Interview question :
     *
     *         1, what type of testing have you done so far ?( they want to know your test level )
     *
     *            My previouse project, I working on functional testing . smoke testing,
     *            integration testing,system testing ,and regression testing .
     *            I also did manual and automation testing too.
     *
     *             interview questions:
     *
     *            How many test cases in your smoke testing ?
     *            20--30 test cases in my previouse project , and can be done within 30 minutes
     *
     *            the purpose of smoke testing :
     *            to make sure the environment is up and running , make sure the application is stable .
     *
     *
     *            the advantage of smoke testing is :
     *            1.it will help us quickly to identify the issue .
     *            2.testing team will not waste their time on perform any type of testing on faulty build.
     *
     *            soft skill interview : Jan 2,2020 day 6
     *
     *         question: what type of testing have you performed so far?
     *          * Sedar Haytyyev mock interview :
     *          *
     *          * I start my day from checking my smoke test , most of time I maintaining  my
     *          * existing test cases, ohter than that I mainly doing about regression and integression test
     *          *
     *          * can you tell me about your regression suite ?
     *          * (our regression suit gets larger in every sprint, each suits contains about 10--15 test cases
     *          * to the deployment environment ,there are about 100 test cases in deployment environment) ---> this is not
     *          the corrret anwser , the correct answer should be as follows :
     *
     *          you have to answer how many percentage test cases you automated ,how many percentage((regression 80 % auto tested ,rest 15-20% manual test) )
     *          * you do manual test ? How long you doing regression .( you need to provide your regression
     *          * circle, whether its is every 3 month or every 2 month or every 6 month...
     *
     *          *
     *          * Your regression is fully automated ?
     *          * yes .
     *          *
     *          * Is there any test cases done by manual tested ?
     *          * yes, we  also manual testers do manual tests , I myself in charge of automation test.
     *          *
     *          * are you working under Agile or waterfall ?
     *          * I work under Agile scrum model.
     *          *
     *          * how long is your sprint ?
     *          * our sprint is lasting 2 weeks
     *          *
     *          * can you introduce your team ?
     *          *
     *          * Are you prefer Agile or waterfall methodology?
     *          * it depends on the requirement and expectations by clients .
     *          * most of time we work under Agile. if its a big project,
     *          * it always requiring improvement during the process ,if that in case ,we work under the
     *          * Agile methodology
     *
     *          INTERVIEW QUESTION : Tell me about difference between test case and test scenario ?
     *          * test case is basically a documentation include test case ID, Test case description, pre-condition,
     *          * test data, test steps, expected result and actual result , then pass and fail
     *
     *
     *          grooming meeting : estimate user stories.
     *
     *          Daily StandUp meeting , every one need to answer 3 questions :
     *          1,what did you do yesterday ?
     *          2,what you will do today ?
     *          3,what is your obstacle ?
     *
     *          sprint review meeting == DEMO meeting
     *          *
     *          * sprint retrospective meeting 3 questions:  1,what went well ?
     *          * 2,what didn't going well ? 3,what could be improved in the next sprint ?
     *          *
     *          * what didn't going well ? developer always say " the requirement(user stories) not clear .....
     *          * what went well ? answer : our team collaboration goes well between developers , testers , scrum master BA..
     *          * BA very humble , developer very helpful ......
     *          *
     *          * in DEMO meeting, there are clients joining .retromeeting is our own team discussion.
     *
     *          INTERVIEW QUESTION : Tell me about difference between test case and test scenario ?
     *
     *          * test case is basically a documentation include test case ID, Test case description, pre-condition,
     *          * test data, test steps, expected result and actual result , then pass and fail
     *          *
     *          * test scenario is a higher level above than test case , it more general .if I give an example lets say
     *          * verify log in functionality when open up an application ,this is basically a test scenario .test case
     *          * would be more specific , test scenario including several test cases . for example log in functionality ,which
     *          * is a test scenario. one of a test case lets say student ,as a student , I should be able to log in
     *          * account with valid username  and valid password into my privacy account ,so I can check my grade , so this
     *          * is a one test case ,and its a positive test case ,I can write another case ,which is negative test case ,
     *          * the negative test case also belong to functionality test , lets say student log in with wrong
     *          * username or wrong password ,this is negative test case .
     *
     *
     *          user story cyntax :
     *
     *          As a <type of user > , I want < some goal> so that <some reason>
     *
     *              soft skill :
     *
     *          scrum event / scrum ceremony :
     *          * daily stand up meeting
     *          * sprint planning meeting
     *          * sprint retrospective meeting
     *          * sprint review / demo
     *
     *          Total four meetings in scrum event/ or you can say scrum ceremony
     *
     *
     *
     *          soft skill :
     *
     *        in interview , you can also ask the empoyer equesions , for example ,you may ask :
     *
     *        1. what type of methodology are you guys using ? Agile , Kanban, waterfall
     *
     *        2.wha is your team structure , like : how many testers and developers in your team ?
     *
     *        3.what was the regression suite running ?
     *
     *        4.how did you do smoke testing ?
     *
     *        Interview question :
     *
     *        what is your day to day activities ?
     *
     *        I usually come to work around 9:30 and first thing I have to do is check my emails to check if any meetings scheduled or not ,
     *        any new task assigned me or not , and smoke test result. Afther that ,
     *        I go go get some coffee, and chit chat with my team members ,like how was your weekends...
     *        then I attending daily stand-up meeting , normally start at 10:30 , we talk about detail of scrum,
     *        3 questions to be asked : what have you done yesterday,
     *        what are you going to do today, and what is your impediment ( anything block you )  ,
     *        after stand-up meeting ,I come back to my desk ,continue my work,
     *        if I am doing manual testing I will write my test cases and execute them .
     *        If I am doing automation, I analyze test cases and user stories or Acceptance Criteria ( AC)
     *        and write my script. If I am in the middle of automation testing ,
     *        I review my script or maintianing my script/framework.
     *
     *        keep in mind : after you write test cases , and before you start manual test,
     *        during this period ,you do peer reviews,
     *        after peer review ,you start manual test ( only the other testers can code review my code )
     *
     *
     *
     *
     */
}
