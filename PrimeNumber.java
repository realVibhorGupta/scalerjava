import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int a = 1 , i ;
        Scanner scanner = new Scanner(System.in);
        a= scanner.nextInt();
        if (a % 2 == 0){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is  prime ");
        }
    }
}
