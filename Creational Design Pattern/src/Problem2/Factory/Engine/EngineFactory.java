package Problem2.Factory.Engine;

public class EngineFactory {

    public Engine buildEngine(String type) {
        if(type.equalsIgnoreCase("Electric"))
            return new ElectricEngine();
        else if(type.equalsIgnoreCase("Hydrogen"))
            return new HydrogenEngine();
        else
            return null;
    }
}
