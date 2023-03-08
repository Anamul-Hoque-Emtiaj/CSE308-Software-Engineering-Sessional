package Problem2.Factory.Car;

public class CarFactory {
    public Car getCar(String name) {
        if(name.equalsIgnoreCase("Europe"))
            return new BMW();
        else if(name.equalsIgnoreCase("US"))
            return new Tesla();
        else if(name.equalsIgnoreCase("Asia"))
            return new Toyota();
        else
            return null;
    }
}
