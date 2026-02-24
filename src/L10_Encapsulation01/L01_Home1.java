package L10_Encapsulation01;

class TV {
    private int volume; // Protecting my important components
    private int brightness; // Protecting my important components


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
//        if(volume <= 50) {
//            this.volume = volume;
//        }
//        else {
//            System.out.println("Volume can't be greater than 50");
//        }
        // Using Ternary Operator
        this.volume = (volume <= 50) ? volume : this.volume;
        System.out.println((volume <= 50) ? "" : "Volume can't be greater than 50");
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness <= 60) {
            this.brightness = brightness;
        } else {
            System.out.println("Brightness can't be greater than 60");
        }
    }

    public void watchMovie() {
        System.out.println("Watching movie in a TV");
    }
}

public class L01_Home1 {
    static void main(String[] args) {
        TV t = new TV();

        t.setVolume(50);
        t.setBrightness(60);
        System.out.println(t.getVolume());
        System.out.println(t.getBrightness());
    }
}

