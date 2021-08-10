package Courses;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int age, String color) {
        super(name, age, color);
        count++;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("��������� ������ ���� ������ 0!");
        } else if (distance > 500) {
            System.out.println(name + " �� ����� ������ ������ ��� 500 ������ :(");
        } else {
            System.out.println(name + " �������� " + distance + " �.");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("��������� ������ ���� ������ 0!");
        } else if (distance > 10) {
            System.out.println(name + " �� ����� ����� ������ ��� 10 ������ :(");
        } else {
            System.out.println(name + " ������� " + distance + " �.");
        }
    }
}
