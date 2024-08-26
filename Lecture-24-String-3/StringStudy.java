import java.util.Scanner;;

public class StringStudy {
    public static void main(String[] args) {
        String name = "CipherSchools"; // created using literals stored in method area
        String name2 = "CipherSchools";

        String name3 = new String("CipherSchools");// created using constructor
        String name4= new String("CipherSchools");

        System.out.println(name==name2);
        System.out.println(name3==name4);
        System.out.println(name==name3);

        // strings are immutable
        // Everytime we do an operaion on string new object is created 
        System.out.println("====================================================");

        // 1. concatination
        System.out.println("1. concatination");
        String s1 = "Hello";
        s1 = s1 +" Peeps";
        System.out.println(s1);
        System.out.println(s1 + " How are you doing");
        System.out.println(s1);

        // another way to concat is to use function
        String s2 = new String("Hello");
        String s3 = new String(" People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);// remain same

        System.out.println("====================================================");

        // 1. checking if strings are equal in value 
        System.out.println("2. CHECKING IF STRING ARE EQUAL IN VALUE");

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        // this generally compare references (hashcode ) of objects (just like ==)
        // but, for string class it has been overridden to check for content equality

        System.out.println("====================================================");
        System.out.println("3. Cretaing new String objetc from character array");

        char arr[] = {'C', 'I', 'P','H','E','R'};
        String strFormArr = new String(arr);
        System.out.println(strFormArr);


        // 4. Creating partial STring object from character array
        System.out.println("===============================================================");
        System.out.println("Creating partial STring object from character array");

        String partialStrFormArr = new String(arr, 1,3);// we can pass an array: array, starting index(included), count of elements after starting index
        System.out.println(partialStrFormArr);

        String partialStrFormArr2 = new String(arr, 2,3);
        System.out.println(partialStrFormArr2);

         // 5. Changing the case
        System.out.println("===============================================================");
        System.out.println("5. Changing the case");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        //name = name.toUpperCase();
        System.out.println(name); // remain same

        // 6. Splitting
        // System.out.println("===============================================================");
        // System.out.println("6. Splitting");

        // System.out.println("Please enter your full name: ");
        // Scanner sc = new Scanner(System.in);
        // String fullName = sc.nextLine();
        // String strArr[] = fullName.split(" ");
        // for(int i=0;i<strArr.length; i++){
        //     System.out.println(strFormArr);
        // }

        // System.out.println("Please enter sparated by commas: ");
        
        // String csvText = sc.nextLine();
        // String csvArr[] = fullName.split(", ");
        // for(int i=0;i<csvArr.length; i++){
        //     System.out.println(csvArr[i]);
        // }


        // System.out.println("Please enter separated by dots: ");
        // String dotText = sc.nextLine();
        // String dotArr[] = fullName.split(". ");
        // for(int i=0;i<dotArr.length; i++){
        //     System.out.println(dotArr[i]);
        // }

        // String backSlashText = "Hello, I attend \"Java\" Class ";
        // String backSlashArr[] = backSlashText.split("\"");
        // for(int i=0;i<backSlashArr.length; i++){
        //     System.out.println(backSlashArr[i]);
        // }

        // 7. Length of a string 
        System.out.println("===============================================================");
        System.out.println("7. Length of a string");
        int len = name.length();
        System.out.println("Length of "+name+" is: "+len);

        // 8. Finding the index of a char in string 
        System.out.println("===============================================================");
        System.out.println("8. Finding the index of a char in string");

        int index = name.indexOf('e');// return he first occurence of the character
        System.out.println("Index of 'e' in "+name+" is: "+index);

        int index2 = name.indexOf('E');// return -1 if not found
        System.out.println("Index of 'E' in "+name+" is: "+index2);

        int index3 = name.indexOf("School");// return he first occurence of the character
        System.out.println("Index of 'School' in "+name+" is: "+index3);

        int index4 = name.indexOf('o',10);// start searching from the 10, 10 included
        System.out.println("Index of 'o' in "+name+" is: "+index4);

        int indexOfO = 0;


        // while(indexOfO != -1)  // stop at -1 or Run till -1
        while (true) { // infinite loop you keep on running, we will stop you
            indexOfO = name.indexOf('o', indexOfO+1);

            if (indexOfO == -1){
                break;
            }
            System.out.println("O is found at: "+indexOfO);
        }

        // 9. Extract a Substring
        System.out.println("================================================");
        System.out.println("9. Extract a Substring");
        String wF = "Wakanada Forever";
        String subString = wF.substring(3);// From starting index include till the end of string 
        System.out.println(subString);
 
        String subString2 = wF.substring(3,7);
        System.out.println(subString2);
 
        // 10. Finding a character at a given index
        System.out.println("================================================");
        System.out.println("10. Finding a charcter at a given index");

        System.out.println(name.charAt(4));
        char charAtIndex = name.charAt(6);
        System.out.println(charAtIndex);

        // 11. Char array from a String
        System.out.println("================================================");
        System.out.println("11. Char array from a String");
        char arr2[] = name.toCharArray();
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        // 12. Check if a string is empty
        System.out.println("================================================");
        System.out.println("12. Check if a string is empty");

        String emptyString =new String();
        String emptyString2 = "";
        String blankString = "      ";
        System.out.println(emptyString);
        System.out.println(emptyString2);
        System.out.println(emptyString.equals(""));
        System.out.println(emptyString2.equals(""));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString2.isEmpty());
        System.out.println(blankString.isEmpty());

        // 13. Comparing strings lexicographically -> alphabetically
        System.out.println("================================================");
        System.out.println("13. Comparing strings lexicographically -> alphabetically");
        String textOne = "QHey!";
        String textTwo = "QBye!";
        System.out.println(textOne.compareTo(textTwo));// compare character by character
        System.out.println(textTwo.compareTo(textOne));
        System.out.println(textOne.compareTo(textOne));

        // 14. Triming white spaces from front and end
        System.out.println("================================================");
        System.out.println("14. Triming white spaces from front and end");
        String s5 = new String("Hello       ");
        String s6 = new String("             Hello         ");
        String s7 = new String("       Hello         People         ");
        System.out.println("*" + s5.trim() +"*");
        System.out.println("*" + s6.trim() +"*");
        System.out.println("*" + s7.trim() +"*");


        // 15. Replacig a character
        System.out.println("================================================");
        System.out.println("15. Replacing a character ");
        System.out.println(name.replace('o', 'O'));
        System.out.println(name.replace("oo", "000"));
        


        
    }
}
