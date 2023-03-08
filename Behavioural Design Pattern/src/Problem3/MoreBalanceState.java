package Problem3;

public class MoreBalanceState implements State{
    @Override
    public void doAction(double balance, double price) {
        System.out.println("Take extra "+(balance-price)+" tk");
        System.out.println("Collect your product");
        System.out.println("--------------------");
    }
}
