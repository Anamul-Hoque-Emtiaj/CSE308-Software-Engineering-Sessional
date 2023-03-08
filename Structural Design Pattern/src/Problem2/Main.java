package Problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int choice;
        List<Coffee> orders = new ArrayList<Coffee>();
        while (true){
            System.out.println("-----Coffee Menu-----");
            System.out.println("1. Americano Coffee");
            System.out.println("2. Espresso Coffee");
            System.out.println("3. Cappuccino Coffee");
            System.out.println("4. Mocha Coffee");
            System.out.println("5. Exit");
            System.out.println("Enter your option(1,2,3,4 or 5)");
            choice = scn.nextInt();
            if(choice==1){
                Coffee coffee = new AmericanoCoffee(new BlackCoffee());
                orders.add(coffee);
                System.out.println("AmericanoCoffee added to order list");
            }
            else if(choice==2){
                Coffee coffee = new EspressoCoffee(new BlackCoffee());
                orders.add(coffee);
                System.out.println("EspressoCoffee added to order list");
            }
            else if(choice==3){
                Coffee coffee = new CappuccinoCoffee(new MilkCoffee());
                orders.add(coffee);
                System.out.println("CappuccinoCoffee added to order list");
            }
            else if(choice==4){
                Coffee coffee = new MochaCoffee(new MilkCoffee());
                orders.add(coffee);
                System.out.println("MochaCoffee added to order list");
            }
            else if(choice==5){
                if(orders.size()==0){
                    System.out.println("You didn't order any coffee");
                }
                else{
                    int c =1;
                    double totalPrice = 0;
                    System.out.println("---Order Details---");
                    for(Coffee coffee: orders){
                        System.out.println("Coffee "+c+": "+coffee.coffeeName());
                        c++;
                        System.out.println("Coffee ingredients: "+coffee.prepareCoffee());
                        System.out.println("Coffee Price: "+coffee.coffeePrice());
                        totalPrice += coffee.coffeePrice();
                    }
                    System.out.println();
                    System.out.println("Total Number of Coffee: "+orders.size());
                    System.out.println("Total Price: "+totalPrice);
                    System.out.println("---------------");
                    orders.clear();
                }
            }
            else
                System.out.println("Wrong Input given");
        }
    }
}
