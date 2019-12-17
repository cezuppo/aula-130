package entities;

public class Individual extends TaxPayer{

	private Double healthExpenditures;
	
	public Individual() {
		super();
		}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {

		if (super.getAnnualIncome() < 20000) {
			return super.getAnnualIncome() * 0.15 - healthExpenditures/2;
		}else {
			return super.getAnnualIncome() * 0.25 - healthExpenditures/2;
		}
	}
	}
