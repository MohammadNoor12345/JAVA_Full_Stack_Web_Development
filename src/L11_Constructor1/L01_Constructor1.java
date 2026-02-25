package L11_Constructor1;

class TV {
    private int volume;
    private int brightness;

    // Non-parameterized constructor
    TV() {
        volume = 10;        // default volume
        brightness = 30;    // default brightness
    }

    public void setVolume(int volume) {
        if (volume <= 50) {
            this.volume = volume;
        } else {
            System.out.println("Volume can't be >50");
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }
}

public class L01_Constructor1 {
    public static void main(String[] args) {
        TV t = new TV();   // calling non-parameterized constructor

        System.out.println("Volume: " + t.getVolume());
        System.out.println("Brightness: " + t.getBrightness());
    }
}