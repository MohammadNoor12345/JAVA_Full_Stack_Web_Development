package L13_ClassLoad1;
class Demo {
    int a = 10;
    int b = 20;

    public void display() {
        System.out.println("Inside Display");
        System.out.println(a);
        System.out.println(b);
    }
}

public class L01_MyClassLoad1 {
    static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}
