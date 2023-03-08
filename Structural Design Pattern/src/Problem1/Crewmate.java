package Problem1;

public class Crewmate implements Passengers{
    @Override
    public void study() {
        System.out.println("Crewmate: studying");
    }

    @Override
    public void maintain() {
        System.out.println("Crewmate: maintenance");
    }
}
