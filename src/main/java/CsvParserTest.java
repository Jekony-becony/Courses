import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.UniqueHashCode;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvParserTest {

    public static void main(String[] args) throws IOException {

        List<AppData> appDataList = new ArrayList<>();
            ICsvBeanReader csvBeanReader = new CsvBeanReader(new FileReader("test.csv"), CsvPreference.EXCEL_NORTH_EUROPE_PREFERENCE);

        // указываем как будем мапить
        String[] header = new String[]{"Value1","Value2","Value3"};
        String[] mapping = new String[]{"header","data"};
        int[][] data = new int[][]{{1,2,3},{2,3,1},{3,2,1}};
        // получаем обработчики
        CellProcessor[] procs = getProcessors();
        AppData appData;
        // обходим весь csv файлик до конца
        while ((appData = csvBeanReader.read(AppData.class, mapping,procs)) != null) {
            appDataList.add(appData);
        }
        System.out.println(appDataList);
        csvBeanReader.close();
    }

    /**
     * Задаем обработчики ячеек
     */
    private static CellProcessor[] getProcessors() {
        return new CellProcessor[]{
                new NotNull(),
                new NotNull(),

        };
    }
}