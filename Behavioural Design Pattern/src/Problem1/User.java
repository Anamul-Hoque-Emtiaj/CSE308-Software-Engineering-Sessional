package Problem1;

import java.util.Scanner;

public abstract class User { //observer
    protected Server server;
    protected int flag;
    protected String name;
    protected Scanner scn = new Scanner(System.in);
    public abstract int update(String msg, boolean reply);

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
