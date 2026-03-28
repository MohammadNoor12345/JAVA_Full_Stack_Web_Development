package L25_Methods_in_Java;

public class L01_Method {
    public static void main(String[] args) {
        String s1 = "RoO$MaN";
        String temp = "";
        {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) >= 65 && s1.charAt(i) <= 90) {
                    temp = temp + (char) (s1.charAt(i) + 32);

                    System.out.println(temp);
                } else {

                    temp = temp + s1.charAt(i);
                    System.out.println(temp);

                }
            }
        }
        System.out.println(temp);
    }
}