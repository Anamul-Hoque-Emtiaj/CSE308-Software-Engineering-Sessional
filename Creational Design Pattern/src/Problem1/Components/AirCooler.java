package Problem1.Components;

public class AirCooler implements Cooler{
    @Override
    public String getName() {
        return "CPU cooler";
    }

    @Override
    public int getPrice() {
        return 36000;
    }
}
