public class TimeComplexity {
    static boolean isPrimeRam(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i = 2; i<n ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    static boolean isPrimeShyam(int n){
        if(n<=1) return false;
        if(n==2) return true;
        for(int i = 2; i<= Math.sqrt(n) ; i++){
            if(n%i == 0) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        int n =1000000;
        long start = System.currentTimeMillis(); // note time before function executed
        System.out.println(isPrimeRam(n));
        long end = System.currentTimeMillis(); // note time after function executed
        System.out.println("Time taken by Ram " + (end-start)); // time taken by the function

        start = System.currentTimeMillis(); // note time before function executed
        System.out.println(isPrimeShyam(n));
        end = System.currentTimeMillis(); // note time after function executed
        System.out.println("Time taken Shyam "+ (end - start)); // time taken by the function
        
    }
}