package nooor;
public class L03_Calci3 {
    public int add (int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        L03_Calci3 c = new L03_Calci3();
        int i = c.add(250, 350);
        System.out.println("Result printed inside main()" + i);
    }
}
