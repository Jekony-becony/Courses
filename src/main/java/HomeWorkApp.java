class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class MyArrayDataException extends CustomException {
    MyArrayDataException(int row, int col) {
        super(String.format("Invalid data is in the cell [%d, %d]\n", row, col));
    }
}

class MyArraySizeException extends CustomException {
    MyArraySizeException() {
        super("Massive need to be [4 x 4]\n");
    }
}

public class HomeWorkApp {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"4", "2", "9", "1"},
                {"1", "6", "0", "4"},
                {"2", "1", "6", "2"},
                {"1", "8", "7", "3"}
        };
        String[][] wrongSizeMatrix = {
                {"5", "2", "5", "3"},
                {"6", "6", "4", "5"},
                {"3", "9", "7", "4"},
                {"1", "2"}
        };
        String[][] wrongCharMatrix = {
                {"7", "9", "2", "3"},
                {"6", "5", "8", "9"},
                {"5", "X", "5", "6"},
                {"3", "9", "7", "5"}
        };
        System.out.println("Matrix ¹1: ");
        showArray(correctMatrix);
        System.out.println("Matrix ¹2: ");
        showArray(wrongSizeMatrix);
        System.out.println("Matrix ¹3: ");
        showArray(wrongCharMatrix);
        try {
            System.out.println("Variant 1:");
            System.out.println("Sum: " + Converter.strConverter(correctMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Variant 2:");
            System.out.println("Sum: " + Converter.strConverter(wrongSizeMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Variant 3:");
            System.out.println("Sum: " + Converter.strConverter(wrongCharMatrix) + ".\n");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void showArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}

class Converter {
    static int strConverter(String[][] strArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (strArray.length != 4) throw new MyArraySizeException();
        for (int i = 0; i < strArray.length; i++) {
            if (4 != strArray[i].length) throw new MyArraySizeException();
            for (int k = 0; k < strArray[i].length; k++) {
                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }
}
