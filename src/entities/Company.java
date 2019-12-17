package entities;

public class Company extends TaxPayer{

	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double tax() {

		if (numberOfEmployees <= 10) {
			return super.getAnnualIncome() * 0.16;
		}else {
			return super.getAnnualIncome() * 0.14;
		}
	}
}
