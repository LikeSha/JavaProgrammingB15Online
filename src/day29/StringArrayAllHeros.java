package day29;

public class StringArrayAllHeros {

    public static void main(String[] args) {

        String[] allHeros = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};

        for (String eachHero : allHeros) {
            System.out.println("eachHero = " + eachHero);

            String hero1 = eachHero;

            // String[] heroSplitted = hero1.split("-");
            //String heroCode = heroSplitted[0];
            //String fullName = heroSplitted[1];

            String stars = "" ;
            for (int i = 1; i < hero1.split("-")[1].length() ; i++) {
                stars += "*" ;

            }
            // System.out.println("stars = " + stars);

            //String heroX = hero1.replace(heroSplitted[1],stars);// String heroX = hero1.replace(fullName,stars);
            //System.out.println("hero1 = " + hero1);
            System.out.println("heroX = " + hero1.replace(hero1.split("-")[1],stars));



        }
    }
}