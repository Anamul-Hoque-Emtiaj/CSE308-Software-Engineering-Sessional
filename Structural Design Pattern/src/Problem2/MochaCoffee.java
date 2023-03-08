package Problem2;

public class MochaCoffee extends CoffeeDecorator{
    public MochaCoffee(Coffee coffee) {
        super(coffee,"MochaCoffee");
    }

    public String prepareCoffee() {
        return super.prepareCoffee()+", chocolate sauce";
    }

    public double coffeePrice() {
        return super.coffeePrice()+60;
    }
}
