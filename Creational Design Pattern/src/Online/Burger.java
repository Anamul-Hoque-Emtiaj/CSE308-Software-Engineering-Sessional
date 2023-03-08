package Online;

import Online.Ingredient.Ingredient;

import java.util.LinkedList;

public class Burger {
    private LinkedList<Ingredient> list;
    private int totalPrice;

    public Burger() {
        list = new LinkedList<Ingredient>();
        totalPrice = 0;
    }

    public void addIngredient(Ingredient in){
        list.add(in);
        totalPrice = totalPrice+in.getPrice();
    }

    public void printBurger(){
        System.out.println("Total Costs: "+totalPrice);
        System.out.println("Details Costs: ");
        System.out.println("Ingredient Name  -------   price");
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getName()+" ---- "+list.get(i).getPrice());
        }
        System.out.println("--------------");
    }
}
