package Courses;

public interface GeoFigures {

    double calculateSquare();

    default double calculatePerimeter(double sides[]) {
        double perimeter = 0;
        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }


}
