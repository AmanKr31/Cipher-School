public class RecursionStudy {

    static void printDesending(int n){
        //Base condition -> Telling it when to stop
        if(n<1){
            return; 
        }
        System.out.println(n);
        printDesending(n-1);
    }

    public static void main(String[] args){
        int n = 5;
        printDesending(n);
    }
}