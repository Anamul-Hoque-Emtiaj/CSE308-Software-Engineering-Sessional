package Problem2.Factory.Engine;

public class ElectricEngine implements Engine{

    @Override
    public void build() {
        System.out.println("Engine Type: Electric");
    }
}
