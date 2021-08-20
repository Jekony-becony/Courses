import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData() {
    }

    public AppData(String[] header, int[][] data) {
        this.data = data;
        this.header = header;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public String toString() {
        return Arrays.toString(header) + "\n" + Arrays.toString(data[0]) + "\n" + Arrays.toString(data[1]);
    }
}
