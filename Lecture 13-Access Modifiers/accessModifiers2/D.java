
public class D {
    public static void main(String[] args){
        A obj = new A();
       // System.out.println(obj.x); //  default is not acessible outside the package
       // System.out.println(obj.y); //  private is not accessible outside the class
        System.out.println(obj.z);  //  public is accessible everywhere the object is available
        System.out.println(obj.w);// protected will not be accessible outside package in non-subclass

    }
}
