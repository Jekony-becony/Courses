package Courses;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food amount: " + food);
    }

    public boolean decreaseFood(int amount) {
        if (food - amount >= 0) {
            food -= amount;
            return true;
        } else {
            System.out.println("� ������� ������������ ���");
            return false;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        } else {
            System.out.println("���������� ��� ������ ���� ������ 0");
        }

    }
}
