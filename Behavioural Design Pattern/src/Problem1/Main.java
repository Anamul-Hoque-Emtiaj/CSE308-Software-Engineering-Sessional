package Problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Server server = new Server();

        User regular = new RegularUser(server,"RegularUser1");
        User premium = new PremiumUser(server, "PremiumUser1");

        int state = 1;
        while (true) {
            if (state == 1) {
                System.out.println("\n(server): operational mode");
                System.out.println("Press 1 for changing state to partially down or 2 for changing state to fully down");
                int inp = scn.nextInt();
                if(inp==1){
                    state = 2;
                    server.setState(state);
                }
                else if(inp==2){
                    state = 3;
                    server.setState(state);
                }
                else
                    System.out.println("Wrong input given!!");
            } else if (state == 2) {
                System.out.println("\n(server): partially down mode");
                System.out.println("Press 1 for changing state to operational or 2 for changing state to fully down");
                int inp = scn.nextInt();
                if(inp==1){
                    state = 1;
                    server.setState(state);
                }
                else if(inp==2){
                    state = 3;
                    server.setState(state);
                }
                else
                    System.out.println("Wrong input given!!");
            } else {
                System.out.println("\n(server): fully down mode");
                System.out.println("Press 1 for changing state to operational or 2 for changing state to partially down");
                int inp = scn.nextInt();
                if(inp==1){
                    state = 1;
                    server.setState(state);
                }
                else if(inp==2){
                    state = 2;
                    server.setState(state);
                }
                else
                    System.out.println("Wrong input given!!");
            }
        }
    }
}
