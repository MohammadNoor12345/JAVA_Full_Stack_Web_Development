package L27_MyPredicate;

import java.util.Date;
import java.util.function.Supplier;

public class L02_DateTime {
    static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
