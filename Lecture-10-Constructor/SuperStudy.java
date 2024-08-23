
class loan{
    int rate;
    loan(){
        System.out.println("Hi, I,m the default constructor of loan");
    }

    loan(int rate){
        this.rate = rate;
    }

    void printRate(){
        System.out.println(this.rate);
    }
}

class carloan extends loan{
    int rate;

    carloan(){
        super();
        System.out.println("Hi, I'm the default constructor of carloan");
        // You cannot directly access 'super.rate' like this if 'rate' is hidden.
        System.out.println(super.rate);
    }

    carloan(int rate) {
        super(7);
        this.rate = rate;
    }
    
    void printRate() {
        System.out.println(this.rate);
        super.printRate();
        System.out.println(super.rate);
    }
}
public class SuperStudy {
    public static void main(String[] args) {
        carloan cl2 = new carloan();
        carloan cl = new carloan(8);
        cl.printRate();
    }
}
