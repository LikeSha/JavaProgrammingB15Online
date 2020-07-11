package softSkillClass;

public class Day11_02_06_2020 {

    // today's inter view question good ! all employees answered very good ,need to watch again , Feb 6,2020 video
    /**
     *
     * test case and test scenario difference ?
     *
     * test case is documentation ,that include test case ID, Test case description,pre conditions,test steps,test data,
     * and expected result, actual result ,and pass/fail ,test case is a low-level
     *
     * test scenario is a high-level document, it including more detail about each user story, for example : if I wanna
     * test a specific functionality of an app, lets say : log in function, it considered test scenario.
     *
     * test scenario is a collection of test cases . test scenario written in JIRA
     * Test Case Is A Set Of Steps In Order To Validate Test Scenario
     *
     * tell me about your sprint ? how many team member you have ? this answer just listen Daria video in this class
     *
     * can you talk about testing cycle ?
     *
     * STLC :
     * Requirement analysis --> test plan --> test case --> then next sept -->
     * Environment set up  : two main things :
     *
     * testers test the application in TEST ENVIRONMENT
     * in sprint , user stories after tested in TEST EVN ---staging (those user stories are saving into staging environment)
     *
     * after tested those users stories ,are we directly pushing them into production environment ? NO !! Because
     * every single sprint we don't release production ,we are collecting user stories until product owner schedule
     * the release date . when that day coming ,we do major regression in staging environment .then we release
     * production . staging environment == pre-production
     *
     * UAT team : whoever testing UAT testing ,they are using UAT environment
     *
     *
     *
     * 1. which environment we need to testing of those user stories .
     * 2.environment is up and running
     *
     * in sprint : user stories after tested in TEST EVN--> staging Env
     * test environment can be multiple .
     * testers test the application in TEST ENVIRONMENT
     *
     * example : amazon production env : www.amazon.com
     *           amazon test evn : www.amazon-qa1.com
     *
     *           what if your test case iS failed ?(defect ) if test case iS failed ,we open the box !
     *           what is test case failed mean? it means the actual result dose NOT match the expected result !
     *
     * (before we go this topic ,we say something related bug interview questions :
     *
     * 1. how do you handle if you found a bug ?
     * During test execution , testers are reporting mismatches as defects to developers through templates
     * or using tools, we are using Jira-Xray tool
     *
     *  ANSWER : ( see today's power point page 25 ) when I found a brand new bug , I reproduce bug couple of times
     *  with different test data ,if the bug still exist ,
     *   then I write my bug report and assigned it to developers ,
     *  and that moment the bug status changed to be " open " , then developers analyze the bug I sent to them,
     *  (when I assigned to them ,I also provided more details: like what test cases I was using ,what test data,
     *  under what environment I found that bug , and then they confirmed whether it is a valid bug or not .
     *  If it is a valid bug ,the developers try to fix it., once it fixed , developer assigned it to testers,
     *  then testers retest it ,why retest it ? because you don't know if the bug still exist
     *  even developers fixed the bug ,I have to double check it is fixed or not ,
     *   if after retest and I found bug is fixed ,then I close the bug , If
     *  it not fixed , means still existing in same place ,I have to reopen it and assigned it back to developers
     *  then the entire process going through this loop again .
     *
     *  If the bug I sent to developers is not a valid bug , then developers will reject the bug , if this happened ,
     *  there are two common situations : one is Not a bug , the other one is duplicated bug , so if you bug
     *  got rejected , you need to CANCEL this bug ,NOT CLOSE bug .
     *
     *  The other situation is , if the bug is a valid bug , but not got fixed in right after you report ,
     *  it just deferred ,it just postponed to the next release or the future sprint. what kind of bug deferred ?
     *  it is the bug not high priority or its not related to current sprint functionality , developers can deffer the
     *  bug .they can put it into backlog again and later on they create task to fix it .
     *
     * regression test purpose is : make sure that all existing and new functionalities working as expected.
     * Re-testing purpose is : only focus on specific funtionality and make sure that bug is fixed.

     *
     * 2.what tool are you using for bug report ? we are using Jira-Xray
     *
     * 3.what do you do if the defect/bug is rejected by developers ?(this is very important question ,add value question
     * this question also called " scenario based question ) you can also google this question .
     *
     * ANSWER : We always have conflict between us ( testers ) and developers , we think that is a bug ,but developers
     *  think that is not a bug . for example ,I am testing an application, lets say amazon . the applicants can
     * choose multiple options from drop down list , I found it that actually users can select the options at
     * the same time so that they don't have to waste their time to select one by one in drop down list . which is
     * like user friendly . so I just come up with that idea as an end  user perspective : when I click the
     * drop down list ,there are many options ,I can simply select those options at the same time and then move on.
     * but the system does not want me to select at one time , means select everything like multiple options
     * at one time ,the system only allows me to select option one by one , I select one ,and open drop down manu
     * again ,and select second one ... So I opened a bug ,the developer rejected ! this is the example I am
     * sharing . in developers perspective is : this is not in requirement so this is not a bug . that is happening
     * a lot in real work environment . but as tester , I am always thinking in end user perspective ,  I think that
     * should be fixed otherwise its not like user friendly. So what I do is : I have to crate a task in Jira,
     * I have to assign it to the Product Owner , my team lead , I email them and CC my team members and explain
     * why I am thinking this is a bug .after discussion ,the PO maybe will change the requirement and let the
     * developers fix the bug .
     *
     * 4.what do you do if the defect/bug is not reproducible ?\
     *
     * Answer : reproducible means : repeat your steps find a same bug
     * when we found a bug , we assign it to developers ,along with the proof , I have to take a  screenshot
     * or a video and send it to them ( under " Actual result " column )  ,
     * this is clear note in test step ,so they can easy to figure out
     * what is the issue
     *
     * non -reproducible : run time error ex : session time out  . sometime ,you find a bug , then you trying
     * to reproduce bug again ,means retest it ,bug the bug is gone . this is called run time error.
     *
     * session time out : ( must understand session time out meaning )
     * listen today's video again from : 1.11'52 to 1,15,20'
     *
     *  .
     *
     * 5.how do you report the bug ? what fields you need to enter on bug report ?
     *
     * new --> reproduce bug couple of times ( retest couple of times ) --> assigned to developers --> open --->
     * valid ---fixed ---assign back to testers--> retesting ---> closed or reopen
     *
     * retesting and regression difference ? interview question.
     * regression testing : In regression testing ,We repeat our previous test case ,
     * our purpose is make sure all existing and new functionalities working as expected
     * (Regression Testing: Is Done To Confirm That A Recent Program Or Updated Code Has Not Adversely Affected Existing Features)
     * retesting : we only focus on specific functionalities and make sure that bug is fixed.)
     *
     *
     * login functionality:  ( this is example for today course on canvas form " writing the bug report " powerpoint )
     * scenario : user should not access with invalid password
     * scenario : user should not able to access without entering password
     * steps for reproduce :
     * 1.as user log in to url : www.amazon.qa1.com
     * 2.enter valid user name as user 123@gmail.com
     * 3.enter invalid password as abvcg123#
     * Expected result : system should not allow user to login with invalid user credential.
     * Actual result : user was able to login with invalid credential
     * Test environment : www.amazon.qa1.com
     * Test data : user name : 123@gmail.com
     *             invalid password : abvcg123#
     * Note : however, while I am testing below scenario  it passed .
     *        user should not be able to access without entering password field.
     *
     * high severity and low priority---
     *
     *
     * summary : STLC
     * You need to know STLC process, able to answer it
     * 2.what is test plan doc ? who is responsible for write test plan document ?
     * 3.how to create test case ?
     * 4.difference between test case and test scenario
     * 5.bug life cycle?
     * 6.what do you do if the defect /bug is rejected by developers ?
     * 7.what do you do if the defect /bug is not reproducible ?
     * 8. submit STLC quiz before next Thursday class
     *
     * JIRA interview question :
     * 1.what are the issue types that are created and tracked via JIRA ?
     * 2.How you open a bug on JIRA ?
     * 3.Can you list the report types generated by JIRA ?
     * 4.Can you mention a way with which issue can be shared with other users in JIRA?
     * 5. What is the importance of linked in JIRA?
     * 6.What are the most useful JIRA  add-ons?
     *
     *
     *
     * INTERVIEW QUESTION : Tell me about difference between test case and test scenario ?
     *          * test case is basically a documentation include test case ID, Test case description, pre-condition,
     *          * test data, test steps, expected result and actual result , then pass and fail
     *          *
     *          * test scenario is a higher level above than test case , it more general .if I give an example lets say
     *          * verify log in functionality when open up an application ,this is basically a test scenario .test case
     *          * would be more specific , test scenario including several test cases . for example log in functionality ,which
     *          * is a test scenario. one of a test case lets say student ,as a student , I should be able to log in
     *          * account with valid username  and valid password into my privacy account ,so I can check my grade , so this
     *          * is a one test case ,and its a positive test scenario ,I can write another case ,which is negative test scenario ,
     *          * the negative test scenario also belong to functionality test , lets say student log in with wrong
     *          * username or wrong password ,this is negative test scenario .
     *
     *
     * after writing down my test cases ,our team will review each others ,its called test case review
     * what is test plan ? Day 9 softwaretesting part 1 pdf
     * what tools are you using in manual test ? JIRA
     *
     * can you tell me what did you do in sprint retro meeting ?
     *
     * can you talk about testing cycle ? we start with test scenario ,----then test cases description-->after test
     * cases created ,we do peer review ,all team members review each others test case . then --> we set up
     * test pre-condition --- then input test data ,--> then test steps established ,---- test case also including
     * expected result and actual result ,we compare , then we check the test pass or fail .  ( THis is
     * STLC STEP 3 : Test Case Creation process )
     *
     * keep in mind : grooming meeting is prior to sprint plan meeting . !!! in grooming meeting ,we are estimate
     * user story ,we give user story points , in planing meeting ,those user stories already given points ,so
     * now we prioritize them based on our capacity , and then we create sprint goal ,and move it into the sprint
     * backlog so that we can start up our sprint !
     *
     *
     * When we say create a bug means  we are creating a ticket in Jira , it also means " open a ticket or
     *  create a ticket "
     *
     *  create an issue in JIRA means create a bug , open a ticket ---> creating issue, bug ,ticket all same thing.
     *
     *  who open the bug ? whoever found a bug that person should open a bug ( ticket )
     *
     *  components == modules ( in jira work sheet when we crating bug that page , under summary ,it is
     *  components )
     *
     *  during the DEMO ,we can show stakeholders the bugs we found
     *
     *  use a tool named " snag it " to capture the picture as the bug proof
     *------------------------------------------------------------------------------------------------------------
     *  Defect severity level : Critical--> ex : log in functionality considered as critical level one . also means
     *  critical bug ! if users can not log in the account ,it caused amazon lose money ,because they can not
     *  purchase staff if not log in .  another example is :  after you log in email account . you want to send
     *  some attachment to your friend ,but when you click " send " button ,the email can not send out . this is
     *  critical bug !
     *  Critical level this defect indicates complete shut-down of the process,
     *  nothing can proceed further .
     *
     *  Major : it is a highly severe defect and collapses the system. However , certain parts of the system
     *  remain functional .  example : you sending email to a lot of friends in same time ,but you can not
     *  CC to everyone, this is considered Major bug!
     *
     *  Medium : It causes some undesirable behavior , but the system is still functional  .
     *  example : I logged in amazon account ,I added into my cart ,however ,I can not remove the item I just
     *  added in , this is considered Medium bug .
     *
     *  Minor : It wont cause any major break-down of the system
     *  ------------------------------------------------------------------------------------------
     *  Priority of defect : Priority is defined as the order which defect should be fixed
     *  How fast it has to be fixed ?  Higher the priority , the sooner the defect should be resolved .
     *
     *  Developer or Product Owner determines the priority level of defect
     *
     *  the company logo is belong to cosmetic issue , it is a high priority and low severity (minor bug ) .
     *  EXAMPLE ; in amazon user can not change their shipping address ,this is high priority and major(high) severity
     *
     *  in Test execution part ,if your test is pass ,you have to mark " pass " if your test is fail , you have to
     *  mark " fail "  and then you have to open a bug , and you go with multiple steps until your bugs
     *  fixed and closed ,and you have to tracking your bug everyday , and when everything is done ,our test cycle
     *  close ,test closure specifically in end of sprint , at end of sprint , the JIRA tool can generate different
     *  report for you , basically its team lead responsible for generating reports and send it to upper managers
     *
     *
     *  JIRA interview question :
     *      * 1.what are the issue types that are created and tracked via JIRA ?
     *
     *      ANSWER : THE issue can be bug, can be user stories , and can be test cases , we can created and track those issue types
     *      via JIRA .
     *
     *      * 2.How you open a bug on JIRA ?
     *      * 3.Can you list the report types generated by JIRA ?
     *      * 4.Can you mention a way with which issue can be shared with other users in JIRA?
     *      * 5. What is the importance of linked in JIRA?
     *      * 6.What are the most useful JIRA  add-ons?
     *
     *      what is IPIC ? IPIC is " big user story"
     *      *
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
     *
     *
     *
     *
     *
     */

}
