package Problem2;

public class BlackCoffee implements Coffee{
    @Override
    public String prepareCoffee() {
        return "fancy coffee mugs, water, grinded coffee beans";
    }

    @Override
    public double coffeePrice() {
        return 130;
    }

    @Override
    public String coffeeName() {
        return "BlackCoffee";
    }
}
