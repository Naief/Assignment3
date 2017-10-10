package assign3_Jobsen_Fatic;

public class Employee implements Comparable <Employee> {

	private String id;
	private String name;
	private double grossSalary;
	private final String END_OF_LINE = System.lineSeparator();
	private final double TAX = 0.1;
	
	public Employee(String id, String name, double grossSalary ) {
		
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double netSalary() {
		
		return  this.grossSalary - (this.grossSalary * TAX);
	}
	

	public String getId() {
		return id;
	}

	@Override
	public String toString() { // two employees are equal if they have the same ID. (Task 1)
		return name + "'s " + " gross salary is of " + grossSalary + "SEK per month. ";

	}

	public String toString1() { // array List ToString

		String listOfEmployees = "ID: " + this.id + END_OF_LINE;
		listOfEmployees += "Name: " + this.name + END_OF_LINE;
		listOfEmployees += "Gross Salary: " + this.grossSalary + END_OF_LINE;
		listOfEmployees += "Net salary: " + this.netSalary() + END_OF_LINE; // ASK IF THIS IS CORRECT...

		return listOfEmployees;

	}
	
	public int compareTo(Employee other) {				// Compare the names, higher alphabetical order, lower alphabetical order, and if they're equal.

		if (this.name.compareTo(other.name) == 0) {
			
			if (this.grossSalary > other.grossSalary) { 
					return 1;
			}
			else if (this.grossSalary == other.grossSalary) { 
					return 0; 
				}
			else { 
					return -1; // if it is less
					}
	}						
			
		else {
			return this.name.compareTo(other.name);
		}
	}
						
	
			
	

	
	@Override
	public int hashCode() { //understand what is this importance of this
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {  //understand what is this importance of this
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
