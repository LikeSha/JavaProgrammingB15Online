package day48;

public class Lion extends Mammals {


    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        // any class you created , it an be a data type for a variable
        //also know as reference variable

        Animal a1 = new Lion();
        a1.makeNoise();

    }




    @Override
    public void drinkMilk() {
        System.out.println("Lion drink milk");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lion say roarrrrrrrr!!!!");
    }


//    public abstract void makeNoise();
//    public abstract void drinkMilk();




}
