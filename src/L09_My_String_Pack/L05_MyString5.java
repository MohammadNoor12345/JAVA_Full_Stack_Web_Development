package L09_My_String_Pack;

public class L05_MyString5 {
    static void main(String[] args) {
        String s1 = "Odisha";
        System.out.println(s1.startsWith("Odi")); // True
        System.out.println(s1.startsWith("odi")); // False
        System.out.println(s1.endsWith("Sha")); // False
        System.out.println(s1.endsWith("sha")); // True
    }
}
