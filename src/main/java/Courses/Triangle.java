package Courses;

public class Triangle extends GeomtricalFigures implements GeoFigures {
    static final int side = 3;
    int sideA;
    int sideB;
    int sideC;

    public Triangle(String name, String fillСolor, String borderColor, int sideA, int sideB, int sideC) {
        super(name, fillСolor, borderColor);
        if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Данный треугольник не может существовать");
        }

    }

    @Override
    public double calculateArea() {
        double area;
        double p = (sideA + sideB + sideC) / 2.0;
        area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    public int[] getArray() {
        int[] triangleArray = new int[]{sideA, sideB, sideC};
        return triangleArray;
    }
}
