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
 

        
    }
}
