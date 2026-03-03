package L18_MyFinalKeyword;
class MyFinal {
    public void nonfinal() {
        // Normal method → can be overridden
        System.out.println("Inside non final Method");
    }

    public final void m1() {
        // final method → cannot be overridden in child class
        System.out.println("m1() is a final method which can't be overridden");
    }
}
class  MyChild extends MyFinal {
    @Override
    public void nonfinal() {
        // ✅ Allowed because parent method is not final
        System.out.println("Overriding non final in child class");
    }
 /*   @Override
    public final void m1() {

        // ❌ NOT ALLOWED:
        // Cannot override m1() because it is final in parent class
        // If you try, compiler error:
        // "Cannot override the final method from MyFinal"
    }*/
}

public class L01_MyExecution {

    public static void main(String[] args) {
        // main must be public static for JVM to execute

        MyChild c = new MyChild();
        c.nonfinal();  // Calls overridden version
        c.m1();        // Calls parent version (cannot be overridden)
    }
}
