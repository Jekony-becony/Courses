package Courses;

public class Cat extends Animal {
    private static int count;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int age, String color, int appetite, boolean satiety) {
        super(name, age, color);
        count++;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    @Override
    public void info() {
        System.out.println(name + " " + age + " " + color + " ������-" + appetite + " �������-" + satiety);
    }

    public int getCount() {
        return count;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.println("��������� ������ ���� ������ 0!");
        } else if (distance > 200) {
            System.out.println(name + " �� ����� ������ ������ ��� 200 ������ :(");
        } else {
            System.out.println(name + " �������� " + distance + " �.");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println("��������� ������ ���� ������ 0!");
        } else {
            System.out.println("������ �� ����� ������� :(");
        }

    }

    public void eat(Plate p) {
        boolean sucess = p.decreaseFood(appetite);
        if (sucess) {
            this.satiety = true;
            System.out.println(name + " �������!");
        } else
            System.out.println(name + " �� ������� :(");
    }
}
