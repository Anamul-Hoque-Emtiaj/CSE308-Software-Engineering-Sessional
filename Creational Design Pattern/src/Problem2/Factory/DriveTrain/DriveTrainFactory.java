package Problem2.Factory.DriveTrain;

public class DriveTrainFactory  {

    public DriveTrain buildDrivetrain(String type) {
        if(type.equalsIgnoreCase("RearWheel"))
            return new RearWheel();
        else if(type.equalsIgnoreCase("AllWheel"))
            return new AllWheel();
        else
            return null;
    }
}
