package Problem2.Factory.Car;

import Problem2.Factory.Color.Color;
import Problem2.Factory.Color.ColorFactory;
import Problem2.Factory.Country.Country;
import Problem2.Factory.Country.US;
import Problem2.Factory.DriveTrain.DriveTrain;
import Problem2.Factory.DriveTrain.DriveTrainFactory;
import Problem2.Factory.Engine.Engine;
import Problem2.Factory.Engine.EngineFactory;

public class Tesla implements Car{
    Color color;
    Engine engine;
    DriveTrain driveTrain;
    Country country;

    public Tesla() {
        country = new US();

        EngineFactory factory1 = new EngineFactory();
        engine = factory1.buildEngine("Electric");

        ColorFactory factory2 = new ColorFactory();
        color = factory2.getColor("White");

        DriveTrainFactory factory3 = new DriveTrainFactory();
        driveTrain = factory3.buildDrivetrain("AllWheel");
    }

    @Override
    public void carDetails() {
        System.out.println("Car: Tesla");
        country.madeIn();
        engine.build();
        color.fill();
        driveTrain.make();
    }
}
