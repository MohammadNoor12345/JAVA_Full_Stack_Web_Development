package L28_OTP_Generation;

import java.util.function.Supplier;

public class L01_6_Digit_Otp_Generation {
    public static void main(String[] args) {

        Supplier<String> s1 = () -> {
            String otp = "";

            for (int i = 0; i < 6; i++) {
                int digit = (int)(Math.random() * 10);
                otp = otp + digit;
            }

            return otp;
        };

        String result = s1.get();
        System.out.println("Generated OTP: " + result);
    }
}
