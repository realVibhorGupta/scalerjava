import jdk.dynalink.Operation;
import jdk.jfr.Relational;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Vibhor");
        System.out.println("Vibhor");

//        variables  and data types
        char c = 'a';
        System.out.println(c);

        boolean bool = true;
        System.out.println(bool);
//
////        Strings in Java
//        String s  = "I hate Java";
//        System.out.println(s.charAt(4));
//
//        //Scanner class
//        Scanner scanner=new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(a);

//        Operations
        int v = 8;
        int b = 6;

//        Strings in Java
        String s  = "I hate Java";
        System.out.println(s.charAt(4));
//        Adition
        System.out.println(v+b);


//        sub
        System.out.println(v-b);
//        mul
        System.out.println(v*b);
        //div
        System.out.println(v/b);


//        Relational operators
        System.out.println(v == b);
        System.out.println(v != b);
        System.out.println(v <= b);
        System.out.println(v >= b);
        System.out.println(v > b);
        System.out.println(v < b);
    }
}
