import java.util.Scanner;

/** Задания №1–№3 (п.1–3): Triangle + IllegalTriangleException */
public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите три стороны треугольника: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Введите цвет: ");
        String color = input.next();

        System.out.print("Треугольник закрашен (true/false)? ");
        boolean filled = input.nextBoolean();

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println(triangle);
            System.out.println("Площадь: " + triangle.getArea());
            System.out.println("Периметр: " + triangle.getPerimeter());
            System.out.println("Цвет: " + triangle.getColor());
            System.out.println("Закрашен: " + triangle.isFilled());
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
