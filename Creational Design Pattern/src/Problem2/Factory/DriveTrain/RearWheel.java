package Problem2.Factory.DriveTrain;

public class RearWheel implements DriveTrain{
    @Override
    public void make() {
        System.out.println("Drive train System: Rear Wheel");
    }
}
