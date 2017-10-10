package assign3_Jobsen_Fatic;

public class Intern extends Employee {
	private int gpa; 
	private double internBenefit = 1000;
	
	
	public Intern( String id, String name, double grossSalary, int gpa, double internBenefit) {
		super(id, name, grossSalary);
	
		this.gpa = gpa;
		this.internBenefit = internBenefit;
		
	}
	
	public int getGpa() {

		if (gpa <= 5) {

			return 0;

		}

		else if (gpa > 5 || gpa < 8) { // how to return a gross salary if there is no gross salary overridden.

			return (int) getGrossSalary(); // TODO Ask if the cast matters here
		}

		else if (gpa >= 8) {

			return (int) (getGrossSalary() + internBenefit); // TODO Ask if the cast matters here

		} else
			return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	

	
	public double getInternBenefit() {
		return internBenefit;
	}

	
	public void setInternBenefit(double internBenefit) {
		this.internBenefit = internBenefit;
	}

	@Override
	public double getGrossSalary() {

		return this.getGrossSalary();
	}

	@Override
	public double netSalary() {
		return this.getGrossSalary(); // ASK IF THIS IS CORRECT the net salary returned by a student will be the same
										// as his/her gross salary.

	}
}
