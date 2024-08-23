

class Shape {
    double pi = 3.14;
    double getSquare(int r){
        return r*r;
    }
}

class Circle extends Shape {
    void area(int r){
        System.out.println(pi*getSquare(r));
    }
}
public class Inheritance {
    public  static void main(String[] args){
        Circle c = new Circle();
        c.area(5);
    }

    
}