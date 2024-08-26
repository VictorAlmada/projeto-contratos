package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Contract {
	// attributes
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	@Setter(AccessLevel.NONE)
	private List<Installment> instalments = new ArrayList<Installment>();
	
	// constructor
	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
}
