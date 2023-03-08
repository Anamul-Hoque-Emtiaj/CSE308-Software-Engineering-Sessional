package Problem2;

public abstract class CoffeeDecorator implements Coffee{
    Coffee coffee;
    String name;
    public CoffeeDecorator(Coffee coffee, String name) {
        this.coffee = coffee;
        this.name = name;
    }

    @Override
    public String prepareCoffee() {
        return coffee.prepareCoffee();
    }

    @Override
    public double coffeePrice() {
        return coffee.coffeePrice();
    }

    @Override
    public String coffeeName() {
        return name;
    }
}
