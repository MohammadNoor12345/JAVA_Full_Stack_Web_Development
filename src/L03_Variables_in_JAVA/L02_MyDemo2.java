package L03_Variables_in_JAVA;

public class L02_MyDemo2 {
    public void m1() {
        // Local variable present in method
        int a = 10;
        float b = 5.5f;
        boolean c = true;
        String name = "Odisha";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
    }

    public static void main(String[] args) {
        L02_MyDemo2 d = new L02_MyDemo2();
        d.m1();
    }
}
