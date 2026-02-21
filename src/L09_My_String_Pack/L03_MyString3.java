package L09_My_String_Pack;

public class L03_MyString3 {
    static void main(String[] args) {
        String s1 = new String("Rooman");
        String s2 = new String("Rooman");
        String s3 = new String("rooman");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s3));


    }
}
