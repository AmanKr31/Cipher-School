public class Anagrams2 {
    static boolean isAnagram(String s1, String s2){
        // if length is not equal - > they ca not be anagram
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int n = s1.length();

        int freqArr1[] = new int[256];// create for 256 if we have include space and all
        int freqArr2[] = new int[256];

        // in frequency array => 0 means 'a' and 25 means 'z'
        for(int i=0; i<n ; i++){
            //for string 1
            int index1 = s1.charAt(i);
            freqArr1[index1]++;

            //for string 2
            int index2 = s2.charAt(i);
            freqArr2[index2]++;
        }
        //freq arrray have been created
        for(int i=0;i<256;i++){
           if(freqArr1[i] != freqArr2[i]){
                return false;
           }
        }
        //if reached here means freq arays are equal
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("HELLO CAT","HELLO TAC"));
        System.out.println(isAnagram("HELLO CAT","HELLO TAg"));

        System.out.println(isAnagram("HELLO CAT","HELLO TACC"));

       
    }
}
