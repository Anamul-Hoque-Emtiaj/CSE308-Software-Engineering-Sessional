package Problem2.Factory.Color;

public class ColorFactory {

    public Color getColor(String clr) {
        if(clr.equalsIgnoreCase("Black"))
            return new Black();
        else if(clr.equalsIgnoreCase("White"))
            return new White();
        else if(clr.equalsIgnoreCase("Red"))
            return new Red();
        else
            return null;
    }
}
