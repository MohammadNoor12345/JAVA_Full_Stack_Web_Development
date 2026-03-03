package L19_MyInterface;

/*
Rule 1:
Interface is a contract.
*/
interface Interf {
    void m1();
    void m2();
}

/*
Rule 10:
Interface variables are automatically
public static final (constants).
*/
interface ConstantDemo {
    int x = 100;   // public static final automatically
}

/*
Rule 5:
Partial implementation → class must be abstract.
*/
abstract class Abc implements Interf {

    @Override
    public void m1() {
        System.out.println("Inside m1() of Abc");
    }
}

/*
Completing implementation
*/
class Concrete extends Abc {

    @Override
    public void m2() {
        System.out.println("Inside m2() of Concrete");
    }
}

/*
Rule 3:
Methods inside interface are always public and abstract.
*/
interface A {
    void show();
}

/*
Rule 6:
Class can implement multiple interfaces.
*/
interface B {
    void display();
}

/*
Rule 8:
Interface can extend multiple interfaces.
*/
interface C extends A, B {
    void extra();
}

/*
Rule 7:
Interface cannot implement another interface.
Only extends is allowed.
*/
class Xyz implements C {

    @Override
    public void show() {
        System.out.println("show() from A");
    }

    @Override
    public void display() {
        System.out.println("display() from B");
    }

    @Override
    public void extra() {
        System.out.println("extra() from C");
    }
}

/*

Rule-9:
Class can extend a class and implement interface.
Order → extends first, then implements.
*/
class Parent {
    void parentMethod() {
        System.out.println("Inside Parent");
    }
}

class Child extends Parent implements A {

    @Override
    public void show() {
        System.out.println("Child implementing A");
    }
}

/*
Rule 11:
Empty interface = Marker Interface
*/
interface Marker {
}

/*
Rule 12:
Object of interface cannot be created.
Reference can be created.
*/
class DemoMarker implements Marker {
}

public class L02_MyMain {

    public static void main(String[] args) {

        // Rule 2: Polymorphism
        Interf obj = new Concrete();
        obj.m1();
        obj.m2();

        System.out.println();

        // Rule 4:
        // Specialized methods cannot be accessed
        // through interface reference.
        Concrete con = new Concrete();
        con.m1();   // allowed
        con.m2();   // allowed

        System.out.println();

        // Rule 6 & 8:
        C c = new Xyz();
        c.show();
        c.display();
        c.extra();

        System.out.println();

        // Rule 9:
        Child ch = new Child();
        ch.parentMethod();
        ch.show();

        System.out.println();

        // Rule 10: Constant usage
        System.out.println("Constant x = " + ConstantDemo.x);

        System.out.println();

        // Rule 11: Marker interface usage
        Marker m = new DemoMarker();
        System.out.println("Marker interface object created.");

        /*
        Rule 12:
        ❌ Interf i = new Interf();  // Not allowed
        */
    }
}