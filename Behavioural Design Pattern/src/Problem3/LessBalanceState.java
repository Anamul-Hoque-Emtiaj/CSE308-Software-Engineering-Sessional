package Problem3;

public class LessBalanceState implements State{
    @Override
    public void doAction(double balance, double price) {
        System.out.println("Low Balance!!\n" +
                "Need more "+(price-balance)+" tk for getting product\n");
    }
}
