package Courses;

public interface GeoFigures {

    double calculateArea();

    default int calculatingPerimeter(int sides[]) {
        int perimeter = 0;
        for (int i = 0; i < sides.length; i++) {
            perimeter += sides[i];
        }
        return perimeter;
    }


}
