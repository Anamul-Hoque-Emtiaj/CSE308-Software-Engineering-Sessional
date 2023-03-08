package Online;

import Online.Ingredient.*;

public class BurgerBuilder {
    private Burger burger = new Burger();
    void buildBun(){
        burger.addIngredient(new Bun());
    }
    void buildPatty(){
        burger.addIngredient(new Patty());
    }
    void buildCheese(){
        burger.addIngredient(new Cheese());
    }
    void buildSauce(){
        burger.addIngredient(new BBQ_Sauce());
    }
    void buildSalad(){
        burger.addIngredient(new Salad());
    }
    Burger getBurger(){
        return burger;
    }
}
