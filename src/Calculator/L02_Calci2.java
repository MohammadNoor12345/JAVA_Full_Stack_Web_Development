package nooor;
public class L02_Calci2 {
    public void add (int x, int y) {
        int sum = x + y;
        System.out.println("Output is printed within add()" + sum);
    }

    public static void main(String[] args) {
        L02_Calci2 c = new L02_Calci2();
        c.add(250, 350);

    }
}
