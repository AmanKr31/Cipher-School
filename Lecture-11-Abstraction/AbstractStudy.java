
abstract class Car {
    int maxSpeed;
    abstract void accelerate(); // only declared but not implemented. it is without a body
//   They are created to force the child classes to implement them before using. we will then after override
    abstract void brake();
}
abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brake");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {
        // Car c = new Car();
        // BMW beemer = new BMW();
        // beemer.accelerate();
            
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();
    }
    
}