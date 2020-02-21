package kalulatorabstrakcyjnychksztaltow;

public class LineCalc  {

    public double lineLength(Line2D line)
    {
        double  xCoordinatesDifference = line.x2 - line.x1;
        double yCoordinatesDifference = line.y2 - line.y1;
        double lineLength = Math.sqrt(Math.pow(xCoordinatesDifference, 2) + Math.pow(yCoordinatesDifference, 2));
    return lineLength;
    }
}
