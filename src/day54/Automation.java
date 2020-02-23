package day54;

public class Automation {

    public static void main(String[] args) {

        System.out.println("----Running on Chrome");
        WebDriver c1 = new ChromDriver();
        //interview question : please explain line 7 !
        //answer : ITS POLYMORPHISM METHOD !!!
        c1.openBrowser();
        c1.navigateTo("www.cybertekshcool.com");
        c1.maximize();
        c1.closeBrowser();

        System.out.println("---Running on Firefox");
        c1 = new FirefoxDriver();
        c1.openBrowser();
        c1.navigateTo("www.cybertekschool.com");
        c1.maximize();
        c1.closeBrowser();

       // WebDriver w1 = new ChromDriver();

    }

}
