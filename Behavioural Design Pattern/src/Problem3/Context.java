package Problem3;

public class Context {
    public static LessBalanceState lbs;
    public static EqualBalanceState ebs;
    public static MoreBalanceState mbs;
    public static NoProductState nps;

    public static State state;
    public Context() {
        lbs = new LessBalanceState();
        ebs = new EqualBalanceState();
        mbs = new MoreBalanceState();
        nps = new NoProductState();
    }

    public void setLessBalanceState() {
        state = lbs;
    }

    public void setEqualBalanceState() {
        state = ebs;
    }

    public void setMoreBalanceState() {
        state = mbs;
    }

    public void setNoProductState() {
        state = nps;
    }

    public void doAction(double balance, double price){
        state.doAction(balance,price);
    }
}
