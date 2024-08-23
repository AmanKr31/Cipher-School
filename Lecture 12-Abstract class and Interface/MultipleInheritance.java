

interface M{
    int x = 10;
    void fun();
}

interface N{
    int x= 20;
    void fun();
}

class C implements M,N{ //Multiple inheritance in java 
    public void fun(){
        System.out.println("Hello, I'm function C");
        System.out.println(M.x);   //Ambiguity resolved using fully qualified name
        System.out.println(N.x);
        System.out.println(M.super.hashCode());
        System.out.println(N.super.hashCode() );
    }
}

interface O extends M,N{  //multipe inheritance in java through interface
    void fun();
}

class D implements O{
    public void fun(){
        System.out.println("Hello, I'm function D");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.fun();

        D d = new D();
        d.fun();
    }
}
