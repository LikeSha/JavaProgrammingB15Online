package softSkillClass;

public class Day6_Jan_02_2020 {

    public static void main(String[] args) {
        /**
         * main responsibilities of Product Owner :
         * build product backlog ,creating user stories,
         *
         * scrum master : organizing scrum event , prepare who should be done in the meeting ,set up
         * sprint goal,
         *
         * Kanban doesn't have sprint .
         *
         * grooming meeting : estimate user stories.
         *
         * sprint planning --> include grooming as well
         *
         * definition of Done
         * definition of Ready
         *
         * each user story has multiple Acceptance Criteria :
         *
         * ex : user story : As an user I should be able to login amazon home page .
         *
         * regression 80 % auto tested ,rest 15-20% manual test
         *
         * AC1 : Verify that user should be able to login with valid user name and password
         * AC2: Verify that system should display Error message as "your user name and password is not matching " when
         * user enter invalid user name or password
         *
         * sprint 5 --> the sprint backlog has 10 user stories
         * sprint 6 --> sprint backlog has 6 user stories
         *
         * Jira --- application management tool / test management tool , we use jira to create sprint backlog.
         *
         * we do stand up meeting around 30 minutes
         * scrum environment recommend 9-12 team members  including dev,testers,BA
         *
         * Since you all have group ,I want you all practice daily stand up meeting
         *
         * ticket : is is a task which we can create on Jira
         * Vyt-234 -- this ticket number is generated auto by jira .
         *
         * sprint review meeting == DEMO meeting
         *
         * sprint retrospective meeting 3 questions:  1,what went well ?
         * 2,what didn't going well ? 3,what could be improved in the next sprint ?
         *
         * what didn't going well ? developer always say " the Acceptance Cretia
         * is not clear ,content is not clear ,we don't understand ,
         * we had hard time to it .the requirement(user stories) not clear .....
         * what went well ? answer : our team collaboration goes well between developers , testers , scrum master BA..
         * BA very humble , developer very helpful ......
         *
         * in DEMO meeting, there are clients joining .retromeeting is our own team discussion.
         *
         * INTERVIEW QUESTION : Tell me about difference between test case and test scenario ?
         * test case is basically a documentation include test case ID, Test case description, pre-condition,
         * test data, test steps, expected result and actual result , then pass and fail
         *
         * test scenario is a higher level above than test case , it more general .if I give an example lets say
         * verify log in functionality when open up an application ,this is basically a test scenario .test case
         * would be more specific , test scenario including several test cases . for example log in functionality ,which
         * is a test scenario. one of a test case lets say student ,as a student , I should be able to log in
         * account with valid username  and valid password into my privacy account ,so I can check my grade , so this
         * is a one test case ,and its a positive test case ,I can write another case ,which is negative test case ,
         * the negative test case also belong to functionality test , lets say student log in with wrong
         * username or wrong password ,this is negative test case .
         *
         *
         * question: what type of testing have you performed so far?
         * Sedar Haytyyev mock interview :
         *
         * I start my day from checking my smoke test , most of time I maintaining  my
         * existing test cases, other than that I mainly doing about regression and integression test
         *
         * can you tell me about your regression suite ?
         * you have to answer how many percentage test cases you automated ,how many percentage
         * you do manual test ?(regression 80 % auto tested ,rest 15-20% manual test)
         * How long you doing regression .( you need to provide your regression
         * circle, whether its is every 3 month or every 2 month or every 6 month...
         *
         * Your regression is fully automated ?
         * yes . yes, we  also manual testers do manual tests , I myself in charge of automation test.
         *
         * Is there any test cases done by manual tested ?
         * yes, we also do manual test , most of time.
         *
         * are you working under Agile or waterfall ?
         * I work under Agile scrum model.
         *
         * how long is your sprint ?
         * our sprint is lasting 2 weeks
         *
         * can you introduce your team ?
         *
         * Are you prefer Agile or waterfall methodology?
         * it depends on the requirement and expectations by clients .
         * most of time we work under Agile. if its a big project,
         * it always requiring improvement during the process ,if that in case ,we work under the
         * Agile methodology
         *
         * IN Jira software ,the drop down menu :
         *  create Story ---BA create Story, tester no doint that .
         *  create test ----create test case
         * in " Summary " cloumn : always short name , ex : purchase functionality
         * Description column :  always attaching user stories and acceptance cretiare .
         * Reporter column : whoever create a ticket ,it automatically showing up the name there
         *
         */

    }
}
