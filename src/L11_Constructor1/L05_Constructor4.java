/*
package L11_Constructor1;
class Alpha{
    public Alpha() {
        this();
        System.out.println("I am inside alpha");
    }
}

public class L05_Constructor4 {
    static void main(String[] args) {
        Alpha a = new Alpha();
    }
}
*/
package L11_Constructor1;

class Alpha {

    public Alpha(int x) {
        System.out.println("I am inside alpha with parameter");
    }

    public Alpha() {
        this(10);   // calling parameterized constructor
        System.out.println("I am inside alpha");
    }
}

public class L05_Constructor4 {

    public static void main(String[] args) {
        Alpha a = new Alpha();
    }
}
