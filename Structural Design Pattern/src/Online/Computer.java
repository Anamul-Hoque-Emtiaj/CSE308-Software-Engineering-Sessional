package Online;

public class Computer extends Device{
    public Computer(OperatingSystem os) {
        super(os);
    }

    @Override
    void store() {
        os.enableStore();
        System.out.println("Computer Store");
    }

    @Override
    void interact() {
        os.enableStore();
        System.out.println("Computer Interact");
    }

    @Override
    void communicate() {
        os.enableCommunicate();
        System.out.println("Computer Interact");
    }
}
