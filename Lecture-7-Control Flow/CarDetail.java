
class Car{
    String name;
    String colour;
    int year;
    int maxSpeed;
    void acceleration(){
        System.out.println("Car is accelerating");
    }
}
public class CarDetail {
    public static void main(String[] args){
        Car polo = new Car();
        System.out.println(polo.name);
        System.out.println(polo.colour);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);

        polo.name="Polo";
        polo.colour="Black";
        polo.year = 2016;
        polo.maxSpeed=120;

        System.out.println(polo.name);
        System.out.println(polo.colour);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);



    }
}
