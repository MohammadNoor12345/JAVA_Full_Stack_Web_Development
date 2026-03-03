package L18_MyFinalKeyword;
class MyFinal {
    public  void nonfinal() {
        System.out.println("Inside non final Method");
    }
}
class  MyChild extends MyFinal {
    @Override
    public void nonfinal() {
        System.out.println("Overriding non final in child class");
    }
}

public class L01_MyExecution {
    static void main(String[] args) {
        MyChild c = new MyChild();
        c.nonfinal();
    }
}
