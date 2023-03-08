package Problem2.Factory.Car;

import Problem2.Factory.Color.Color;
import Problem2.Factory.Color.ColorFactory;
import Problem2.Factory.Country.Country;
import Problem2.Factory.Country.Germany;
import Problem2.Factory.DriveTrain.DriveTrain;
import Problem2.Factory.DriveTrain.DriveTrainFactory;
import Problem2.Factory.Engine.Engine;
import Problem2.Factory.Engine.EngineFactory;

public class BMW implements Car{
    Color color;
    Engine engine;
    DriveTrain driveTrain;
    Country country;

    public BMW() {
        country = new Germany();

        EngineFactory factory1 = new EngineFactory();
        engine = factory1.buildEngine("Electric");

        ColorFactory factory2 = new ColorFactory();
        color = factory2.getColor("Black");

        DriveTrainFactory factory3 = new DriveTrainFactory();
        driveTrain = factory3.buildDrivetrain("RearWheel");
    }

    @Override
    public void carDetails() {
        System.out.println("Car: BMW");
        country.madeIn();
        engine.build();
        color.fill();
        driveTrain.make();
    }
}
