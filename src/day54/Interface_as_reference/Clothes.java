package day54.Interface_as_reference;

public class Clothes implements Wearable {

    int size;

    public static void main(String[] args) {

        // try out all the polymorphic assignment
        // according to these relationship

        Clothes c1 = new Clothes();
        Wearable c2 = new Clothes();
        Object o1 = new Clothes();

        System.out.println("------------------------");

        Watch w1 = new Watch();
        Wearable w2 = new Watch();
        Object o2 = new Watch();

        System.out.println("-------------------------");

        Perfume p1 = new Perfume();
        Wearable p2 = new Perfume();
        Cosmetics c3 = new Perfume();
        Object o3 = new Perfume();

        System.out.println("-------------------------------");


        MakeUps m1 = new MakeUps();
        Wearable m2 = new MakeUps();
        Cosmetics c4 = new MakeUps();
        Object o4 = new MakeUps();


        Cosmetics m3 = new MakeUps();


    }

    @Override
    public void wear() {
        System.out.println("Wearing Clothes!!");
    }
}

class Watch implements Wearable {

    @Override
    public void wear() {
        System.out.println("Wearing Watches!!");
    }
}

class Perfume implements Wearable, Cosmetics {

    @Override
    public void wear() {
        System.out.println("Wearing Perfumes!!");
    }
}

class MakeUps implements Wearable, Cosmetics {


    @Override
    public void wear() {
        System.out.println("Wearing Makeups!!");
    }
}