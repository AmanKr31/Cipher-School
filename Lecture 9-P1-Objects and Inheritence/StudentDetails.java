


public class StudentDetails {
    String name;
    int rollName;
    public static void main(String[] args){
        StudentDetails s1 =new StudentDetails();
        StudentDetails s2 = new StudentDetails();
        StudentDetails s3 = new StudentDetails();

        s1.name = "Ram";
        s1.rollName=1;
        s2.name = "Shyam";
        s2.rollName=2;
        s3.name = "Ram";
        s3.rollName=3;

        System.out.println(s1.name);
        System.out.println(s1.rollName);
        System.out.println(s2.name);
        System.out.println(s2.rollName);
        System.out.println(s3.name);
        System.out.println(s3.rollName);
    }
}
