package L19_MyInterface;
class MyParent{
    public double add() {
        int a = 10, b = 20;
        System.out.println("a+b = " + (a+b));
        return  (a+b);

    }
}
class MyChild extends MyParent{
    @Override
    public double add() {
        int a = 100, b = 200;
        System.out.println("a+b = " + (a+b));
        return  (a+b);
    }
}
class Animal {

}
class Lion extends Animal{

}
class Tiger{

}

public class L04_MyRules {
    static void main(String[] args) {
//        MyChild n = new MyChild();
//        n.add();
        MyChild m = new MyChild();
        m.add();
    }
}
