package L01_Basics_of_Java;
class L01_Student {
    String name;
    String regNo;
    String degree;
    int age;

    public void eat() {
        System.out.println("Student is eating");
    }
    public void study() {
        System.out.println("Student is Studying");
    }

    public static void main(String[] args) {
        L01_Student s = new L01_Student(); // create object
        s.eat(); // call method
        s.study();
    }
}

