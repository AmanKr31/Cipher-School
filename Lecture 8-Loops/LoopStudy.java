public class LoopStudy {
    public static void main(String[] args){
        int i;
        for(i=1;i<=100;i++){
            System.out.println(i);
        }
        //Loops breaks when i = 101
        System.out.println("i is: "+i);
        System.out.println("***************");

        for(i=0;i<100;i++){
            System.out.println("i is: "+i);
        }

        //while loop

        int n=5;
        while(n>0){
            System.out.println("Hello");
            n--;
        }
        System.out.println("After while loop");

        //do while loop
        n=5;
        do{
            System.out.println(n);
            n--;
        }while(n>0);

    }
}
