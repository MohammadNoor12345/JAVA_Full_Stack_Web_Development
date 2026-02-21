package L09_My_String_Pack;

import java.sql.SQLOutput;

public class L04_MyStringMethods1 {
    static void main(String[] args) {
//        String s1 = "Odisha";
//        System.out.println(s1.toUpperCase());
//        String s2 = "ROOMAN";
//        System.out.println(s2.toLowerCase());
//        String s3 = s2.toLowerCase();
//        String s4 = "rooman";
//        System.out.println(s2);
//        System.out.println(s3 == s4);
//        String s5 = s2.toLowerCase();
//        System.out.println(s3 == s5);

        String a = "ODISHA";
//        System.out.println(a[3]); // Error
        System.out.println(a.charAt(3));
        System.out.println(a.indexOf('I')); // 2
        System.out.println(a.indexOf('M'));

        String s6 = "ROOMAN";
        System.out.println(s6.indexOf('O'));
        System.out.println(s6.lastIndexOf('O'));



    }
}
