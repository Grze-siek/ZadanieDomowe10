package kalulatorabstrakcyjnychksztaltow;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    public double circleArea(Circle circle) {
        double circleArea = Math.PI * Math.pow(circle.radius , 2);
        return circleArea;
    }

    public double rectangleArea(Rectangle rectangle) {
        double rectangleArea = rectangle.sideA * rectangle.sideB;
        return rectangleArea;
    }

    public double ballVolume(Ball ball) {
        double ballVolume = Math.floorDiv(4,3) * Math.PI * Math.pow(ball.radius, 3);
        return ballVolume;
    }

    public double cubeVolume(Cube cube) {
        double cubeVolume = Math.pow(cube.side, 3);
        return cubeVolume;
    }

    @Override
    public double shapeArea(GeometricShape shape) {
        if(shape.getClass() == Circle.class) {
            return circleArea((Circle) shape);
        } else
            return rectangleArea((Rectangle) shape);
    }

    @Override
    public double volume(Shape3D shape) {
        if(shape.getClass() == Ball.class)
            return ballVolume((Ball) shape);
        else
            return cubeVolume((Cube) shape);

    }
}
