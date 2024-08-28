public class Anagrams {
    static boolean isAnagram(String s1, String s2){
        // if length is not equal - > they ca not be anagram
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int n = s1.length();

        int freqArr1[] = new int[26];
        int freqArr2[] = new int[26];
        // in frequency array => 0 means 'a' and 25 means 'z'
        for(int i=0; i<n ; i++){
            //for string 1
            int index1 = s1.charAt(i) - 'a';
            freqArr1[index1]++;

            //for string 2
            int index2 = s2.charAt(i) - 'a';
            freqArr2[index2]++;
        }
        //freq arrray have been created
        for(int i=0;i<26;i++){
           if(freqArr1[i] != freqArr2[i]){
                return false;
           }
        }
        //if reached here means freq arays are equal
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("CAT","TAC"));
        System.out.println(isAnagram("CAT","TAG"));
        System.out.println(isAnagram("CAT","TACC"));
    }
}
