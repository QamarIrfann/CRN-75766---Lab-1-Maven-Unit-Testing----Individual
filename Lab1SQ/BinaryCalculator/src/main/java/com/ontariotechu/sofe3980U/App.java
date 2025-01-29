package com.ontariotechu.sofe3980U;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first binary number: ");
        Binary binary1 = new Binary(scanner.next());
        
        System.out.print("Enter second binary number: ");
        Binary binary2 = new Binary(scanner.next());
        
        System.out.println("First binary number: " + binary1.getValue());
        System.out.println("Second binary number: " + binary2.getValue());
        
        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Sum: " + sum.getValue());
        
        Binary orResult = binary1.or(binary2);
        System.out.println("OR result: " + orResult.getValue());
        
        Binary andResult = binary1.and(binary2);
        System.out.println("AND result: " + andResult.getValue());
        
        Binary multiplyResult = binary1.multiply(binary2);
        System.out.println("Multiplication result: " + multiplyResult.getValue());
        
        scanner.close();
    }
}
