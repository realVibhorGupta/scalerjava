public class PrintSeriesTwo {
//1,2,6,24,120 limit x = 10
    public static void main(String[] args) {

        int a = 1 , b = 1;
        int x = 10;
        for (int i=1;i<x;i++){
            b = a*b;
            System.out.println(b);
            a++;
        }

    }
}
