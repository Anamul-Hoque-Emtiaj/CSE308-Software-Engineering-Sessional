package Problem2;

public class EspressoCoffee extends CoffeeDecorator{
    public EspressoCoffee(Coffee coffee) {
        super(coffee,"EspressoCoffee");
    }

    public String prepareCoffee() {
        return super.prepareCoffee()+",dairy cream";
    }

    public double coffeePrice() {
        return super.coffeePrice()+40;
    }
}
