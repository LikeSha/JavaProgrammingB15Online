package day29;

public class HeroIdentity2 {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent" ;

       // String[] heroSplitted = hero1.split("-");
        //String heroCode = heroSplitted[0];
        //String fullName = heroSplitted[1];

        String stars = "" ;
        for (int i = 1; i < hero1.split("-")[1].length() ; i++) {
            stars += "*" ;

        }
       // System.out.println("stars = " + stars);

        //String heroX = hero1.replace(heroSplitted[1],stars);// String heroX = hero1.replace(fullName,stars);
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + hero1.replace(hero1.split("-")[1],stars));

    }
}
