
class Demo{
    private int a = 5;
    private int b = 10;
    private int c = 15;
    private int d = 20;

    public int getA(){ //getter
        System.out.println("Vaue of A read");
        return this.a;
    }

    public int getB(){ //getter
        System.out.println("Vaue of B read");
        return this.b;
    }

    public void setA(int a){
        if (a>100){
            this.a = a;
            System.err.println("Value of A changed to: "+a);
        }
        else{
            System.out.println("cannot set value outside limits");
        }
    }

    public void setB(int b){
        this.b = b;
    }

    public int getC(){
        return c;
    }

    public void setC(int c){
        this.c = c;
    }

    public void setd(int d){
        this.d = d;
    }

    public int getD(){
        return d;
    }
}

public class EncapStudy {
    public static void main(String[] args) {
        // too auto-generated method stub
        Demo d = new Demo();
        // System.out.println(d.a); // not visible because private
        System.out.println(d.getA());
        d.setA(100);
        System.out.println(d.getA());
    }
}
