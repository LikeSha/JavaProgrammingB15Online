package InterviewsCodeKnowledge;

public class VerifyElementDoesntExistsAnyMore {

    public static void main(String[] args) {
         /*
         /**
     * Interview question:
     *
     * How to check if element doesn't exists any more in DOM (Document Object Model
     * @param args
     */

        // This is interview question :
        // hwo to check if element doesn't exists any more ?
        // fall2019Selenium project day 4

        /**
         * WebDriverManager.chromedriver().setup();
         *         WebDriver driver = new ChromeDriver();
         *         driver.get("http://practice.cybertekschool.com/multiple_buttons");
         *         Thread.sleep(2000);
         *
         *         driver.findElement(By.id("disappearing_button")).click();
         *         Thread.sleep(2000);
         *
         * //        List<WebElement> list = driver.findElements(By.id("disappearing_button"));
         * //         // if size is 0, that means no elements were found
         * //        if(list.size()==0){
         * //            System.out.println("test passed");
         * //        }else{
         * //            System.out.println("test failed");
         * //        }
         *
         *         if(driver.findElements(By.id("disappearing_button")).size() == 0){
         *             System.out.println("TEST PASSED");
         *         }else {
         *             System.out.println("TEST FAILED");
         *         }
         *
         *         Thread.sleep(2000);
         *         //to find all buttons
         *         //make sure that you use findElements<-----------ending is important
         *         List<WebElement> buttons = driver.findElements(By.tagName("button"));
         *
         *         for(WebElement button : buttons){
         *             //click on every button
         *             button.click();
         *             Thread.sleep(2000);
         *         }
         *
         *
         *         driver.quit();
         *         }
         *
         *
         */
    }
}
