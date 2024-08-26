public class SelctionSort {

    public static void main(String[] args) {
        int[] arr = { 3,5,8,10,4}; 
        int n = arr.length;

        for(int i =0;i<n ; i++){
            //find index of minimum element

            int minIndex = i;
            for(int j = i; j<n ; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // the index of the min element is found in minIndex
            // now we will swap the min elemment and bring it in its place 
            // i.e swap element at minIndex and i

            int temp= arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]= temp;
        }

        for(int i=0; i< n ;i++){
            System.out.print(arr[i]+" ");
        }

    }
}