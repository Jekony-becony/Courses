import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        String[] array = new String[]{"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh"};
        System.out.println("Massive: ");
        showArray(array);
        swapElements(array);
        Apple apl = new Apple();
        Orange orange = new Orange();
        Box<Apple> boxApple = new Box<Apple>();
        Box<Orange> boxOrange = new Box<Orange>();
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxApple.addFruit(apl);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        System.out.println("��� ������� � ��������: " + boxApple.getWeight(apl));
        System.out.println("��� ������� � �����������: " + boxOrange.getWeight(orange));
        System.out.println("��������� ��������� �������: " + boxApple.compare(boxOrange));
        Box<Orange> boxOrange2 = new Box<Orange>();
        System.out.println("��� ������� �� ���������: ");
        System.out.println("1: " + boxOrange.getWeight(orange));
        System.out.println("2: " + boxOrange2.getWeight(orange));
        boxOrange.transfer(boxOrange2);
        System.out.println("��� ������� ����� ���������: ");
        System.out.println("1: " + boxOrange.getWeight(orange));
        System.out.println("2: " + boxOrange2.getWeight(orange));


    }

    public static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "]: " + array[i]);
        }
        System.out.println(" ");
    }

    public static String[] swapElements(String[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ����� ������ ������� ��������: ");
        int number = sc.nextInt();
        System.out.println("");
        System.out.print("������� ����� ������ ������� ��������: ");
        int number2 = sc.nextInt();
        System.out.println("");
        if (number == number2) {
            System.out.println("������� ���  ������ �����!");
        } else if (number > array.length || number2 > array.length) {
            System.out.println("����� ������� �� ������� �������");
        } else if (number < 0 || number2 < 0) {
            System.out.println("�������� �� ���� ���� ��������������!");
        } else {
            System.out.println("Before: ");
            showArray(array);
            String k = array[number];
            array[number] = array[number2];
            array[number2] = k;
            System.out.println("After: ");
            showArray(array);
        }
        return array;
    }
}