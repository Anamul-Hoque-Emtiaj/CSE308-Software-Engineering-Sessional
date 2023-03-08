package Online;

public class Main {
    public static void main(String[] args) {


        Stock stock1 = new Stock1("Stock1",10.5);
        Stock stock2 = new Stock1("Stock2",15);

        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");

        client1.addStock(stock1);
        client2.addStock(stock2);

        stock1.setPrice(12.5);
        stock2.setPrice(13.5);
    }
}
