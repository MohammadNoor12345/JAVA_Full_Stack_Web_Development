package L09_My_String_Pack;


public class L13_MyMutableString {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.append("Java"));
        System.out.println(sb);
        sb.append(" JAVASCRIPT");
        System.out.println(sb.capacity());
        sb.append(" JamesGosling");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
    }




}
