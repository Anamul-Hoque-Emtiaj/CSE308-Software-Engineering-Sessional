package Online;

import Problem1.User;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private List<Stock> stocks;
    private String name;

    public Client(String name) {
        stocks = new ArrayList<Stock>();
        this.name = name;
    }

    public void update(String msg){
        System.out.println(name+":");
        System.out.println(msg);
    }

    public void addStock(Stock stock){
        stock.add(this);
        stocks.add(stock);
    }

    public void removeStock(Stock stock){
        stocks.remove(stock);
        stock.remove(this);
    }

}
