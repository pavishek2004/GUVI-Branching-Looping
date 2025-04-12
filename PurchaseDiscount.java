package guvi.assignment;

import java.util.Scanner;

public class PurchaseDiscount {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the purchase amount: ");
	        double purchaseAmount = sc.nextDouble();
	        double finalAmount =  purchaseAmount;

	        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
	            finalAmount = purchaseAmount - (purchaseAmount * 0.10);
	        } else if (purchaseAmount > 1000) {
	            finalAmount = purchaseAmount - (purchaseAmount * 0.20);
	        }

	        System.out.println("Final payable amount: " + finalAmount);

	        sc.close();
	    }
	}

