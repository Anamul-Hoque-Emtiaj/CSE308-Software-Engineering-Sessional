package Problem1;

public class Main {
    public static void main(String[] args) {
        Passengers p1 = new Crewmate();
        Passengers p2 = new Adapter();
        p1.maintain();
        p1.study();
        p2.maintain();
        p2.study();
    }
}
