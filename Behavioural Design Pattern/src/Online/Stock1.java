package Online;

public class Stock1 extends Stock{

    public Stock1(String name, double price) {
        super(name,price);
    }

    @Override
    public void add(Client client) {
        clients.add(client);
    }

    @Override
    public void remove(Client client) {
        clients.remove(client);
    }

    @Override
    public void notifyAllUsers(double prev, double cur) {
        for(Client client: clients){
            String str ="";
            str += "Stock " + name + " changed price " + prev + " to " + cur+"\n";
            client.update(str);
        }
    }
}

