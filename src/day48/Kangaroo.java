package day48;
// a class can implement more than one interface
public class Kangaroo implements Bouncible,BoxerWithBellyPouch {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }


    @Override
    public void bounce() {
        System.out.println("This Kangaroo name is " + name + " and he is jumping " + jumpDistance+" meters");
    }

    public void eat(){
        System.out.println("Kangaroo " + name + " is eating ");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    @Override
    public void kickBox() {
        System.out.println("Kangaroo with name " + name + " is kickBoxing");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println("Kangaroo with name " + name + " carry child in the pocket");
    }
}



