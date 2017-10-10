package assign3_Jobsen_Fatic;

public class Director extends Manager {

	private double benefit;
	private String department;
	private static final double TAX_FOR_LOW_BENEFIT = 0.1;
	private static final double TAX_FOR_MID_BENEFIT = 0.2;
	private static final double TAX_FOR_HIGH_BENEFIT = 0.4;

	private static final double GROSS_FOR_LOW_BENEFIT = 30000;
	private static final double GROSS_FOR_HIGH_BENEFIT = 50000;
	private final String END_OF_LINE = System.lineSeparator();

	public Director(String id, String name, double grossSalary, String degree, double benefit, String department) {
		super(id, name, grossSalary, degree);
		
		this.benefit = benefit;
		this.department = department;
	}

	public double getBenefit() {
		return benefit;
	}

	public void setBenefit(double benefit) {
		this.benefit = benefit;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double getGrossSalary() {

		return super.getGrossSalary() + benefit;
	}

	@Override
	public double netSalary() {

		if (this.getGrossSalary() < GROSS_FOR_LOW_BENEFIT) {

			return this.getGrossSalary() - (this.getGrossSalary() * TAX_FOR_LOW_BENEFIT);

		} else if (this.getGrossSalary() > GROSS_FOR_LOW_BENEFIT && this.getGrossSalary() < GROSS_FOR_HIGH_BENEFIT) {

			return this.getGrossSalary() - (this.getGrossSalary() * TAX_FOR_MID_BENEFIT);

		}

		else if (this.getGrossSalary() > GROSS_FOR_HIGH_BENEFIT) {

			return this.getGrossSalary() - (GROSS_FOR_LOW_BENEFIT * TAX_FOR_MID_BENEFIT)
					- ((this.getGrossSalary() - GROSS_FOR_LOW_BENEFIT) * TAX_FOR_HIGH_BENEFIT);
		}

		else
			return super.netSalary();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
