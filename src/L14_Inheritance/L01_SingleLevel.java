package L14_Inheritance;

class MyParent {
    void write() {
        System.out.println("Inside Parent write method");
    }
}

class MyChild extends MyParent {

}

public class L01_SingleLevel {
    public static void main(String[] args) {
        MyChild m = new MyChild();
        m.write();
    }
}