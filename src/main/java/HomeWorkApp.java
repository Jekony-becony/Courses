public class HomeWorkApp {
    public static void main(String[] args){
        System.out.println("Hello World!");
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange!");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign(){
        int a = 1,b = 2;
        String s = ((a + b) >= 0) ? "����� �������������" : "����� �������������";
        System.out.println(s);
    }
    public static void printColor(){
        int value =0;
        if (value<=0)
        {
            System.out.println("�������");
        }
        else if (0<value  && value<=100)
        {
            System.out.println("������");
        }
        else { System.out.println("�������"); }
    }
    public static void compareNumbers(){
        int a = 5,b = 10;
        if (a>=b){
            System.out.println("a >= b");
        }
        else{System.out.println("a < b");}
    }
}