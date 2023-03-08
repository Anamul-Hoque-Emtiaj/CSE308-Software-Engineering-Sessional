package Problem1.Components;

public class BasePc implements Component{
    @Override
    public String getName() {
        return "Base PC: Motherboard + 1TB HDD";
    }

    @Override
    public int getPrice() {
        return 70000;
    }
}
