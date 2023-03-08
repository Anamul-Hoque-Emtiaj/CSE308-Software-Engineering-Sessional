package Problem2;

public class MilkCoffee implements Coffee{
    @Override
    public String prepareCoffee() {
        return "fancy coffee mugs, milk, grinded coffee beans";
    }

    @Override
    public double coffeePrice() {
        return 180;
    }

    @Override
    public String coffeeName() {
        return "MilkCoffee";
    }
}
