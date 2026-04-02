// generate a random password such that the even digit always consist of characters and rest are numbers
package L28_OTP_Generation;

import java.util.function.Supplier;

public class L02_Password {
    public static void main(String[] args) {

        Supplier<String> passwordSupplier = () -> {
            String password = "";
            int length = 8; // you can change length

            for (int i = 0; i < length; i++) {

                if (i % 2 == 0) {
                    // even index → character (A-Z)
                    char ch = (char) ((int)(Math.random() * 26) + 65);
                    password = password + ch;
                } else {
                    // odd index → number (0-9)
                    int num = (int)(Math.random() * 10);
                    password = password + num;
                }
            }

            return password;
        };

        String result = passwordSupplier.get();
        System.out.println("Generated Password: " + result);
    }
}