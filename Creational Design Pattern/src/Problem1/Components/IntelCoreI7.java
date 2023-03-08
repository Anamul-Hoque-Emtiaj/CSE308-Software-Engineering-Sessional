package Problem1.Components;

public class IntelCoreI7 implements Processor{
    @Override
    public String getName() {
        return "Intel 11th generation core i7 processor";
    }

    @Override
    public int getPrice() {
        return 37000;
    }
}
