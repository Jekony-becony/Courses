package Courses;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        count++;
    }

    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " не может бегать больше чем 500 метров :(");
        } else {
            System.out.println(name + " пробежал " + distance);
        }
    }

    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может плыть больше чем 10 метров :(");
        } else {
            System.out.println(name + " проплыл " + distance);
        }
    }
}
