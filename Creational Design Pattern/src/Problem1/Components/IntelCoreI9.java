package Problem1.Components;

public class IntelCoreI9 implements Processor{
    @Override
    public String getName() {
        return "Intel 11th generation core i9 processor";
    }

    @Override
    public int getPrice() {
        return 65000;
    }
}
