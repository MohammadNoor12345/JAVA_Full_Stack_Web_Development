package L14_Inheritance;

class MyParent1 {
    void write() {
        System.out.println("Inside Parent write method");
    }
}

class MyChild1 extends MyParent1 {
    void display() {
        System.out.println("Inside Child display method");
    }
}

class MyGrandChild1 extends MyChild1 {
    void show() {
        System.out.println("Inside GrandChild show method");
    }
}

public class L02_MultiLevel {

    public static void main(String[] args) {

        MyGrandChild1 obj = new MyGrandChild1();

        obj.write();     // From MyParent
        obj.display();   // From MyChild
        obj.show();      // From MyGrandChild
    }
}