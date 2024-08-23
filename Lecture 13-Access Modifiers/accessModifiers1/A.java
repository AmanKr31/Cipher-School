

public class A {
    int x = 10; //default or pakage private 
    private int y=15;
    public int z = 20;
    protected int w = 25;

    public static void main(String[] args) {
        A obj = new A();
        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
        System.out.println("z = " + obj.z);
        System.out.println("w = " + obj.w);


    }
}
