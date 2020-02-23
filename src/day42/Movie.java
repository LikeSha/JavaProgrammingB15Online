package day42;

public class Movie {

    private String name;
    private double length;
    private String type;

    // default constructor :
    // a constructor that given by compiler
    // only if you don't have any in your class
    // and it has no parameter
    // it has no code inside
    public Movie(){
        System.out.println("Empty Movie");
    }

    // write a constructor to set all the fields value
    // right click--- generate--- constructor-- select all --- ok  this is short cut to create all
    // constructors in one time
    public Movie(String name, double length,String type){
        this.name = name;
        this.length = length;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    // toString method so we can directly print out



    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                '}';
    }
}
