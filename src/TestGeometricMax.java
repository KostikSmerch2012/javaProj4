/** Задание №3 (п.5): метод max() для кругов и прямоугольников */
public class TestGeometricMax {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);
        GeometricObject maxCircle = GeometricObject.max(c1, c2);
        System.out.println("Наибольший круг, площадь = " + maxCircle.getArea());

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 10);
        GeometricObject maxRect = GeometricObject.max(r1, r2);
        System.out.println("Наибольший прямоугольник, площадь = " + maxRect.getArea());
    }
}
