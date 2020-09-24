package office_hour.practice02_06_2020;

public abstract class States {

    public abstract void tax();


}

class Kentucky extends States{

    public void tax(){ // override method the parent class "State"
        System.out.println("Tax Rate in KY is 6%");
    }

    public void KFC(){
        System.out.println("KY has KFC");
    }
}

class California extends States{

    public void tax(){
        System.out.println("Tax Rate in California is 9%");
    }

    public void HollyWood(){
        System.out.println("There is Hollywood in CA");
    }
}
