import engineTypes.Engine;
import engineTypes.GasolineEngine;
import engineTypes.ElectronicEngine;
import engineTypes.MixedHybridEngine;


public class Main {

    public static void main(String[] args) {

        CarFactory factory = new CarFactory();

        // gas
        System.out.println("=== Gas Car ===");
        Car gasCar = factory.createCar(CarFactory.EngineType.GAS);
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.brake();
        gasCar.stop();

        // hybrid
        System.out.println("\n=== Hybrid Car ===");
        Car hybridCar = factory.createCar(CarFactory.EngineType.HYBRID);
        hybridCar.start();
        // electric engine will be changed if the speed >= 50 km/h
        for (int i = 0; i < 3; i++) hybridCar.accelerate();

        // engine replacement demo
        System.out.println("\n=== engineTypes.Engine Replacement ===");
        factory.replaceEngine(hybridCar, CarFactory.EngineType.ELECTRIC);
        hybridCar.accelerate(); // now uses electric engine
    }
}