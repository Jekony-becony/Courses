package Courses;

public class Circle extends GeomtricalFigures implements GeoFigures {
    static final int side = 4;
    double radius;

    public Circle(String name, String fillÑolor, String borderColor, double radius) {
        super(name, fillÑolor, borderColor);
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ğàäèóñ äîëæåí áûòü áîëüøå 0!");
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
