package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgCore.carPayment;

class CarPaymentTest {

	@Test
	void test() {
		for (double totalPrice = 30000; totalPrice < 50000; totalPrice += 10) {
			
			for(double loanLength = 12; loanLength < 36; loanLength += 6) {
				
				for(double loanInterest = 0.05; loanInterest < 0.20; loanInterest += 0.05) {
					
					double downPay = 0;
					carPayment d = new carPayment();
					
					if(d.monthlyPay(totalPrice, downPay, loanLength, loanInterest)  < 899) {
						
						fail("Monthly Rate Low Value Exceeded");
						break;
					}
					
					if(d.monthlyPay(totalPrice, downPay, loanLength, loanInterest) > 4632) {
						fail("Monthly Rate High Value Exceeded");
						break;		
					
					}
					
					if(d.totalInterest(totalPrice, downPay, loanLength, loanInterest) < 818) {
						
						fail("Paid Interest Low Value Exceeded");
						break;
					}
					
					if(d.totalInterest(totalPrice, downPay, loanLength, loanInterest) > 16895) {
						fail("Paid Interest High Value Exceeded");
						break;		
					
					}
				}
			}
		}
	}
}

