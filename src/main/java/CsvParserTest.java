import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CsvParserTest {

    public static void main(String[] args) throws IOException {
        List<List<Integer>> rows = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(2, 1, 3));
        FileWriter csvWriter = new FileWriter("test.csv");
        String[] stringsArray = new String[]{"Value1", "Value2", "Value3"};
        for (String string : stringsArray) {
            csvWriter.append(string).append(";");
        }
        csvWriter.append("\n");
        for (Integer rowData : rows.get(0)) {
            csvWriter.append(String.valueOf(rowData) + ";");
        }
        csvWriter.append("\n");
        for (Integer rowData : rows.get(1)) {
            csvWriter.append(String.valueOf(rowData) + ";");
        }
        csvWriter.append("\n");
        csvWriter.flush();
        csvWriter.close();
        BufferedReader csvReader = new BufferedReader(new FileReader("test.csv"));
        String[] row = csvReader.readLine().split(";");
        AppData appdata = new AppData();
        appdata.setHeader(row);
        int[] intRow = stringToInt(csvReader.readLine().split(";"));
        int[] intRow2 = stringToInt(csvReader.readLine().split(";"));
        int[][] data = new int[][]{intRow, intRow2};
        appdata.setData(data);
        System.out.println(appdata.toString());
        AppData appDataExample = new AppData(row, data);
        save(appDataExample);
        csvReader.close();
    }

    public static int[] stringToInt(String[] stringArray) {
        int[] intArray = new int[stringArray.length];
        int k;
        for (int i = 0; i < stringArray.length; i++) {
            k = Integer.parseInt(stringArray[i]);
            intArray[i] = k;
        }
        return intArray;
    }

    // что бы проверить работоспособность метода надо изменить k в 49 строчке на условный 0 и сравнить вывод с csv файлом
    public static void save(AppData data) throws IOException {
        System.out.println(" ");
        String[] stringsArray = data.getHeader();
        FileWriter csvWriter = new FileWriter("test.csv");
        int[][] rows = data.getData();
        for (String string : stringsArray) {
            csvWriter.append(string).append(";");
        }
        csvWriter.append("\n");
        for (Integer rowData : rows[0]) {
            csvWriter.append(String.valueOf(rowData) + ";");
        }
        csvWriter.append("\n");
        for (Integer rowData : rows[1]) {
            csvWriter.append(String.valueOf(rowData) + ";");
        }
        csvWriter.flush();
        csvWriter.close();
        System.out.println("Successfully saved!");
    }

}