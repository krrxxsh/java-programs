import java.util.Scanner;

class Shape {
    public double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class AreaOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double circleRadius = scanner.nextDouble();
        Shape circle = new Circle(circleRadius);

        System.out.println("Enter the length and breadth of the rectangle:");
        double rectangleLength = scanner.nextDouble();
        double rectangleBreadth = scanner.nextDouble();
        Shape rectangle = new Rectangle(rectangleLength, rectangleBreadth);

        System.out.println("Enter the side of the square:");
        double squareSide = scanner.nextDouble();
        Shape square = new Square(squareSide);

        System.out.println("Enter the base and height of the triangle:");
        double triangleBase = scanner.nextDouble();
        double triangleHeight = scanner.nextDouble();
        Shape triangle = new Triangle(triangleBase, triangleHeight);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        scanner.close();
    }
}
