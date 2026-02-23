package L09_My_String_Pack;

public class L06_MyString6 {
    static void main(String[] args) {
        String s1 = "Bhubaneswar";
        System.out.println(s1.length());
        // length--> variable in array but
        // length() --> it is a method`
        System.out.println(s1.substring(0,4));
        // start index is inclusive but ending index is always exclusive ( alwaya n-1)
        System.out.println(s1.substring(3,8));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(0));
        System.out.println(s1.substring(3,3));


    }
}
