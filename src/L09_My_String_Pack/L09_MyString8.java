package L09_My_String_Pack;

public class L09_MyString8 {
    static void main(String[] args) {
        String s = "Odisha is-a-beautiful state";
        String[] sh = s.split(" ");
        for (String s1 : sh) {
//            System.out.println(s1);
        }
        String s2 = "Bhubaneswar-is a state-capital-of Odisha";
        String[] sh1 = s2.split("-");
        for (String s3 : sh1) {
            System.out.println(s3);
        }

    }
}
