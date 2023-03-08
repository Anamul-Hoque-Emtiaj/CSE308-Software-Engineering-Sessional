package Online.Ingredient;

public class Cheese implements Ingredient{
    @Override
    public String getName() {
        return "Cheese";
    }

    @Override
    public int getPrice() {
        return 30;
    }
}
