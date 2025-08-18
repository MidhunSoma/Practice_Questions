package Abstraction;
import java.util.UUID;

abstract class Payment{
	UUID uuid;
	public abstract void initiatePayment();
	public abstract void verifyPayment();
	public void generateTransactionId() {
		uuid=UUID.randomUUID();
		System.out.println("Transaction Id: "+uuid);
	}
}
class CreditCardPayment extends Payment{
	public void initiatePayment() {
		System.out.println("Credit Card Payment Initiated");
	}
	public void verifyPayment() {
		System.out.println("Credit Card Payment Verified");
	}
}
class UPIPayment extends Payment{
	public void initiatePayment() {
		System.out.println("UPI Payment Initiated");
	}
	public void verifyPayment() {
		System.out.println("UPI Payment Verified");
	}
}
class NetBankingPayment extends Payment{
	public void initiatePayment() {
		System.out.println("Net Banking Payment Initiated");
	}
	public void verifyPayment() {
		System.out.println("Net Banking Payment Verified");
	}
}

public class Task1 {

	public static void main(String[] args) {
		
		        Payment[] payments = {new CreditCardPayment(),new UPIPayment(),new NetBankingPayment()};


		        for (Payment payment : payments) {
		            System.out.println("\nProcessing new payment:");
		            payment.initiatePayment();
		            payment.verifyPayment();
		            payment.generateTransactionId();
		        }
	}
}
	


