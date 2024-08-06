import java.util.*;
public class p7 {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Red");
        Rectangle rectangle = new Rectangle(4, 6, "Blue");

        Sign circleSign = new Sign(circle, "It is Circle ...!!!");
        Sign rectangleSign = new Sign(rectangle, "It is Ractangle ...!!!");

        System.out.println("Circle Sign Details:");
        circleSign.printSignDetails();
        
        System.out.println("\nRectangle Sign Details:");
        rectangleSign.printSignDetails();
        System.out.println("This Practical is made by 23CS058-Banti Patel");
    }
}
interface Shape {
    double getArea();
    String getColor();

    default void printDetails() {
        System.out.println("Shape Color: " + getColor());
        System.out.println("Shape Area: " + getArea());
    }
}


class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getColor() {
        return color;
    }
}


class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    
    public double getArea() {
        return length * width;
    }

    
    public String getColor() {
        return color;
    }
}


class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void printSignDetails() {
        System.out.println("Sign Text: " + text);
        shape.printDetails();
    }
}



