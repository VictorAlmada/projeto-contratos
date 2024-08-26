package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	// attributes
	private OnlinePaymentService onlinePaymentService;

	// constructor
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	// methods
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}

}
