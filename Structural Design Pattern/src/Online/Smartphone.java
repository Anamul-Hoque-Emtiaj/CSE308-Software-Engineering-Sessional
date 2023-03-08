package Online;

public class Smartphone extends Device{
    public Smartphone(OperatingSystem os) {
        super(os);
    }

    @Override
    void store() {
        os.enableStore();
        System.out.println("Smartphone Store");
    }

    @Override
    void interact() {
        os.enableInteract();
        System.out.println("Smartphone Interact");
    }

    @Override
    void communicate() {
        os.enableCommunicate();
        System.out.println("Smartphone Communicate");
    }
}
