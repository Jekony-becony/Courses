package Courses;

public class Rectangle extends GeomtricalFigures implements GeoFigures {
    static final int side = 4;
    double sideA;
    double sideB;
    double sideC;
    double sideD;

    public Rectangle(String name, String fillСolor, String borderColor, double sideA, double sideB, double sideC, double sideD) {
        super(name, fillСolor, borderColor);
        if (sideA <= 0 || sideB <= 0 || sideC <= 0 || sideD <= 0) {
            System.out.println("Значение сторон должно быть больше 0!");
        } else if (sideA == sideB && sideC == sideD) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            System.out.println("Данный прямоугольник не может существовать,задайте значения парами(2,2,4,4)");
        }
    }

    @Override
    public double calculateSquare() {
        double square;
        square = sideA * sideC;
        return square;
    }

    public double[] getArray() {
        double[] rectangleArray = new double[]{sideA, sideB, sideC, sideD};
        return rectangleArray;
    }
}
