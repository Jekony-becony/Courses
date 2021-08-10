package Courses;

public class Circle extends GeomtricalFigures implements GeoFigures {
    static final int side = 4;
    double radius;

    public Circle(String name, String fillColor, String borderColor, double radius) {
        super(name, fillColor, borderColor);
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Радиус должен быть больше 0!");
        }
    }

    @Override
    public double calculateSquare() {
        double square;
        square = Math.PI * (radius * radius);
        return square;
    }

    public double calculatePerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }


}
