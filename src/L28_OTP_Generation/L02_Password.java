// generate a random password such that the even digit always consist of characters and rest are numbers
package L28_OTP_Generation;
import java.util.function.Supplier;

public class L02_Password {
    public static void main(String[] args) {
        String symbols = "!@#$%&ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Supplier<Character> s = () -> symbols.charAt((int) (Math.random() * symbols.length()));

        Supplier<Integer> d = () -> (int) (Math.random() * 10);

        String pwd = "";

        //another logic
        for (int i = 1; i <= 4; i++) {

            pwd=pwd+d.get();
            pwd=pwd+s.get();

        }

        System.out.println(pwd);

    }
}