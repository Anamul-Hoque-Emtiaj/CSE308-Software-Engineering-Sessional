package Problem3;

public class EqualBalanceState implements State{
    @Override
    public void doAction(double balance, double price) {
        System.out.println("Collect your product");
        System.out.println("--------------------");
    }
}
