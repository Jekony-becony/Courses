package Courses;

public class Circle extends GeomtricalFigures implements GeoFigures {
    static final int side = 4;
    double radius;

    public Circle(String name, String fill�olor, String borderColor, double radius) {
        super(name, fill�olor, borderColor);
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("������ ������ ���� ������ 0!");
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
