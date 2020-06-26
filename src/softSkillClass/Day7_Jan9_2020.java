package softSkillClass;

public class Day7_Jan9_2020 {


//        unit test is white box testing
//     *
//     * Agenda : Interview question
//     *
//     * Scrum meeting :
//     * 1, stand up meeting : 15 min  in the meeting ,3 main questions : 1, what I did yesterday ?
//     *                                                                  2, what I will do today ?
//     *                                                                  3,what's in my way ?( my impediment )

//      Sprint planning : discuss about user stories give a point for each user story and prioritize them and
//      discussing about "Sprint Goal" then move them to sprint back log.
    // sprint goal means : how many user stories you wanna work on now

    // sprint review meeting / also known as sprint demo meeting : demonstrate our work to client and get
    // some feedback , normally this meeting takes about 1 hour

    // sprint Retro meeting : in this meeting we discussing about : what went well ,what is not going well,
    //how do we improve for the next sprint.
//     *
//     what is Requirement ?
//     *
//     *  The software requirements are description of features and functionalities of the target system
//     *  Requirements convey the expectations of users from software product.
//     *
//     *  The process to gather the software requirements from clients , analyze and document them is known as
//     *  requirement engineering
//     *
//     *  The goal of requirement engineering is to develop and maintain sophisticated and descriptive
//     *  System Requirements Specification document
//     *
//     *  // IF YOU INTRODUCE YOUR TEAM IN INTERVIEWS , JUST SAY YOUR TEAM HAVE 4 OR 5 TESTERS FOR SAFE SENARIOS.
//     *   WHEN YOU ANSWER ANY TESTING QUESTION, MUST SPEAK UP THE KEY WORDS ,FOR EXAMPLE ,IF YOU TALK ABOUT
//     *   UNIT TESTING , JUST SAY TESTING SINGLE CODE , WHEN YOU TALK ABOUT BLACKBOX TESTING AND WHITEBOX TESTING
//     *   , FOR EXAMPLE , WHITE BOX TESTING JUST TEST CODE ITSELF, MOST TIME DONE BY
//     *   DEVELOPER HIMSELF BECAUSE THEY NEED TO TEST CODE BEFORE HE
//     *   RELEASE TO YOUR TEST ENVIRONMENT . TESTERS MOST OF TIME WORKING ON BLACK BOX TESTING BECAUSE I ONLY
//     *   WORK ON FRONT-END APPLICATIONS . THAT MEANS WE ONLY TESTING THE UI ( USER INTERFACE) WHEN YOU ANSWER ,
//     *   YOU MUST BE FLUENTLY .
//     *
//     *   SMOKE TESTING ,REGRESSION TESTING ALSO BLACK BOX TESTING WHEN WE DO BLACK BOX TESTING ,WE DON'T
//     *   TEST ANYThING RELATED TO THE CODE ,IT JUST FRONT-END
//     *
//     *   CHECK THE DEFINITION OF FRONTEND AND BACKEND TESTING IN GURU99.COM
//     *
////     *   QUESTION : WHAT IS YOUR WEAKNESS ? WHAT IS YOUR STRENGTH
//     *
//     * 2, Sprint planning : discuss about user stories
//     * give a point for each user story and prioritize them and " Sprint Goal " then move them to sprint back log
//     * 3, Sprint review/ demo : what is demo meaning ? its demonstrate our work to client and get some feedback
//     * who is doing demo ? Developers and testers do in most cases , demo normally 1 hour
//     *
//     * Sprint Retrospective meeting  : what went well , what is not going well , how do we improve for the next sprint ?
//     *
//     * user story point size is base on at least : Effort , Complexity, Doubt(doubt means any uncertainty)
//     *
//     * As a user I can login through a social media account(this is user story )
//     * Acceptance Criteria :
//     * 1,Verify that user can login through Facebook
//     * 2,..................................LinkedIn
//     * 3....................................Twitter
//     * 4,...................................Email
//     *
//     * In this case ,before I start testing , I need to prepare some test data :
//     *
//     * Effort :prepare test data.
//     *
//     * what is test data ? is actually input given to a software program. It represents data effects or
//     * is affected by the execution of the specific module.
//     *
//     * positive testing we need positive test data : ex, login functionality : valid user name and valid password
//     * Negative testing we need negative test data: ex, invalid username and invalid password
//     *
//     * SMTP---EMAIL VERIFICATION PROTOCOL (Simple Mail Transfer Protocol)
//     *
//     * you don't need to ask your team how many points for user story if you at work .if user story too big
//     * you need to break it down.
//     *
//     * What is team capacity ?
//     * team have 5 testers ,
//     * one tester work 8 hours = 1 point per day
//     * 2 week sprint , 10 days - 2days( eating ,meeting ...) = 8days ( 1 point per day ,total 8 points)
//     * whole team ( 5 testers ) ==>> 5*1=5 points ,per day  so 8 days whole team points is 5x8=40 points(one sprint)

    // This 40 points is my team capacity  Therefore, when we give points to each user story should be
    // realistic and careful ,because the team capacity is 40 points, our total user story points can not be
    //exceed the team capacity . ( this case we have 5 testers, if we have 4 testers ,the capacity would be 32 points)
    // in another word : the velocity should not exceed the capacity . velocity == the total points of user stories
    //

//     *
//     * sprint backlog:
//     *
//     * estimation :
//     * story point : fibonacci ,linear
//     * ideal day : 1 day = 1 point
//     *
//     * developer points and testers points are same or no in a same user story?  NO
//     * Their points are separately .
//     * grooming meeting : estimate each user story and give a point
//     * if you are in scrum team, while we are (whole team ) in sprint 5 ,as testers we are actually working on sprint 5 user stories
//     * but developers working on user stories in sprint 6 backlog.
//     *
//     * team capacity is 40
//     * sprint backlog , the velocity should be less than capacity (40)
//     * velocity-- the total points of user stories

//
//     *Describe your typical day at work?
//
//My day at work typically starts with making a “to-do” list of things I need to work on that day.
// A list might include but not be limited to, any of the following:
//
//Check my email (confirm is there any meeting that I need to attend)
//Attending Daily scrum meeting or any knowledge transfers meeting.
//Continue work on a task, reading requirements to better understand which kinds of test cases I need to build
//Writing automation scripts in scenarios where there is a need for automation
//Executing the testing and coordinating with developers to check the defects that I have found
//Meeting with the development team to communicate the daily defect log and plan around fixing and retesting defects.


//What is Software Development Life Cycle?
//
//The systems (or software) development life cycle (SDLC) is a conceptual model used in project management
// that describes the stages involved in an information system development project
// from an initial feasibility study through maintenance of the completed application.
//
//It includes the following different stages:
//
//1.Requirement
//
//2.Design phase
//
//3.Coding
//
//4.Testing
//
//5.Release (Production)
//
//6.Maintenance
//

//What is the Requirement?
//
//- Describe how the functionality works or telling you what is the expected result of specific functionality.
// As a tester we always testing applications based on the requirement.
//


//Which is a better testing methodology: black-box testing or white-box testing?
//
//Both black-box and white-box testing approach have their own advantages and disadvantages.
// Black-box testing approach enables testers to externally test the system on the basis of specified requirement
// and specification and does not provide the scope of testing the internal structure of the system,
// whereas white-box testing methodology verify and validates the software quality
// through testing of its internal structure and working.
//
//=================================
//
//scrum meetings :
//
//1>stand up meeting : 15 min, <what i did yesterday?, what i'm going to do today?,
// Is there any impediment ?>
//
//2>Sprint planning : discuss about user stories give a point for each user story and priorityze them
// and create "Sprint Goal" then move them to sprint back log. 1-2 hr
//
//3>Sprint review / demo : demostrate our work to client and get some feedback. 1 hr demo is done by either developers
    // or testers
//
//Sprint Retro : what went well, what is not going well, how do we improve for the next sprint.( you can talk about
    // some ppl came late , the meeting supposed be 15 minutes ,now we have to do 30 minutes , this is what we
    // need to improve .) EVERYONE IN SPRINT RETRO MEETING , WRITE DOWN FOR THOSE THREE DIFFERENT QUESTIONS
    // ON DIFFERENT COLOR STICKY NOTE. THEN SCRUM MASTER STICK THEM ON THE WALL , THEN WE DISCUSS ONE BY ONE .
    // OKTA , SLACK AND ZOOM ARE THE MOST POPULAR TOOLS THAT MOST COMPANIES USING
//
//==========================================
//
//Ex:
//
//user story : As a user i can login through a social media account.
//
//Acceptance Criteria:
//
//1.Verify that the user can log in through Facebook
//
//2. ...............................LinkedIn
//
//3.................................Twitter
//
//4. ................................Email
//
//
//
//Before I testing I need to prepare some test data :
//
//Effort: prepare test data for the above user story takes more effort
//
//
//
//what is test data?
//
//-- is actually the input given to a software program.
// It represents data that affects or is affected by the execution of the specific module.
//
//positive testing we need positive test data: ex, login functionality: test data ->valid user name and valid password
//
//Negative testing we need negative test data:
//
//ex, invalid username, and invalid password.
//
//
//
//SMTP-- EMAIL VERIFICATION PROTOCOL.
//
//What is team capacity ? ==(testers number )* 8 point
//
//one tester ,  1 day (8 hours) = 1 point
//
//2 weeks sprint , 10days - 2days=8days(8 point)
//
//whole team (5 testers)==> 5*8=40 point
//
//         if  (8 testers)==> 8*8=64 point
//
//sprint backlog:
//
//
//
//estimation :
//
//story point : fibonacci , linear
//
//ideal day : 1 day = 1 point
//
//================================================
//
//dev , tester
//
//grooming meeting : estimate each user story and give a point
//
//while we are (whole team ) in sprint 5 ,
// as testers we are actually working on sprint5 backlog  user stories.
//
//but developers working on user stories which is  in sprint 6 backlog
//
//team capacity is 40
//
//sprint backlog, the velocity(total point of user stories) should be less than capacity (40)
//     *
//     *
//     *

}
