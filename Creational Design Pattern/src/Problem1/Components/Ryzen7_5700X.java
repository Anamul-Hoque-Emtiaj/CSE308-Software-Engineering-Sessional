package Problem1.Components;

public class Ryzen7_5700X implements Processor{
    @Override
    public String getName() {
        return "AMD Ryzen 7 5700X processor";
    }

    @Override
    public int getPrice() {
        return 28000;
    }
}
