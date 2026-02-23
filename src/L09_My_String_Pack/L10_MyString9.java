package L09_My_String_Pack;

public class L10_MyString9 {
    static void main(String[] args) {
        String s = "Rooman Technology pvt ltd";
        System.out.println(s.charAt(6)); // print space
        System.out.println(s.substring(6,7)); // print space
        System.out.println(s.contains("techno")); // strings are case sensitive
        System.out.println(s.contains("Techno"));
    }
}
