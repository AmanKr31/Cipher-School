
public class JaggedArray {
    
    static void printJaggedArray(int arr[][]){
        // printing all jagged array
        // all rows n separate lines
        for(int i=0 ; i<arr.length ; i++){
            for(int j = 0 ; i<arr[i].length ; j++ ){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0]=new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];

        printJaggedArray(arr);

        

        
        int arr2[][] =new int[3][];

        // arr[0] = {1,2,3}; // we cannot use initialiser list here because it does not create an object
        // arr[1]= {2,3};
        // arr[2]= {4,5,6};

        // anonymous array 
        arr2[0] = new int[] {1,2,3}; 
        arr2[1]= new int[] {2,3};
        arr2[2]= new int[] {4,5,6};

        System.out.println("*****_______******");
        printJaggedArray(arr2);
    }    
}