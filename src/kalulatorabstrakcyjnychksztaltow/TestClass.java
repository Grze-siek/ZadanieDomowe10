package kalulatorabstrakcyjnychksztaltow;

public class TestClass {
    public static void main(String[] args) {
        ShapeCalculator calc = new ShapeCalculator();
        Shape[] shapes = new Shape[5];
        shapes[0] = new Line2D(1, 2, 3, 4);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(10, 10);
        shapes[3] = new Ball(1);
        shapes[4] = new Cube(2);

        for (Shape shape : shapes) {
            if (shape instanceof Line2D) {
                double lineLength = calc.lineLength((Line2D) shape);
                System.out.printf("Odcinek wyznaczony przez współrzędne [%.1f, %.1f] [%.1f, %.1f] ma długość %.2f\n", ((Line2D) shape).x1, ((Line2D) shape).y1, ((Line2D) shape).x2, ((Line2D) shape).y2, lineLength);
                continue;
            } else if (shape instanceof Circle) {
                double circleArea = calc.circleArea((Circle) shape);
                System.out.printf("Okrąg o promieniu %.1f ma pole %.2f\n", ((Circle) shape).radius, circleArea);
                continue;
            } else if (shape instanceof Rectangle) {
                double rectangleArea = calc.rectangleArea((Rectangle) shape);
                System.out.printf("Prostokąt o długościach boków %.1f i %.1f ma pole, ktore wynosi %.2f\n", ((Rectangle) shape).sideA, ((Rectangle) shape).sideB, rectangleArea);
                continue;
            } else if (shape instanceof Ball) {
                double ballVolume = calc.ballVolume((Ball) shape);
                System.out.printf("Kula o promieniu %.1f ma pojemnosc %.2f\n", ((Ball) shape).radius, ballVolume);
                continue;
            } else {
                double cubeVolume = calc.cubeVolume((Cube) shape);
                System.out.printf("Szescian o dlugosci krawedzi %.1f ma pojemnosc %.2f", ((Cube) shape).side, cubeVolume);
            }


        }
    }
}


