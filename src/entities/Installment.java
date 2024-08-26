package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Installment {
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatação do tipo de data
	
	// attributes
	private LocalDate date;
	private Double amount;
	
	// toString
	@Override
	public String toString() {
		return date.format(fmt) + " - R$ " + String.format("%.2f", amount);
	}
}
