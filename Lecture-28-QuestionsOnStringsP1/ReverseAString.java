public class ReverseAString {

    public static void main(String[] args) {
        String s1 = "CipherSchool!";
        int n = s1.length();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s1.charAt(n - i - 1);
        }
        //arr has reversed string
        String rev = new String(arr);
        System.out.println(rev);
        // time complexity = O(n)
        // Is it ana place solution => no, we created arr[]
        // space complexity => for arr[i]


        // Approach 2

        String res = new String();
        for(int i = n-1; i>=0 ; i--){
            res = res + s1.charAt(i); // T.C -> O(n) but creating new objecting again and again
        }
        System.out.println(res); 


        //Approach 3
        char strArr[] = s1.toCharArray();
        int l = 0;
        int r = n-1;
        while(l<r){
            char temp = strArr[l];
            strArr[l] = strArr[r];
            strArr[r] = temp;
            l++;
            r--;
        
        }
        //swapping completed
        String result = new String(strArr);
        System.out.println(result);
    }
}