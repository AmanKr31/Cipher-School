
class demo{
    void fun(){
        System.out.println("I have no parameter");
    }
    void fun(int a){
        System.out.println("I have 1 parameter "+ a);
    }
    void fun(String s){
        System.out.println("I have a string "+s);
    }
    void fun(int a, int b){
        System.out.println("I have 2 parameters a and b "+a+" , "+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args){
        demo d = new demo();
        d.fun();
        d.fun(5);
        d.fun(10,20);
        d.fun("hi there");

        System.out.println(5);
        System.out.println("abc");
        System.out.println(5.06);

    }
}
