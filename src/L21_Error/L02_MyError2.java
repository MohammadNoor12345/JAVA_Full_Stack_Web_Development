package L21_Error;
class MyError2{
    public void m3 () {
        m3();
    }
}

public class L02_MyError2 {
    static void main(String[] args) {
        MyError2 m = new MyError2();
        m.m3();
    }
}
