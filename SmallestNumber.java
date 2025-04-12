package guvi.assignment;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt(); 

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt(); 

        System.out.print("Enter third number (c): ");
        int c = sc.nextInt(); 

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("Smallest number is: " + smallest);

        sc.close(); 
    }
}
