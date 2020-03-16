package day67;

public class ClassNote {

    /**
     * Agenda : Git/Github
     *   1 hour brake
     *   First maven project and introduction to test automation with selenium web driver
     *   Basic navigation : get(url), navigateTo(), close()....
     *
     *   ===========================================================================================
     *
     *   Today we gonna use terminal/powershell a lot. if you are windows user, please use pwoershell. just go to
     *   search and type PowerShell. Any windows has it by default
     *
     *   don't worry about git version, as long as you have it you are good to go. If you don't have a git yet,
     *   please download it from official website.
     *
     *   To check if you have a git, you need to run following command :
     *
     *
     *   if you are not getting any erros, you are fine.
     *   git version 2.21.1
     *   git--is a tool . VCS ( Version Control System)
     *
     *   SCM--Source Code Management
     *   You can use git in intellij without even installing it  It's because intellij has git too.
     *   But even we want to use git as CLI(Command Line Interface ) we need to install it first
     *
     *   what is VSC in action ?
     *
     *   My project ---lets say its your java project
     *
     *   public class MyFirstTest{
     *
     *       public void test1(){
     *           go to google.com
     *           get the text
     *           assert that title is equals to "Google"
     *       }
     *   }
     *
     * Once you decide that this is a first version of your project ,you can commit changes .
     * commit changes ---- means take a snapshot of the project at this point.
     * I would say git it's kind of time machine for your project
     * The main role of git is to track changes . Why tracing changes is so important ?
     * Because , if something will go wrong ,we can find what change in the code broke it .
     *
     * version 2;
     *
     * public class MyFirstTest{
     *
     *     public void test1(){
     *         go to google.com
     *         get the text and print it
     *         assert that title is equals to "Google"
     *     }
     *
     *     public void test2(){
     *         go to facebook.com
     *         get the text and print it
     *         assert that title is equals to "Facebook"
     *     }
     *
     *
     * }
     *   Once you have completed your test #2 , commit this changes, just in case .
     *
     *   Git can show you the difference from version to version. When (data,time) what file ,what line was added,
     *   modified or deleted. And the most important ---by whom!!! Also ,why ??
     *
     *   How you can figure out why ? There is something that calls "commit message". Every single commit must be followed
     *   by commit message. Whenever you commit , you must describe what you have changed in this version of the code.
     *   How this version is different from previous.
     *
     *   In real work environment , many people can work together within the same project .
     *
     *   But if project is on my computer , how other people can access it ?
     *   For this , we use github. Github --its a storage for projects. Every collaborator (project contributor ) has a copy
     *   of the project .Then ,github has a main copy.
     *
     *   In case of google drive , everyone works on the same document.
     *
     *   In case of github(based on git)--everyone has a copy of the project.
     *
     *   If you are getting warning : cannot open this file because it's from unidentified developer....go to
     *   security & privacy---> general ---> click on open anyway. Then try to install again.
     *
     *   Github ---it's wearhouse for git project.
     *   Let's setup git username,email and password
     *   How to setup?
     *   Open terminal/powershell and write following command:
     *
     *   please use your github email here
     *   This command is needed for git, know which account to use when you gonna work with github.
     *   Otherwise , it will ask you username/password every time.
     *
     *   git config ---global user.email"email@gmail.com"
     *
     *   once you enter this command, you will not see anyting .if you see FATAL something went wrong.
     *
     *   git config --global user.name"github username"
     *   git config --global user.password"github password"
     *
     *   To change it , run it again
     *
     *   How to see config?
     *   Just enter git config -l, and then use arrows on your keyboard to scroll over git settings.To exit from the log press 'q'
     *
     *   -l- stands for list
     *   git config -l or git config --list
     *   on mac, you can find. gitconfig under user directory file and open it with sublime.All smth files are hidden.
     *   To see these kind of files, in terminal, you can use following commandL
     *   ##### For mac#######3
     *   How you can get those config file L
     *   ls -a
     *
     *   or ,just open users directory with a finder and press command + shift + .
     *   To see hidden files.
     *
     *   =========================================================================
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
