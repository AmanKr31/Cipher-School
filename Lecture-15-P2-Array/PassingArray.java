


public class PassingArray {

    static void addOne(int x){
        x = x+1;
    }

    static void addOne(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]++;
        }
    }
    public static void main(String[] args){
        int x = 10;
        addOne(x);
        System.out.println(x);

        int arr[] ={1,2,3,4,5};
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
