package Online.Ingredient;

public class Salad implements Ingredient{
    @Override
    public String getName() {
        return "Salad";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
