package Online.Ingredient;

public class Patty implements Ingredient{
    @Override
    public String getName() {
        return "Patty";
    }

    @Override
    public int getPrice() {
        return 80;
    }
}
