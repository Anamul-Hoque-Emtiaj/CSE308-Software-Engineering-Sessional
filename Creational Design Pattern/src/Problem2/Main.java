package Problem2;

import Problem2.Factory.Car.Car;
import Problem2.Factory.Car.CarFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Car car;
        System.out.println("Select your Continent first." +
                "\nPress 1 for selecting Asia.\nPress 2 for selecting Europe." +
                "\n Press 3 for selecting US");
        int inp = scn.nextInt();
        CarFactory factory = new CarFactory();
        System.out.println("Appropriate Car details:");
        if(inp==1){
            car = factory.getCar("Asia");
        }
        else if(inp==2){
            car = factory.getCar("Europe");
        }
        else if(inp==3){
            car = factory.getCar("US");
        }
        else{
            car = null;
            System.out.println("Wrong input given!!");
        }
        car.carDetails();
    }
}
