package L20_PackageA;
public class Abc{
    private int a;
    int b;
    protected int c;
    public int d;

    public void m1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
class Efg extends Abc{
    @Override
    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

//public class L01_ABC {
//    static void main(String[] args) {
//
//    }
//}

/* Rule of Method Overriding =>
1. Child class overriden methods should maintain the same return typer as
 the parent method as per the primitive data type is considered
2. Child class overriden method has to maintain the same access modifier
 as in the parent. If its needs to change it can increase the visibility
 but it canot decrease.


 Scope Increase          PRIVATE              A
      |               P A C K A G E           |
      |             P R O T E C T E D         |
      V               P U B L I C           Scope Decrease */
