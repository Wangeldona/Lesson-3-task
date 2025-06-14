abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() {
        return a + b + c;
    }
}

public class No4 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(3, 4, 5);

        System.out.println("Circle - Area: " + s1.calculateArea() + ", Perimeter: " + s1.calculatePerimeter());
        System.out.println("Rectangle - Area: " + s2.calculateArea() + ", Perimeter: " + s2.calculatePerimeter());
        System.out.println("Triangle - Area: " + s3.calculateArea() + ", Perimeter: " + s3.calculatePerimeter());
    }
}
