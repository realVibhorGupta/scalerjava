import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        int a, i;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        for (int j = 2; j < a; j++) {
            if (a % j == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Number is  prime ");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
