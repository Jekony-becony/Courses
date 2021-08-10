package Courses;

public class Triangle extends GeomtricalFigures implements GeoFigures {
    static final int side = 3;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(String name, String fillСolor, String borderColor, double sideA, double sideB, double sideC) {
        super(name, fillСolor, borderColor);
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Значение сторон должно быть больше 0!");
        } else if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Данный треугольник не может существовать");
        }

    }

    @Override
    public double calculateSquare() {
        double square;
        double p = (sideA + sideB + sideC) / 2.0;
        square = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return square;
    }

    public double[] getArray() {
        double[] triangleArray = new double[]{sideA, sideB, sideC};
        return triangleArray;
    }
}
