package pkgCore;

import java.util.Scanner;
import java.lang.Math;

public class carPayment {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Total Prive of Car: ");
		double totalPrice = input.nextDouble();
		
		System.out.print("Enter Down Payment: ");
		double downPay = input.nextDouble();
		
		System.out.print("Enter Loan Length: ");
		double loanLength = input.nextDouble();
		
		System.out.print("Loan Interest Rate: ");
		double loanInterest = input.nextDouble();
		
		input.close();	
		
		monthlyPay(totalPrice, downPay, loanLength, loanInterest);
		totalInterest(totalPrice, downPay, loanLength, loanInterest);


	}
	
	

	public static double  monthlyPay(double totalPrice, double downPay, double loanLength, double loanInterest){
		double monthlyPay = (loanInterest/12 * (totalPrice - downPay))
				/(1- Math.pow((1+loanInterest/12), -loanLength));
		
		monthlyPay = Math.floor(monthlyPay * 100) / 100;
		//System.out.println("Monthly Payment: " + monthlyPay);
		return monthlyPay;
	}
	
	public static double  totalInterest(double totalPrice, double downPay, double loanLength, double loanInterest){
		double monthlyPay = (loanInterest/12 * (totalPrice - downPay))
				/(1- Math.pow((1+loanInterest/12), -loanLength));
		
		double totalCost = monthlyPay * loanLength;
		double totalInterest = totalCost - (totalPrice - downPay);
		
		totalInterest = Math.floor(totalInterest * 100) / 100;
		//System.out.println("Total Interested Paid: " + totalInterest);
		
		return totalInterest;
		
		
		
	}


}
