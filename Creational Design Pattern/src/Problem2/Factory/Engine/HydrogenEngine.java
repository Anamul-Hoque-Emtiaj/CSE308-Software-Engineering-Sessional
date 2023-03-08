package Problem2.Factory.Engine;

public class HydrogenEngine implements Engine{

    @Override
    public void build() {
        System.out.println("Engine Type: Hydrogen fuel cells");
    }
}
