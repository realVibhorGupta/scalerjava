import java.util.Scanner;

public class LargestOfNNumbers {
    public static void main(StringClass[] args) {
        System.out.println("Enter the number of Elements");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int maxValue = Integer.MIN_VALUE;

        for(int i = 1 ; i <=n ; i++){
            int current = scanner.nextInt();
            maxValue = Math.max(maxValue,current);
        }
        System.out.println(maxValue);

    }
}
