package Problem3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double price = 10;
        int productCount = 10;
        double balance = 0;
        Context context = new Context();
        Scanner scn = new Scanner(System.in);
        while (true){
            if(productCount>0){
                System.out.println("Product stock:" +productCount);
                System.out.println("Your Balance: "+balance);
                System.out.println("Enter more "+(price-balance)+" tk for getting a product");
                double temp = scn.nextDouble();
                balance = balance+temp;

                if(balance<price){
                    context.setLessBalanceState();
                    context.doAction(balance,price);
                }
                else if(balance==price){
                    context.setEqualBalanceState();
                    context.doAction(balance,price);
                    productCount--;
                    balance = 0;
                }
                else {
                    context.setMoreBalanceState();
                    context.doAction(balance,price);
                    productCount--;
                    balance = 0;
                }
            }
            else{
                System.out.println("Out of stock. Can not take request right now!!");
                double temp = scn.nextDouble();
                context.setNoProductState();
                context.doAction(temp,price);
            }
        }
    }
}
