package L25_Methods_in_Java;

public class L01_Method {
    static void main(String[] args) {
        String s = "ROOMAN";
        String t = "";
        for (int i = 0; i <s.length() ; i++) {
            t = t + (char)(s.charAt(i) + 32);
        }
        System.out.println(t);

    }
}
