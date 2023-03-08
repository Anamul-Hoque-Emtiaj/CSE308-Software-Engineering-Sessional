package Online.Ingredient;

public class BBQ_Sauce implements Ingredient{
    @Override
    public String getName() {
        return "BBQ Sauce";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
