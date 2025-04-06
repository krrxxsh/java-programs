class ShapeArea {
    
    public double calculateArea(double radius) {
        return 3.14159 * radius * radius;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(int side) {
        return side * side;
    }

    public double calculateArea(int base, double height) {
        return 0.5 * base * height;
    }
}
 class AreaOverloading {

    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();
        
        System.out.println("Area of Circle: " + shape.calculateArea(5.0));
        System.out.println("Area of Rectangle: " + shape.calculateArea(4.0, 6.0));
        System.out.println("Area of Square: " + shape.calculateArea(4.0));
        System.out.println("Area of Triangle: " + shape.calculateArea(4.0, 6.0));
    }
}
