import java.util.Scanner;

public class Vowel {
    public static void main(StringClass[] args) {
        Scanner scanner = new Scanner(System.in);
        char vowel = scanner.next().charAt(0);

        switch (vowel) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println("character is a vowel");
            default -> System.out.println("Character " + vowel + " iis a consonent");
        }
    }
}
