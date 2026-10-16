/** Задание №3 (п.6): ComparableCircle */
public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle cc1 = new ComparableCircle(4);
        ComparableCircle cc2 = new ComparableCircle(6);
        GeometricObject maxCC = GeometricObject.max(cc1, cc2);
        System.out.println("Наибольший ComparableCircle, площадь = " + maxCC.getArea());

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        int cmp = circle.compareTo(rectangle);
        if (cmp > 0) {
            System.out.println("Круг больше прямоугольника");
        } else if (cmp < 0) {
            System.out.println("Прямоугольник больше круга");
        } else {
            System.out.println("Площади равны");
        }
    }
}
