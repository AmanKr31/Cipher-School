

class Parent{
    void fun(){
        System.out.println("Hi, I am A");
    }
}

class Child extends Parent{
    void fun(){
        System.out.println("Hi, I am B");
    }
    
}
public class MethodOverrideing {
    public static void main(String[] args){
        Child c = new Child();
        c.fun();

    }
}
