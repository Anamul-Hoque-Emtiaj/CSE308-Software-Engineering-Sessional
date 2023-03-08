package Problem2.Factory.Car;

import Problem2.Factory.Color.Color;
import Problem2.Factory.Color.ColorFactory;
import Problem2.Factory.Country.Country;
import Problem2.Factory.Country.Japan;
import Problem2.Factory.DriveTrain.DriveTrain;
import Problem2.Factory.DriveTrain.DriveTrainFactory;
import Problem2.Factory.Engine.Engine;
import Problem2.Factory.Engine.EngineFactory;

public class Toyota implements Car{
    Color color;
    Engine engine;
    DriveTrain driveTrain;
    Country country;

    public Toyota() {
        country = new Japan();

        EngineFactory factory1 = new EngineFactory();
        engine = factory1.buildEngine("Hydrogen");

        ColorFactory factory2 = new ColorFactory();
        color = factory2.getColor("Red");

        DriveTrainFactory factory3 = new DriveTrainFactory();
        driveTrain = factory3.buildDrivetrain("RearWheel");
    }

    @Override
    public void carDetails() {
        System.out.println("Car: Toyota");
        country.madeIn();
        engine.build();
        color.fill();
        driveTrain.make();
    }
}
