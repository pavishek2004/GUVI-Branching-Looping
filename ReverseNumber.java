package guvi.assignment;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt(); // Read input from user
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;      
            reversed = reversed * 10 + digit; 
            num = num / 10;             
        }

        System.out.println("Reversed number: " + reversed);
        sc.close(); // Close the Scanner
    }
}
