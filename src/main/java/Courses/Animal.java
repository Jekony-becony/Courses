package Courses;

abstract public class Animal {
    protected String name;
    protected int age;
    protected String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println(name + " " + age + " " + color);
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м");

    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м");
    }

}
