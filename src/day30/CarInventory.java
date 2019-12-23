package day30;

import java.util.Arrays;

public class CarInventory {

    public static void main(String[] args) {

        /**Task
         * Create an array with data below :
         * {
         *  "Acura-NSX",
         * "Chevrolet-Corvette",
         * "Chevrolet-Cavalier",
         * "BMW-3 Series",
         * "Pontiac-LeMans",
         * "BMW-7 Series",
         * "Oldsmobile-Achieva",
         * "Honda-Civic"}
         *
         * Count how many Chevrolet is in this array
         * and how many civic you have
         *
         *
         */

        String[] cars = {
                "Acura-NSX",
                "Chevrolet-Corvette",
                "Chevrolet-Cavalier",
                "BMW-3 Series",
                "Pontiac-LeMans",
                "Oldsmobile-Achieva",
                "Honda-Civic",
                "Lexus-SC",
                "Volvo-S70",
                "Infiniti-QX",
                "Oldsmobile-Silhouette",
                "Aston Martin-Rapide",
                "Honda-S2000",
                "Isuzu-i-Series",
                "Acura-MDX",
                "Infiniti-QX",
                "Ford-Edge",
                "Jeep-Compass",
                "BMW-M6",
                "Mazda-929",
                "Pontiac-Grand Am",
                "Chevrolet-3500",
                "Infiniti-Q",
                "Ford-GT",
                "GMC-Savana 3500",
                "Mercedes-Benz-S-Class",
                "Volkswagen-Passat",
                "Volvo-XC60",
                "Saturn-Ion",
                "Spyker-C8",
                "Acura-ZDX",
                "Jeep-Patriot",
                "Honda-Civic",
                "Chevrolet-Colorado",
                "Kia-Sportage",
                "Ford-Transit Connect",
                "Pontiac-Grand Prix",
                "Pontiac-LeMans",
                "Buick-LeSabre",
                "Toyota-Tundra",
                "Nissan-Rogue",
                "Volkswagen-Golf",
                "Subaru-Impreza",
                "Jaguar-XK Series",
                "BMW-8 Series",
                "Mercedes-Benz-S-Class",
                "Chevrolet-Equinox",
                "Honda-Pilot",
                "Acura-MDX",
                "Pontiac-6000",
                "Mitsubishi-Galant",
                "Chevrolet-Corsica",
                "Ford-F-Series",
                "Pontiac-Sunbird",
                "Chevrolet-Silverado",
                "Volkswagen-GTI",
                "Honda-FCX Clarity",
                "Cadillac-Escalade",
                "Audi-riolet",
                "Pontiac-Montana",
                "Mitsubishi-Galant",
                "Mitsubishi-Precis",
                "Porsche-Cayman",
                "Buick-Rendezvous",
                "Dodge-Viper",
                "Chevrolet-Express 1500",
                "Chevrolet-Blazer",
                "Scion-xB",
                "Mazda-Tribute",
                "Oldsmobile-Silhouette",
                "Bentley-Continental Flying Spur",
                "Volkswagen-Passat",
                "Chevrolet-S10",
                "Suzuki-SJ",
                "Ferrari-FF",
                "Jaguar-S-Type",
                "Lexus-LS",
                "Volkswagen-GTI",
                "Toyota-Tacoma",
                "Chevrolet-Traverse",
                "Lincoln-Aviator",
                "Chrysler-300",
                "Kia-Forte",
                "Mazda-B-Series Plus",
                "Mazda-Mazda3",
                "Volkswagen-CC",
                "Audi-Quattro",
                "Honda-Civic",
                "Suzuki-Aerio",
                "Chevrolet-Impala SS",
                "Toyota-Land Cruiser",
                "Chevrolet-Avalanche",
                "Toyota-Tacoma Xtra",
                "Nissan-Altima",
                "Ford-Thunderbird",
                "Mazda-Tribute",
                "Ford-Econoline E250",
                "Lexus-LS",
                "GMC-Sonoma",
                "GMC-2500",
                "Lexus-RX",
                "Jaguar-XK Series",
                "Chevrolet-Venture",
                "Jeep-Wrangler",
                "Maybach-57",
                "GMC-Savana 1500",
                "Kia-Sorento",
                "Daewoo-Leganza",
                "Plymouth-Neon",
                "Chevrolet-Express 2500",
                "Mercedes-Benz-GL-Class",
                "BMW-M3",
                "Dodge-D150",
                "Audi-S4",
                "Ford-Escort",
                "Chrysler-LHS",
                "Pontiac-Firefly",
                "Toyota-Camry",
                "Ford-Explorer Sport Trac",
                "Kia-Rio",
                "GMC-Sierra 3500",
                "BMW-600",
                "GMC-Canyon",
                "Toyota-4Runner",
                "GMC-Sierra 2500",
                "Chrysler-300M",
                "GMC-Sierra",
                "Bentley-Continental GTC",
                "Pontiac-Firebird",
                "Kia-Sedona",
                "Ford-E150",
                "Chevrolet-Suburban 1500",
                "Spyker-C8 Laviolette",
                "Cadillac-XLR",
                "Cadillac-SRX",
                "Chevrolet-Sportvan G20",
                "Geo-Tracker",
                "Dodge-Ram Van 3500",
                "Chevrolet-HHR",
                "Lexus-GS",
                "GMC-Safari",
                "Plymouth-Laser",
                "Nissan-Leaf",
                "Jeep-Grand Cherokee",
                "Nissan-Pathfinder",
                "Suzuki-Daewoo Lacetti",
                "Toyota-Paseo",
                "Isuzu-i-280",
                "Mazda-MX-6",
                "GMC-Jimmy",
                "BMW-760",
                "Lotus-Esprit",
                "Suzuki-Grand Vitara",
                "Buick-Riviera",
                "Volkswagen-rio",
                "Hyundai-Sonata",
                "Lexus-HS",
                "Mercury-Grand Marquis",
                "Mitsubishi-Galant",
                "Ford-Ranger",
                "Dodge-Stratus",
                "Mazda-MX-5",
                "Maserati-GranTurismo",
                "Ford-Ranger",
                "Acura-TL",
                "Chevrolet-Suburban",
                "Lexus-RX",
                "Mitsubishi-Mirage",
                "Ford-LTD",
                "Mercedes-Benz-M-Class",
                "Jeep-Patriot",
                "Citro√´n-CX",
                "Hyundai-Tucson",
                "Pontiac-Grand Am",
                "Ford-Club Wagon",
                "Chevrolet-TrailBlazer",
                "Chevrolet-Corsica",
                "Chevrolet-Camaro",
                "Chrysler-Cirrus",
                "Ford-Crown Victoria",
                "Chevrolet-Camaro",
                "Mercury-Sable",
                "Pontiac-Grand Prix",
                "Geo-Prizm",
                "Honda-S2000",
                "Lincoln-Continental",
                "Ford-F150",
                "BMW-5 Series",
                "MINI-Cooper",
                "Lotus-Esprit",
                "Subaru-XT",
                "Ford-Thunderbird",
                "Cadillac-Escalade ESV",
                "Cadillac-Escalade EXT",
                "Mercedes-Benz-SLK-Class",
                "Dodge-Avenger",
                "BMW-X6",
                "Lamborghini-Countach",
                "Mitsubishi-Expo LRV",
                "Lexus-LS",
                "Hyundai-Elantra",
                "Infiniti-QX56",
                "Volkswagen-Type 2",
                "BMW-525",
                "GMC-Sierra 1500",
                "Toyota-TundraMax",
                "Audi-A6",
                "Pontiac-Sunbird",
                "Mercedes-Benz-300SE",
                "Mazda-MX-5",
                "Chrysler-Cirrus",
                "Chevrolet-Express 3500",
                "Honda-Crosstour",
                "Volkswagen-Type 2",
                "Suzuki-Grand Vitara",
                "Mercedes-Benz-SL-Class",
                "Volvo-XC90",
                "BMW-7 Series",
                "Toyota-Solara",
                "GMC-Savana 2500",
                "Chevrolet-HHR",
                "Chevrolet-Impala SS",
                "Chevrolet-Equinox",
                "Toyota-Sienna",
                "Ford-E350",
                "Lotus-Esprit",
                "Dodge-Avenger",
                "Oldsmobile-Silhouette",
                "Volvo-C70",
                "Lamborghini-Gallardo",
                "Audi-100"};


        // Task 1 ; count Chevrolet and Civic
        // We can use contains , startWith  ,endWith to get same result

        System.out.println("===first solution using for each loop=====");

        int chevroletCount = 0;
        int civicCount = 0;

        for (String eachCar : cars) {

            if (eachCar.toLowerCase().startsWith("chevrolet")) {
                ;
                chevroletCount++;
            }
            if (eachCar.toUpperCase().contains("CIVIC")) {
                civicCount++;
            }
        }
        System.out.println("chevroletCount = " + chevroletCount);
        System.out.println("civicCount = " + civicCount);

        //       System.out.println("===second solution using regular for loop====");

        //       for (int x = 0; x < cars.length; x++) {

        //          //System.out.println(cars[x]);
        //           if (cars[x].contains("Chevrolet")) {
        //               chevroletCount++;
        //           }
        //           if (cars[x].contains("Civic")) {
        //               civicCount++;
        //           }


        //       }
        //       System.out.println("chevroletCount = " + chevroletCount);
        //       System.out.println("civicCount = " + civicCount);


        System.out.println("=====Task 2 : print all location of civic in this array=====");
        // Task 2 : print all location of civic in this array
        for (int x = 0; x < cars.length; x++) {


            //if(cars[x].contains("Civic"))
            if (cars[x].contains("Honda-Civic")) {
                System.out.println("Civic found at location : " + x);

            }


        }

        System.out.println("=== Task 3 print Honda make and model separately in this format======   ");
        // Task 3 ; print make and model separately in this format
        // Honda-Civic-->>
        // Car make is Honda and Model is Civic
        // print only Honda brand cars

        //    String eachCar = "Honda-Civic" ;
        //     String[] eachCarSplitted = eachCar.split("-");

        // System.out.println("Car make is " + eachCarSplitted[0] + "Car Model is " + eachCarSplitted[1]);

        // we want to go through each and every car
        //and we don't need index so we used for each loop

        for (String eachCar : cars) {
            // we want to do this action only for one type of car brand
            //so we used start with method to check car brand
            if (eachCar.startsWith("Honda")) {
                // we used split method to separate brand and model
                System.out.println("eachCar = " + eachCar);
                // first part is brand, second part is model
                String[] eachCarSplitted = eachCar.split("-");
                System.out.println("Car make is " + eachCarSplitted[0] + "Car Model is " + eachCarSplitted[1]);
            }

        }

        System.out.println("=====task find all the car with model has only 2 characters===== ");
        // find all the car with model has only 2 characters
        // print them out
        // get the count
        int cntOf2CharModel = 0;
        for (String eachCar : cars) {
            String[] eachCarSplitted = eachCar.split("-", 2);
            String model = eachCarSplitted[1];
            // model is second item in splitted array ( at index )
            if (eachCarSplitted[1].length() == 2) {
                cntOf2CharModel++;
                System.out.println(eachCar);
            }
        }
        //           String car = "Lexus-LS" ;
        //           String[] carSplitted = car.split("-") ;
        //       System.out.println("carSplitted = " + Arrays.toString(carSplitted));
        System.out.println("Count of Cars with only 2 characters in their model = " + cntOf2CharModel);

        Arrays.sort(cars);
        System.out.println("cars = " + Arrays.toString(cars));


    }


}

