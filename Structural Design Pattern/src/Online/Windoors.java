package Online;

public class Windoors implements OperatingSystem{
    @Override
    public void enableStore() {
        System.out.println("Windoors enable Store");
    }

    @Override
    public void enableInteract() {
        System.out.println("Windoors enable Interact");
    }

    @Override
    public void enableCommunicate() {
        System.out.println("Windoors enable communicate");
    }
}
