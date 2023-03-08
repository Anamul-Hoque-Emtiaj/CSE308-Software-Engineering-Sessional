package Online.Ingredient;

public class Bun implements Ingredient{
    @Override
    public String getName() {
        return "Bun";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
