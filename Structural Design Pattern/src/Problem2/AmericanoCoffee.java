package Problem2;

public class AmericanoCoffee extends CoffeeDecorator{
    public AmericanoCoffee(Coffee coffee) {
        super(coffee,"AmericanoCoffee");
    }

    public String prepareCoffee() {
        return super.prepareCoffee()+", additional grinded coffee beans";
    }

    public double coffeePrice() {
        return super.coffeePrice()+30;
    }
}
