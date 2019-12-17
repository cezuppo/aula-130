package entities;

public abstract class TaxPayer {

	private String name;
	private Double annualIncome;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract double tax();
}
