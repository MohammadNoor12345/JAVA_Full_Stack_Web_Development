package L25_Methods_in_Java;

public class L02_Method {
    public static void main(String[] args) {
        String s = "rooman";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 125) {
                temp = temp + (char) (s.charAt(i) - 32);
            } else {

                temp = temp + s.charAt(i);
            }

        }
        System.out.println(temp);
    }

}
