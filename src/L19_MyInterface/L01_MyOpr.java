package L19_MyInterface;

interface Calculator {

    public abstract void add();
    public abstract void sub();
}

class Calc1 implements Calculator {

    public void add() {
        int a = 100, b = 200;
        System.out.println("a+b = " + (a + b));
    }

    public void sub() {
        int a = 200, b = 100;
        System.out.println("a-b = " + (a - b));
    }
}

class SciCalc implements Calculator {

    public void add() {
        int a = 1000, b = 2000;
        System.out.println("sum = " + (a + b));
    }

    public void sub() {
        int a = 5000, b = 2000;
        System.out.println("diff = " + (a - b));
    }
}

class MathCalc implements Calculator {

    public void add() {
        int a = 10, b = 300;
        System.out.println("Addition = " + (a + b));
    }

    public void sub() {
        int x = 1000, y = 100;
        System.out.println("Subtraction = " + (x - y));
    }
}

public class L01_MyOpr {

    public static void main(String[] args) {

        Calculator c1 = new Calc1();
        Calculator c2 = new SciCalc();
        Calculator c3 = new MathCalc();

        c1.add();
        c1.sub();
        System.out.println();

        c2.add();
        c2.sub();
        System.out.println();

        c3.add();
        c3.sub();
    }
}