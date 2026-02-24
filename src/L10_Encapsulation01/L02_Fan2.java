package L10_Encapsulation01;

public class L02_Fan2 {

    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0 && speed <= 5) {
            this.speed = speed;
        } else {
            System.out.println("Speed must be between 1 and 5");
        }
    }

    public static void main(String[] args) {

        L02_Fan2 fan = new L02_Fan2();

        fan.setSpeed(5);
        System.out.println("Fan Speed: " + fan.getSpeed());
    }
}