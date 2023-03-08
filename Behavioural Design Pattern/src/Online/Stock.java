package Online;

import Problem1.User;

import java.util.ArrayList;
import java.util.List;

public abstract class Stock {
    protected String  name;
    protected double price;
    protected List<Client> clients;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        clients = new ArrayList<Client>();
    }

    public void setPrice(double price) {
        this.notifyAllUsers(this.price, price);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public abstract void add(Client client);

    public abstract void remove(Client client);

    public abstract void notifyAllUsers(double prev, double cur);
}
