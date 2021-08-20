import java.io.FileWriter;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


import au.com.bytecode.opencsv.CSVReader;
public class WritingCSVFileExample
{
    public static void main(String[] args) throws Exception
    {
        String csv = "test.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));
        //Create record
        String [] record = "Value1,Value2,Value3".split(";");
        String [] data = "1,2,3".split(";");
        String [] data1 = "2,1,3".split(";");
        //Write the record to file
        writer.writeNext(record);
        writer.writeNext(data);
        writer.writeNext(data1);
        //close the writer
        writer.close();
        writer.flush();
        read();
        add("7,8,9".split(";"));
        add("8,2,1".split(";"));

    }
    public static void read() throws IOException {
        CSVReader reader = new CSVReader(new FileReader("test.csv"), ';', '"', 0);
        //Read CSV line by line and use the string array as you want
        String[] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if (nextLine != null) {
                //Verifying the read data here
                System.out.println(Arrays.toString(nextLine));
            }
        }
    }
    public static void add(String[] data )throws IOException{
        String csv = "test.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv, true));
        String [] record = data;
        writer.writeNext(record);
        writer.close();
        System.out.println("");
        System.out.println("After adding 1 row:");
        read();
    }
}