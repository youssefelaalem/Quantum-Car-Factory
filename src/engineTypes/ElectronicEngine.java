package engineTypes;

public class ElectronicEngine implements Engine {

    private int speed = 0;

    @Override
    public void increase() {
        speed += 20;
        System.out.println("ElectronicEngine speed: " + speed + " km/h");
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            speed -= 20;
            System.out.println("ElectronicEngine speed: " + speed + " km/h");
        }
    }

    @Override
    public int getSpeed() { return speed; }
}