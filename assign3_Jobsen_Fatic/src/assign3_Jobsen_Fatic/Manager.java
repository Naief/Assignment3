package assign3_Jobsen_Fatic;

public class Manager extends Employee {

	private String degree;
	private Degree deg;
	private final String END_OF_LINE = System.lineSeparator();
	private final double BACHELORSBONUS = 0.1;
	private final double MASTERSBONUS = 0.2;
	private final double DOCTORATEBONUS = 0.35;

	public Manager(String id, String name, double grossSalary, String degree) {
		super(id, name, grossSalary);

		this.degree = degree;
		this.deg = new Degree();			//TODO ASK WHAT IS WRONG HERE 
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		if (this.degree.equals(deg.getBachelor()) ||
			this.degree.equals(deg.getMasters())  ||
			this.degree.equals(deg.getPhD())) 
		{
			this.degree = degree;
		}
		else {
			System.out.println("Invalid degree entry" + END_OF_LINE);
		}
	}
	
	@Override
	public double getGrossSalary() { // Overriding to get the grossSalary. //How would it make sense for a Constant

		if (this.degree.equals(deg.getBachelor())) {
			return super.getGrossSalary() + (super.getGrossSalary() * BACHELORSBONUS); // since it is a bonus, we add
																						// the original Salary + the
																						// bonus.
		}

		else if (this.degree.equals(deg.getMasters())) {
			return super.getGrossSalary() + (super.getGrossSalary() * MASTERSBONUS);
		}

		else if (this.degree.equals(deg.getPhD())) {
			return super.getGrossSalary() + (super.getGrossSalary() * DOCTORATEBONUS);
		}

		else {
			return this.getGrossSalary();
		}
	}

}
