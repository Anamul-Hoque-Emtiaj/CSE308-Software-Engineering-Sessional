package Problem1;

import Problem1.Builder.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Director director = new Director();
        PCBuilder myBuilder=null;
        int state = 1;

        while (true){
            if(state==1){
                System.out.println("Press O for opening your order");
                String str = scn.nextLine();
                if(str.equalsIgnoreCase("O"))
                    state = 2;
                else
                    System.out.println("Wrong input given");
            }
            else if (state==2){
                System.out.println("1. Gaming pc with Ryzen 7 5700X processor, Motherboard, 1TB HDD at 70000+280000=98000tk");
                System.out.println("2. Regular PC with intel i5 11gen processor, Motherboard, 1TB HDD, CPU cooler at" +
                        " 70000+20000+36000=126000");
                System.out.println("3. Regular PC with intel i7 11gen processor, Motherboard, 1TB HDD, liquid cooler at" +
                        " 70000+37000+17000=124000");
                System.out.println("4. Regular PC with intel i9 11gen processor, Motherboard, 1TB HDD, DVD Drive at" +
                        " 70000+65000+6000=141000");
                System.out.println("Press your preferred PC no.");
                String str = scn.nextLine();
                if(str.equalsIgnoreCase("1")){
                    System.out.println("PC-1 Added successfully\n");
                    state = 3;
                    myBuilder = new GamingPC();
                    director.build(myBuilder);
                }
                else if(str.equalsIgnoreCase("2")){
                    System.out.println("PC-2 Added successfully\n");
                    state = 3;
                    myBuilder = new I5PC();
                    director.build(myBuilder);
                }
                else if(str.equalsIgnoreCase("3")){
                    System.out.println("PC-3 Added successfully\n");
                    state = 3;
                    myBuilder = new I7PC();
                    director.build(myBuilder);
                }
                else if(str.equalsIgnoreCase("4")){
                    System.out.println("PC-4 Added successfully\n");
                    state = 3;
                    myBuilder = new I9PC();
                    director.build(myBuilder);
                }
                else {
                    System.out.println("wrong input given");
                }
            }
            else if(state==3){
                System.out.println("Customize your PC with bellow options:");
                System.out.println("1.  8GB DDR4 2666 MHz RAM at 2620tk");
                System.out.println("2.  8GB DDR4 3200 MHz RAM at 2950tk");
                System.out.println("3.  2GB Graphics card RAM at 6500tk");
                System.out.println("4.  4GB Graphics card RAM at 7600tk");
                System.out.println("Choose your option for customization or press E for closing your order");
                String str = scn.nextLine();
                if(str.equalsIgnoreCase("1")){
                    director.addRAM(2666,myBuilder);
                    System.out.println("8GB DDR4 2666 MHz RAM Added successfully\n");
                }
                else if(str.equalsIgnoreCase("2")){
                    director.addRAM(3200,myBuilder);
                    System.out.println("8GB DDR4 3200 MHz RAM Added successfully\n");
                }
                else if(str.equalsIgnoreCase("3")){
                    director.addGPU(2,myBuilder);
                    System.out.println("2GB Graphics card Added successfully\n");
                }
                else if(str.equalsIgnoreCase("4")){
                    director.addGPU(4,myBuilder);
                    System.out.println("4GB Graphics card Added successfully\n");
                }
                else if(str.equalsIgnoreCase("E")){
                    System.out.println("Successfully completed your order.");
                    System.out.println("PC specification with price");
                    PC myPC = myBuilder.getPC();
                    myPC.printVouchar();
                    state = 1;
                }
                else if(str.equalsIgnoreCase("O")){
                    System.out.println("wrong input given. you can add more item in same order");
                }
                else {
                    System.out.println("wrong input given");
                }
            }
        }
    }
}
