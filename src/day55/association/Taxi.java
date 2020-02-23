package day55.association;

// Taxi Engine  --- Drive --- Passengers ---- Engine
// Taxi has Driver ---Driver object has 2 attribute ( name ,driverID)

//Create a class called Driver--it has 2 attribute(name String ,driverID int)
   // constructor to set the value , add toString method so we can print out
// add a instance field called Driver dr, update your constructor to set Driver as well


public class Taxi {

    int plateNumber;
    Engine eng ; //since you have a class Engine ,so it become a type .so you can have Engine eng in instance field
                // just like String , we have class Engine  so I can use it as data type

    Driver dr;

    public Taxi(int plateNumber, Engine eng,Driver dr) {
        this.plateNumber = plateNumber;
        this.eng = eng;
        this.dr = dr;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber=" + plateNumber +
                ", eng=" + eng.toString() +
                ", Driver =" + dr +
                '}';
    }
}




class Engine{

    String type;
    int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }




}

class Driver{

    String name;
    int driverID;

    public Driver(String name, int driverID) {
        this.name = name;
        this.driverID = driverID;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverID=" + driverID +
                '}';
    }
}