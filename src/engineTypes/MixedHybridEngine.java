package engineTypes;

public class MixedHybridEngine implements Engine {

    private final GasolineEngine gasEngine = new GasolineEngine();
    private final ElectronicEngine electricEngine = new ElectronicEngine();

    private int speed = 0;
    private Engine activeEngine() {
        return speed < 50 ? electricEngine : gasEngine;
    }

    @Override
    public void increase() {
      speed += 20;
      System.out.println("MixedHybridEngine total speed: " + speed + " km/h");
      activeEngine().increase();
    }

    @Override
    public void decrease() {
        if (speed > 0) {
            speed -= 20;
            System.out.println("MixedHybridEngine total speed: " + speed + " km/h");
            activeEngine().decrease();
        }
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}