package L11_Constructor1;

class TV1 {

    private int volume;
    private int brightness;

    // Default Constructor
    TV1() {
        this(50, 60);   // constructor chaining
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    TV1(int volume, int brightness) {

        // Volume validation
        if (volume <= 50) {
            this.volume = volume;
        } else {
            System.out.println("Volume can't be > 50");
            this.volume = 50;
        }

        // Brightness validation
        if (brightness <= 100) {
            this.brightness = brightness;
        } else {
            System.out.println("Brightness can't be > 100");
            this.brightness = 100;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }
}

public class L02_Constructor2 {

    public static void main(String[] args) {

        TV1 t1 = new TV1();          // Default constructor
        TV1 t2 = new TV1(40, 120);   // Parameterized constructor

        System.out.println("Volume: " + t2.getVolume());
        System.out.println("Brightness: " + t2.getBrightness());
    }
}

