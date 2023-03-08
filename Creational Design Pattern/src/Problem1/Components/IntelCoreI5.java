package Problem1.Components;

public class IntelCoreI5 implements Processor{
    @Override
    public String getName() {
        return "Intel 11th generation core i5 processor";
    }

    @Override
    public int getPrice() {
        return 20000;
    }
}
