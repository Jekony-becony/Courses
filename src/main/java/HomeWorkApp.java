public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        CheckNumbers(10, 5);
        NegOrPosNumVoid(-5);
        NegOrPosNumBool(5);
        WriteLine("Hello", 5);
        IsYearLeap(121);
        int[] m = {1, 0, 1, 0, 1, 0, 1, 0, 1};
        EditArray(m);
        int[] m1 = new int[100];
        FillArray(m1);
        int[] m2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MultiplyArrayNumLessSix(m2);
        int[][] dm = new int[10][10];
        FillDiagonalsArray(dm);
        CreateArray(10,5);

    }

    public static void printThreeWords() {
        System.out.println("Orange!");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 1, b = 2;
        String result = ((a + b) >= 0) ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5, b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean CheckNumbers(int a, int b) {
        if (a + b <= 20 && a + b > 10) {
            return true;
        } else {
            return false;
        }
    }

    public static void NegOrPosNumVoid(int a) {
        if (a >= 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }

    public static boolean NegOrPosNumBool(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void WriteLine(String line, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(line);
        }
    }

    public static boolean IsYearLeap(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] EditArray(int[] m) {
        System.out.println("Before editing");
        ShowArray(m);
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0) {
                m[i] = 1;
            } else if (m[i] == 1) {
                m[i] = 0;
            }
        }
        System.out.println("After editing");
        ShowArray(m);
        return m;
    }

    public static void ShowArray(int[] m) {
        System.out.println("Massive:");
        for (int i = 0; i < m.length; i++) {
            System.out.print(" ");
            System.out.print(m[i]);
        }
        System.out.println("");
    }

    public static void FillArray(int[] m) {
        for (int i = 0; i < m.length; i++) {
            m[i] = i + 1;
        }
        ShowArray(m);
    }

    public static void MultiplyArrayNumLessSix(int[] m) {
        System.out.println("Before multiply: ");
        ShowArray(m);
        for (int i = 0; i < m.length; i++) {
            if (m[i] < 6) {
                m[i] = m[i] * 2;
            }
        }
        System.out.println("After multiply: ");
        ShowArray(m);
    }
    public static void FillDiagonalsArray(int[][] dm) {
        int k = dm.length-1;
        for (int i = 0; i < dm.length; i++) {
            for (int j = 0; j < dm.length; j++) {
                if (i == j) {
                    dm[i][j] = 1;
                } else if (j == k) {
                    dm[i][j] = 1;
                    k--;
                }
            }
        }
        ShowTwoDimArray(dm);
    }
    public static void ShowTwoDimArray(int[][]dm){
        System.out.println("Massive: ");
        for (int i = 0; i < dm.length; i++) {
            System.out.println("");
            for (int j = 0; j < dm.length; j++) {
                System.out.print(dm[i][j]);
                System.out.print(" ");
            }
        }
        System.out.println(" ");
    }
    public static int[] CreateArray(int len, int initialValue){
        int[] array = new int [len];
        for(int i=0;i<len;i++){
            array[i] = initialValue;
        }
        ShowArray(array);
        return array;
    }
}