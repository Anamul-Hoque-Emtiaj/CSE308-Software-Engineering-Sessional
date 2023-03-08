package Problem2;

public class CappuccinoCoffee extends CoffeeDecorator{
    public CappuccinoCoffee(Coffee coffee) {
        super(coffee,"CappuccinoCoffee");
    }

    public String prepareCoffee() {
        return super.prepareCoffee()+", cinnamon powder";
    }

    public double coffeePrice() {
        return super.coffeePrice()+50;
    }
}
