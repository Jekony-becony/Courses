package Courses;

public class HomeWorkApp {
    public static void main(String[] args) {
        Dog dogMuhtar = new Dog("Muhtar", 2, "black");
        dogMuhtar.info();
        Cat catBarsik = new Cat("Barsik", 4, "black", 10, false);
        catBarsik.info();
        Cat catMurzik = new Cat("Murzik", 3, "white", 20, false);
        catMurzik.info();
        Cat catChumcha = new Cat("Chumcha", 5, "", 15, false);
        catChumcha.info();
        System.out.println("Количество котов: " + catBarsik.getCount());
        Plate plate = new Plate(30);
        plate.info();
        Cat[] catArray = new Cat[]{catBarsik, catMurzik, catChumcha};
        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            System.out.println(catArray[i].name + " сытость-" + catArray[i].getSatiety());
        }
        plate.info();

        Triangle triangle = new Triangle("Треугольник", "green", "blue", 5, 10, 12);
        triangle.info();
        System.out.println(triangle.calculatingPerimeter(triangle.getArray()));
        System.out.println(triangle.calculateArea());
    }

}
