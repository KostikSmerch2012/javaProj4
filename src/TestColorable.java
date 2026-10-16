/** Задание №4: Colorable и Square */
public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Square(3),
                new Circle(2),
                new Square(5),
                new Rectangle(2, 4),
                new Square(1.5)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Площадь: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
        }
    }
}
