
public class ArrayStudy {
    static void print(int arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // 1. Array Creatin Expression
        int size = 5;  
        int arr[] = new int[size];
//        int arr[],int[] arr, int []arr -> all are the same
//       int arr[] -> Array declaration expression
//      arr = new int[size];

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        print(arr);

        for(int i=0; i<size;i++){
            arr[i] = i+1;
        }
        print(arr);

//      2.Array initialisation list
        int arr2[] = {1,2,3};
        print(arr2);

        // if we want to increase the size of the array
        int copyArray[] = new int[2*size]; // create an array of double size
        for(int i=0; i<size;i++){  // copy all elements from old to new array
            copyArray[i] = arr[i];
        }
        copyArray[5]=6;
        copyArray[6]=7;
        print(copyArray);
    }
}
