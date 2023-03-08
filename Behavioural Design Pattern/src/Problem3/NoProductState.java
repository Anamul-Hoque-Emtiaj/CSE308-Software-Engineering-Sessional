package Problem3;

public class NoProductState implements State{
    @Override
    public void doAction(double balance, double price) {
        System.out.println("Product stock out!");
        System.out.println("Take your "+(balance)+" tk");
        System.out.println("--------------------");
    }
}
