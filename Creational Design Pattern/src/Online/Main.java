package Online;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int state=1;
        Scanner scn = new Scanner(System.in);
        Director director = new Director();
        BurgerBuilder builder = null;
        while (true){
            if(state==1){
                System.out.println("press 1 for building your Burger");
                String str = scn.nextLine();
                if(str.equalsIgnoreCase("1")) {
                    System.out.println("Burger Build Successfully");
                    state = 2;
                    builder = new BurgerBuilder();
                    director.build(builder);
                }
                else
                    System.out.println("Wrong input given");
            }
            else if(state==2){
                System.out.println("Press 1,2,3,4 for building Patty, Cheese, BBq Sauce, Salad");
                System.out.println("Press E for closing your order");
                String str = scn.nextLine();
                if(str.equalsIgnoreCase("1")) {
                    System.out.println("Patty added Successfully");
                    director.addPatty(builder);
                }
                else if(str.equalsIgnoreCase("2")){
                    System.out.println("Cheese added Successfully");
                    director.addCheese(builder);
                }
                 else if(str.equalsIgnoreCase("3")){
                    System.out.println("BBQ Sauce added Successfully");
                    director.addBBQSauce(builder);
                }
                 else if(str.equalsIgnoreCase("4")){
                    System.out.println("Salad added Successfully");
                    director.addSalad(builder);
                }
                 else if(str.equalsIgnoreCase("E")){
                     state = 1;
                     Burger burger = builder.getBurger();
                     burger.printBurger();
                }
                else
                    System.out.println("Wrong input given");
            }
        }

    }
}
