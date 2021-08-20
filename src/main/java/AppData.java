public class AppData {
    private String[]gi;
    private int[][]data;
    public AppData(){
    }
    public AppData(String[]header,int[][]data){
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
}
