import engineTypes.ElectronicEngine;
import engineTypes.Engine;
import engineTypes.GasolineEngine;
import engineTypes.MixedHybridEngine;

public class CarFactory {

    // The enum is important to keep the engineTypes.
    public enum EngineType {
        GAS, ELECTRIC, HYBRID
    }

    private Engine buildEngine(EngineType type) {
        switch (type) {
            case GAS:      return new GasolineEngine();
            case ELECTRIC: return new ElectronicEngine();
            case HYBRID:   return new MixedHybridEngine();
            default:       throw new IllegalArgumentException("Unknown engine type: " + type);
        }
    }

    public Car createCar(EngineType type) {
        System.out.println("Creating car with engine: " + type);
        return new Car(buildEngine(type));
    }

    public void replaceEngine(Car car, EngineType type) {
        System.out.println("Replacing engine with: " + type);
        car.setEngine(buildEngine(type));
    }
}