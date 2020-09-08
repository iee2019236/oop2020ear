import java.util.Random;

interface Shape {
    double area();}

class Circle implements Shape {
    private int radius;

    public int getRadius() {return radius;}

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";}

    public double area() {return radius * 3.14159;}
    public Circle(int radius) {this.radius = radius;}}

class Rectangle implements Shape {
    private int height;
    private int width;

    public int getHeight() {return height;}
    public int getWidth() {return width;}

    @Override
    public String toString() {
        return "Rectangle [height=" + height + ", width=" + width + "]";}

    public double area() {return height * width;}
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;}}

class K1_Thema3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shapes = new Shape[50];
        for (int i = 0; i < shapes.length; i++) {
            try {
                if (rand.nextInt(2) > 0) {
                    int radius = rand.nextInt(51) + 5;
                    if (radius < 10 || radius > 50) {
                        throw new WrongDimensionsException();
                    } else {
                        shapes[i] = new Circle(radius);
                    }} else {
                    shapes[i] = new Rectangle(rand.nextInt(41) + 10, rand.nextInt(41) + 10);}
                System.out.println((i + 1) + ". " + shapes[i].toString() + " Area: " + shapes[i].area());
            } catch (WrongDimensionsException e) {
                e.printStackTrace();
                i--;}}

        System.out.println("averageRectagleArea=" + averageRectagleArea(shapes));
        System.out.println("maxCircleArea=" + maxCircleArea(shapes));
        System.out.println("totalShapeArea=" + totalShapeArea(shapes));}

    static double averageRectagleArea(Shape[] shapes) {
        int count = 0;
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                sum += shape.area();
                count++;}}
        return sum / count;}

    static double maxCircleArea(Shape[] shapes) {
        double max = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                if (max <= shape.area()) {
                    max = shape.area();}}}
        return max / 3.14159;}

    static double totalShapeArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();}
        return sum;}}

class WrongDimensionsException extends Exception {
    private static final long serialVersionUID = 1L;}