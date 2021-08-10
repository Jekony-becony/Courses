package Courses;

public class Rectangle extends GeomtricalFigures implements GeoFigures {
    static final int side = 4;
    double sideA;
    double sideB;


    public Rectangle(String name, String fillColor, String borderColor, double sideA, double sideB) {
        super(name, fillColor, borderColor);
        if (sideA > 0 && sideB > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            System.out.println("Значение сторон должны быть больше 0!");
        }
    }

    @Override
    public double calculateSquare() {
        double square;
        square = sideA * sideB;
        return square;
    }

    public double[] getArray() {
        double[] rectangleArray = new double[]{sideA, sideB, sideA, sideB};
        return rectangleArray;
    }
}
