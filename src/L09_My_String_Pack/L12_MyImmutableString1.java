package L09_My_String_Pack;

public class L12_MyImmutableString1 {
    static void main() {
        String s1 = "Rooman";
        System.out.println(s1);
        System.out.println(s1.concat(" Technologies"));
        System.out.println(s1);
        StringBuffer s2 = new StringBuffer("Rooman");
        System.out.println(s2); // Rooman
        s2.append(" Technology");
        System.out.println(s2); // Rooman Technology
        StringBuffer s3 = new StringBuffer(s1);
        s2.append("Technology");
        s1 = s2.toString();
        System.out.println(s1);


    }
}
// if we want to make a string mutable, pass the reference into String Builder & StringBuffer.