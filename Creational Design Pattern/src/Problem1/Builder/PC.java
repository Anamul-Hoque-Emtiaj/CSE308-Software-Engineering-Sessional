package Problem1.Builder;

import Problem1.Components.Component;

import java.util.LinkedList;

public class PC {
    private LinkedList<Component> components;
    private int totalPrice;
    private int type;
    public PC(int n) {
        components = new LinkedList<Component>();
        type = n;
    }

    public void addComponent(Component cmp){
        totalPrice = totalPrice+ cmp.getPrice();
        components.add(cmp);
    }

    public void printVouchar(){

        if(type==1)
            System.out.println("PC 1: Gaming PC with AMD Ryzen 7 5700X Processor");
        else if(type==2)
            System.out.println("PC 2: Regular PC with Intel Core i5 Processor");
        else if(type==3)
            System.out.println("PC 3: Regular PC with Intel Core i7 Processor");
        else
            System.out.println("PC 4: Regular PC with Intel Core i9 Processor");
        System.out.println("Total Costs: "+totalPrice);
        System.out.println("Details Costs: ");
        System.out.println("Component Name  -------   price");
        for(int i=0; i<components.size(); i++){
            System.out.println(components.get(i).getName()+" ---- "+components.get(i).getPrice());
        }
        System.out.println("--------------");
    }
}
