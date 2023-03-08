package Problem1.Components;

public class LiquidCooler implements Cooler{
    @Override
    public String getName() {
        return "Liquid cooler";
    }

    @Override
    public int getPrice() {
        return 17000;
    }
}
