import engineTypes.Engine;

public class Car {

    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("engineTypes.Engine has been replaced.");
    }

    public void start() {
        speed = 0;
        System.out.println("Car started at 0 km/h.");
    }

    public void stop() {
        if (speed != 0) {
            System.out.println("Cannot stop: speed must be 0. Current speed: " + speed + " km/h");
            return;
        }
        System.out.println("Car stopped.");
    }

    public void accelerate() {
        if (speed >= 200) {
            System.out.println("Already at maximum speed (200 km/h).");
            return;
        }
        speed += 20;
        notifyEngine();
        System.out.println("Car speed: " + speed + " km/h");
    }

    public void brake() {
        if (speed <= 0) {
            System.out.println("Car is already stopped.");
            return;
        }
        speed -= 20;
        if (speed < 0) speed = 0;
        notifyEngine();
        System.out.println("Car speed: " + speed + " km/h");
    }

    private void notifyEngine() {
        while (engine.getSpeed() < speed) {
            engine.increase();
        }
        while (engine.getSpeed() > speed) {
            engine.decrease();
        }
    }
}