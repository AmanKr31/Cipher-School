
class A {
    final int noOfAlphabets = 26; // final variables - value once assigned cannot be changed.
    final int noOfDigits;
    
    // Either assign the value at time of declaration or assign the value inside the constructor.
    A() {
        noOfDigits = 10;
    }
    
    final void fun() {
        System.out.println("Hi, I'm a function in class A");
    }
}

final class B extends A {
    // The following method cannot override the final method from A.
    // void fun() {
    //    System.out.println("I'm a function in B overriding function in A");
    // }
}


public class FinalStudy {
    public static void main(String[] args) {
        // This space can be used for testing.
    }
}
