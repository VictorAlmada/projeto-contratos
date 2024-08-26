package services;

public interface OnlinePaymentService {
	// methods
	double paymentFee(double amount);
	double interest(double amount, int months);
	
}
