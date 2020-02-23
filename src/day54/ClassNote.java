package day54;

public class ClassNote {

    /**
     *
     * we can refer an object with it's own type or it's super type
     *
     * public abstract class Animal{
     *
     *     public abstract void speak();
     * }
     *
     * public interface IndoorPet{
     *
     * }
     *
     * public class Dog extends Animal implements IndoorPet{
     *
     * }
     * Dog d1 = new Dog();
     * Animal a1 = new Dog();
     * IndoorPet p1 = new Dog();
     *
     *
     * Create an interface called WebDriver
     *
     *      adding abstract behavior
     *        void openBrowser();
     *        void navigateTo(String url);
     *        void maximize();
     *        void closeBrowser();
     *
     * Create 2 implementing classes
     *        Chrome
     *
     *
     *
     *   interface Wearable
     *   interface Cosmetics
     *  class :Clothes class , watch , Perfume , MakeUps and so on
     *
     *  Clothes class , watch , Perfume , MakeUps IS-A Wearable
     *  Perfume , MakeUps IS-A Cosmetics
     *
     */
}
