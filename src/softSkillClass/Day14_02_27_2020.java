package softSkillClass;

public class Day14_02_27_2020 {

    /**
     * web-based application vs desk top application
     *Hello Everyone
     * Today we are going to:
     * 1. start new project
     * 2. cover 2 INTERVIEW QUESTIONS
     * 	a. tell me about your day to day activities
     * 	b. tell me about your responsibilities
     * 3. NO QUIZ
     *
     *
     * Tell me about your Day to Day activity
     *
     * My shift starts at 8am,
     *            first thing I check my email for the results of my smoke test which is scheduled to execute at 6 am,
     *            at the end of execution it will auto generate a report and send out to the whole team
     *            (purpose of smoke test make sure that the application is up and running.)
     *            If there is a problem;
     *             I will rerun the smoke test and analyze if the problem is from environment or from my script.
     * - If it is a service issue, I will immediately contact devops?
     * - If it is about my scripts, I will debug my scripts
     * - If it is a bug, I will reproduce it and log the defect.
     * Then I check my emails which I may have received yesterday after I left my desk,
     * to make sure that I am not missing anything from yesterday.
     *
     * Then I open and check my Jira board, basically getting ready for my daily stand up which takes place at 10 am everyday.
     * At stand up as a team we discuss what we did yesterday, what we are working on right now
     * and more importantly if there are impediment/blockers holding me to do my job, impediments.
     * By the way, I also stand up at this meeting to share team mates feelings.
     * After stand up I go back to my desk and start working on my tasks.
     * We have a core hour policy till 12:00 for about 2 hours in our company;
     * and everybody head down and work at that time period, no distraction, no one can set up a meeting after daily standup till noon.
     * My tasks differ depending on which part of sprint our team is.
     * Let's say if it is early sprint,
     *            I would participate in planning and grooming meeting where we go over the user stories and pointing them.
     *            Also, I would work on maintaining my framework, participate in test scenario reviews.
     *            Towards the mid sprint where the code is being released, I would complete my automation and start execution.
     *            If it is towards to the end of the sprint, I would be busy with getting reports ready and participate in demo.
     *            Also, we have retro at the end of the sprint.
     *
     * Every Tuesdays we have lunch and learn session where we share our coding and automation experience,
     * we do this as a brown bag lunch, and it really helps us increase our overall productivity,
     * saving the company resources and money but also, gives us the valuable opportunity to get to know each other.
     *            Also, every Friday we have code review meeting among automation testers of the project.
     *            As I know java, I also participate in developers code review meetings just to get an idea of the code.
     * So, this is basically my day.
     *
     *
     *
     *
     *
     * tell me about your responsibilities
     * Describe your role?
     *
     * I am responsible for maintaining our "test automation framework" based on the POM and adding new test cases to our automated regression suite.
     * I performed various types of testing, like; functional testing, smoke testing, regression testing and back-end testing.
     * I am also responsible, in my current project, to execute Regression test when developers add new functionality
     * to the application or every end of the sprint.
     * I run the entire regression suit before each release, in 3 months.
     * I analyze the test result. I provide a pass-fail report. I monitor the execution to see if anything is wrong,
     * once it fails. If it fails because of my code I have to fix my code. (Perhaps during that time, the application was down,
     * and I ran my script at the wrong time.) If there is really a defect, I log the defect and test it again until it is fixed.
     * As a Cross functional team member, I help the functional testers, teach them basic automation framework,
     * Java and Selenium to make them part of the team, All to improve productivity of the team.
     * At least they can execute test cases and analyze the results.
     * As a CROSS FUNCTIONAL team member, I also try to help the functional testing team whenever it's needed,
     * to execute manual test cases. And if there is any defect that I am able to reproduce, I log the defect to JIRA.
     * In sprint grooming meeting I always give feedback to the user stories to make sure it is something testable and measurable.
     * For example: there were a user story said after such and such change in the application the performance should improve.
     * I have asked the business people what do you mean by performance improvement? How do you measure the improvement?
     * After that they have come up with better user stories (requirement in agile)
     * Beside that I can tell you one of my responsibilities which I really enjoy is user story generating sessions,
     * because it is very interesting from a user's perspective. Because we are the ones testing the application all the time.
     * I am thinking from the end-user perspective. I think I am doing good, by putting myself in the end user's perspective.
     * Therefore, when we attempt user story sessions, we are making our acceptance criteria much better.
     * So, Business Analyst go over the user stories, they go over the acceptance criteria,
     * we ask questions we give feedback, improve user stories therefore making our team more productive.
     * Because we have better, clear acceptance criteria. That makes us, our requirements better, our code better,
     * clearer and we are avoiding some of defects in terms of the user story generation session itself,
     * instead of having unclear a user story, making unclear code, making something wrong.
     * Also, as a part of the Agile Scrum Team, I participate in the several walkthroughs meeting for the requirement reviews
     * and provide valuable feedback to the BA.
     * That is pretty much about %8o of my role as an automation engineer in my current project.
     *
     *
     *
     * test scenario just one sentence :  ex : Test scenario :
     * test case is most like examples , like step 1 ,step 2 ,step 3.....
     *
     *User Stroy : as an authorized user I should
     * be able to make a reservation on book it
     * application.
     * Acceptance Criteria:
     * Verify that team lead or teacher ( authorized user) should be able to make a reservation
     * verify that authorized user can reserve only one room maximum per day
     * verify that authorized user can canceled reserved room at any time
     * verify that during the reservation  authorized user only book the room for future hours and system
     * should not allow the user book passed time/date
     * ============================================================================================
     * what we do in peer review ?  you need to check related functionality ,check if the scenario applicable ,match the description or not ?
     * you can also add comment . check any scenario missing or not ?  if only have positive scenario ,we can add negative ones.
     *
     *
     *MAKE AT LEAST 2 SCENARIO ( POSITIVE AND NAGATIVE ) FOR EACH Acceptance Criteria .
     * It doesn't matter your test case or your scenario duplicated with others
     * Before you create test case you should come up with test scenario.
     *
     * step 1. you will discuss with your team,discuss about how to submit test case .
     *
     * step 2. as long as you understand the AC ,write down positive and negative scenario for ech AC then
     * start to write your rest case
     *
     * step 3, once you done with your test case assign one of our team member to peer review.
     *
     * step 4. team lead will upload test case doc to google form.
     *
     *
     * Seda Civan
     * asking about today project  :
     * We all have 1 user story
     * for 1 user story => there are 4 AC
     * for 1 AC => we will write at least 2 Scenario
     * for 1 Scenario we write at least 1 test case
     * Is it right understanding ?
     * Thread in #soft_skill_chat | Today at 5:45 PM | View message
     *
     * 3 Amigo meeting : conducted by BA, DEVELOPER ,TESTER discuss about particular user story and Acceptance Criteria.
     * tester will arrange this meeting , as long as you get new user story, if you have any question about this new user story
     * you need to arrange this meeting . in interview you can mention this 3 Amigo meeting .its good collaboration team.
     *
     * GUljanat version of interview question :
     *
     * 1. what is your day to day activities ?
     * My shift start from 8am, the first thing first is : I check my smoke test result and make sure application is up and running.
     *(smoke test run early morning/ or night ) – result will be emailed to me ( everyone)
     *
     * The moment I get to work I check my smoke test result. If it failed I contact the developers right away /
     * if everything is good I go through emails that I received and then I open Jira and start preparing to Stand Up meeting.
     * (What have I done yesterday..etc..)  and for that Jira is important since I may not remember how many bugs are open since yesterday
     * and 3 of them maybe passed and maybe one is still pending.. I write down the ticket number of that story
     * and this number may be needed during the stand up meeting . After I work on my test cases
     * After stand up meeting I come back to my desk. I look at new user story (if it is beginning of sprint) analyze AC
     * and make sure I understand . go to BA if I have questions for requirements
     * If I have questions regarding the functionality I go to developers
     * I can also add 3 amigo meeting : (developers BA and testers : informal meeting that tester arranges )
     * in order to discuss user story ( 10 – 15 min for one user story)
     * I create test cases / with different scenarios / I can do peer review with members
     * // if I am in the middle of the sprint :
     * Manual execution / peer reviewing test cases ( or scenarios) – but better peer review test cases
     * If I do automation: I maintain my framework/ create more automation scripts /
     * if automation is ready then I do peer review of our scripts
     * //if it is end of the sprint ( executions are done) any bug that I opened I need to be responsible to close them all .
     * I need to track all bugs and update their status ( pass or fail) also I attend to retro and demo meetings
     *
     *
     *
     *
     * 2. Tell me about your responsibilites :
     *
     * My main responsibility for current application is :
     * I involved analyzing user stories, AC ,and design my test case with all possible scenarios.
     * Automate, run and maintain my smoke test suite
     * I also responsible for maintaining , automating test scenarios for regression test suite and make sure it's tested
     * with all possible scenarios.
     * As a cross functional team member I peer review manual tester's test cases or test scenarios.
     * and give a valuable feedback on them.
     * our team is super agile team which mean we are collaborating with each others ( developers ,BA) and helping everyone to
     * reach sprint goal meet the dead line in every single sprint.
     * I am also attending sprint planning meeting and give a point for each user story and help my team to
     * prioritize them.
     * Since I am SDET, I always participate automation team code review meeting
     *
     *
     *
     *
     * Guljanate ultimate version of class note and interview questions :
     *
     * User story: as an authorized user I should
     *
     * be able to make a reservation on the book its application.
     *
     * Acceptance Criteria :
     *
     * • Verify that team lead or teacher (authorized user)should be able
     *
     * to make a reservation
     *
     * • Verify that authorized user can reserve only one room maximum
     *
     * per day
     *
     * • Verify that authorized user can cancel the reserved room at any
     *
     * time
     *
     * • Verify that during the reservation, authorized user only book the
     *
     * room for future hours and system should not allow the user book
     *
     * passed time/date
     *
     *
     *
     * ==========================================================
     *
     *
     *
     * MAKE AT LEAST 2 SCENARIO (POSITIVE AND NEGATIVE ) FOR EACH Acceptance Criteria
     *
     * It doesn't matter your test case or your scenario duplicated with others.
     *
     * before you create a test case you should come up with test scenario,
     *
     *
     *
     * step 1. you will discuss with your team how to submit a test cases.
     *
     * step 2. as long as you understand the AC, write down positive and negative scenarios for each AC then start to write your test case.
     *
     * step 3: once you are done with your test case assign one of your team members to peer review.
     *
     * step 4: Team lead will upload test case doc to a google form.
     *
     *
     *
     * Come back at 9:05 pm
     *
     * ======================================================
     *
     *
     *
     * 3 Amigo meeting: conducted by BA, DEV, Tester discuss particular user story and Acceptance Criteria. the tester will arrange this meeting.
     *
     *
     *
     * Interview questions:
     *
     * 1. what is your day to day activities?
     *
     * 1. My shift starts at 8 am, first thing first I double-check the results of my smoke test,
     * make sure that the application is up and running.
     *
     * 2. Then I am focusing on my emails which I received yesterday after I left my desk,
     * to make sure that i am not missing anything from yesterday.
     *
     * 3. Then I am opening my Jira board, basically getting ready for my daily stand up which occurs at 10 am every day.
     *
     * 4. In stand up meetings,  as a team, we discuss what we did yesterday what we are working on right now
     * and more importantly if there is anything that holding me to do my job, impediments.
     *
     * 5. After stand up I go back to my desk and continue work on my task:
     *
     * depending on which part of sprint our team is my tasks differ.
     *
     * 6.lets say if it is early sprint I would participate in a sprint planning meeting where we go over the user stories
     * and pointing them. also, I would work on maintaining my framework, participate in test scenario reviews.
     * towards the mid-sprint where the code is being released, I would complete my automation and start execution.
     *
     * 7.if it is the end of the sprint I would be busy getting reports ready and participate in the demo meeting.
     * Also, we have a retro meeting at the end of the sprint.
     *
     * 8. Every Tuesdays we have lunch and learn sessions where I share my coding and automation experience with my fellow manual testers,
     * also every Friday we have code review meeting among automation testers of the project.
     * As I am a java certificate I also participate in developers' code review meetings just to get an idea f the code.
     *
     * 9. So this is basically my day, oh I actually forgot about coffee :) I do not start my day without a cup of coffee.
     *
     *
     *
     * tell me about your responsibilities?
     *
     *  my main responsibilities for current application are  :
     *  I involved analyzing user stories, AC, and design my test case with all possible scenarios.
     * Automate, run and maintain my smoke test suite
     *  also responsible for maintaining, automating test scenarios for the regression test suite
     *  and make sure it's tested with all possible scenarios.
     * As a cross-functional team member, I peer review manual tester's test cases or test scenarios.
     * and give valuable feedback to them.
     * our team is a super agile team which means we are collaborating with dev,
     * BA and helping everyone to reach our sprint goal meet the deadline in every single sprint.
     * I am also attending a sprint planning meeting and give a point for each user story and help my team to prioritize them.
     *  Since I'm SDET, I always participate in the automation team for code review meetings.
     *
     *static method can not be overriden
     * method overloading is called method binding
     * method overriding is called  dynamic binding
     * is-a relashionship(inheritance) and has-a relashionship ( ploymorphsym)
     *
     *
     * Day15,March 5,2020
     * Real time worker showing us agile scrum team
     * what she said is all REAL THING ,and in interview and realy work ,we should do the same thing ,say the same thing.
     *
     * Scrum meeting is about to start, Mavluda is running the meeting (will be the Project Manager)
     * Muge, Karima and Maxim and Abbos will be the testers.
     * Vlad, Burhan and Tanya, Sveta, Mehtap, Khumayra and several more are devs.
     * BAs: Abdullo and Parvin.
     *
     * Monday ,: developer start saying ,hi guys ,what did you do on Friday ?  user story BA write . when dev developer
     * in future ,if he has question ,he check with BA ,AND dev have rules to modify it . each features and functionality
     * they create ticket( ticket = user story ,some company say ticket ,some call it user story)
     * . developer pretty much sayin this on monday moring : a tester found a defect yesterday , and he ..
     *
     *
     *
     */



}
