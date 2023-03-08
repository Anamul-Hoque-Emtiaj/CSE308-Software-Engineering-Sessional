package Online;

public class Main {
    public static void main(String[] args) {
        Device phone = new Smartphone(new Windoors());
        Device computer = new Smartphone(new Linus());
        phone.store();
        phone.communicate();
        phone.interact();
        computer.store();
        computer.interact();
        computer.communicate();
        computer.changeOs(new Windoors());
        computer.store();
    }
}
