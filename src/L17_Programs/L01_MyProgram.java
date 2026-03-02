package L17_Programs;
class MyPrint {
    public static  void prints() {
        System.out.println("Printing the Alphabet in upper Case");
       /* for (int i = 65; i <= 90 ; i++) {
            *//*System.out.println((char)(i)); // Uppercase
            System.out.println((char)(i + 32)); // Lowercase*//*


        }*/
        for (int i = 97; i <= 122 ; i++) {
            System.out.println((char)(i - 32));
        }
    }
}


public class L01_MyProgram {
    static void main(String[] args) {
        MyPrint.prints();

    }
}
