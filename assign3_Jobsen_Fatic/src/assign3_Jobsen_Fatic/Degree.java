package assign3_Jobsen_Fatic;

public class Degree {

	private String bachelor;
	private String masters;
	private String phD;
	private double bonusOf;

	public Degree(String bachelor, String masters, String phD, double bonusOf) {
		

		this.bachelor = bachelor;
		this.masters = masters;
		this.phD = phD;
		this.bonusOf = bonusOf;
	}

	public Degree() {
		// TODO Auto-generated constructor stub
	}

	public String getBachelor() {
		return bachelor;
	}

	public String getMasters() {
		return masters;
	}

	public String getPhD() {
		return phD;
	}

	public double getBonusOf() {
		return bonusOf;
	}

	public void setBonusOf(double bonusOf) {
		this.bonusOf = bonusOf;
	}

}
