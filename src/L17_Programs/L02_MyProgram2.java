package L17_Programs;
class MyChar {
    public static void mycharprint() {
        String t = "";
        for (char i = 65; i <= 75 ; i++) {
//            System.out.println((char)i);
            t = t + i;
        }
        System.out.println(t);
    }
}

public class L02_MyProgram2 {
    static void main(String[] args) {
        MyChar.mycharprint();
    }
}
