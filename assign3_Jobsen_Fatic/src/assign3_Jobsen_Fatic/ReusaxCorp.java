package assign3_Jobsen_Fatic;

import java.util.*;


public class ReusaxCorp {

	private String HumanResources;
	private String Technical;
	private String Business;
	private List<Employee> array = new ArrayList<>(); // array list that goes through the Class Employee

	public ReusaxCorp() {

	}

	public void registerEmployee(String id, String name, double grossSalary) { // void instead of the class

		if (id.equals(null)) { // check if the ID doesn't equal null
			return;
		}
		for (Employee emp : array) { // a for loop that goes through arrayList
			if (id.equals(emp.getId())) { // checks and compares if the IDs are equal
				return;
			}
			Employee newEmployee = new Employee(id, name, grossSalary);
			array.add(newEmployee);
		}
	}

	public void removeEmployee(String id, String name, double grossSalary) {

		for (Employee emp : array) { // a for loop that goes through arrayList
			if (id.equals(emp.getId())) { // checks and compares if the IDs are equal
				if (id != null) { // check and compares if the ID doesn't equal to null

				}
			}
		}
		// all you need is to do a .remove in the main to remove an element
		// TA told me to do this here
	}

	public Employee retrieveEmployee(String id) { // the return should stay

		for (int i = 0; i < this.array.size(); i++) {
			if (array.get(i).getId() == id) { // if the arrayList isn't empty, [then?... (ASK) the answer is
												// that you return it] -------> // If it is empty then return
												// what is asked in task 2.
				return array.get(i);
			}
		}
		return null;
	}

	public void updateEmployeeName(String employeeID, String name) {

		for (int i = 0; i < this.array.size(); i++) {
			if (array.get(i).getId() != null && array.get(i).getName() != null) { // an if statement that checks whether
																					// if the ID doesn't equal to null
																					// AND if the name doesn't equal to
																					// null.

				this.retrieveEmployee(employeeID).setName(employeeID); // Since the Employee is already retrieved,
																		// change his name through his ID. This is done
																		// by using a setter for the name.
			}
		}
	}

	public void updateEmployeeGrossSalary(String employeeID, double grossSalary) {
		for (int i = 0; i < this.array.size(); i++) { // a for loop that goes through the arrayList
			if (array.get(i).getId() != null && array.get(i).getGrossSalary() < 0) { // an if statement that checks
																						// whether if the ID doesn't
																						// equal to null AND it checks
																						// if the amount is a negative
																						// value
				this.retrieveEmployee(employeeID).setGrossSalary(grossSalary);
			}
		}
	}
	
	public void sortEmployees(Employee other) {

		Collections.sort(array); // sorting the array

	}
	
	//... MANAGER ......................................................................................................................

	public void registerManager(String id, String name, double grossSalary, String degree) {

		if (id.equals(null)) { // check if the ID doesn't equal null
			return;
		}
		for (Employee manager : array) { // a for loop that goes through arrayList
			if (id.equals(manager.getId())) { // checks and compares if the IDs are equal
				return;
			}
			
			Manager newManager = new Manager(id, name, grossSalary, degree);
			array.add(newManager);
		}
	}
	
	public Manager retrieveManager(String id, String degree) { // the return should stay

		for (int i = 0; i < this.array.size(); i++) {
			if (array.get(i).getId() == id) { // if the arrayList isn't empty, [then?... (ASK) the answer is
														// that you return it] -------> // If it is empty then return
														// what is asked in task 2.
				return  (Manager) array.get(i);
			}
		}
		return null;
	}
	
	public void removeManager(String id, String name, double grossSalary, String degree) {

		for (Employee manager : array) { // a for loop that goes through arrayList
			if (id.equals(manager.getId())) { // checks and compares if the IDs are equal
				if (id != null) { // check and compares if the ID doesn't equal to null
				}
			}
		}
		// all you need is to do a .remove in the main to remove an element
		// TA told me to do this here
	}

	//......................................................................................................................................

	public void registerDirector(String id, String name, double grossSalary, String degree, double benefit, String department) {

		if (id.equals(null)) { // check if the ID doesn't equal null
			return;
		}
		for (Employee director : array) { // a for loop that goes through arrayList

			if (id.equals(director.getId())) { // checks and compares if the IDs are equal
				return;
			}
			if (HumanResources.equals(department) || // checks if the director is leading a department or not
					Technical.equals(department)  ||
					Business.equals(department) ) {		
			}
				
			Director newDirector = new Director(id, name, grossSalary, degree, benefit, department);
				array.add(newDirector);
		
		}
	}
	
	
	public Director retrieveDirector(String id, String degree, String department) { // the return should stay

		for (int i = 0; i < this.array.size(); i++) {

			if (array.get(i).getId() == id) { // if the arrayList isn't empty, [then?... (ASK) the answer is
														// that you return it] -------> // If it is empty then return
														// what is asked in task 2.
			return (Director) array.get(i);
			}
		}
		return null;
	}
	
	public void updateDirectorBenefit(double benefit) { // functionality to update the benefit of the director
		
		for (Employee emp : array) {
			if (emp instanceof Director)
				((Director) emp).setBenefit(benefit); // update the benefit
		}
	}	
	
	public void removeDirector(String id, String name, double grossSalary, String degree, double benefit, String department) {

		for (Employee director : array) { // a for loop that goes through arrayList

			if (id.equals(director.getId())) { // checks and compares if the IDs are equal

				if (id != null) { // check and compares if the ID doesn't equal to null
				}
			}
		}
		// all you need is to do a .remove in the main to remove an element
		// TA told me to do this here
	}
	//.....................................................................................................................................
	
	public void registerIntern(String id, String name, double grossSalary, int gpa, double internBenefit) {

		if (id.equals(null)) { // check if the ID doesn't equal null
			return;
		}
		for (Employee intern : array) { // a for loop that goes through arrayList

			if (id.equals(intern.getId())) { // checks and compares if the IDs are equal
				return;
			}
			Intern newIntern = new Intern(id, name, grossSalary, gpa, internBenefit);
			array.add(newIntern);
		}
	}

	public Intern retrieveIntern(String id, int gpa) { // the return should stay

		for (int i = 0; i < this.array.size(); i++) {
			if (array.get(i).getId() == id) { // if the arrayList isn't empty, [then?... (ASK) the answer is
														// that you return it] -------> // If it is empty then return
														// what is asked in task 2.
				return (Intern) array.get(i);
			}
		}
		return null;
	}
	
	public void removeIntern(String id, String name, double grossSalary, int gpa, double internBenefit) {

		for (Employee intern : array) { // a for loop that goes through arrayList

			if (id.equals(intern.getId())) { // checks and compares if the IDs are equal

				if (id != null) { // check and compares if the ID doesn't equal to null

				}
			}
		}
		// all you need is to do a .remove in the main to remove an element
		// TA told me to do this here
	}

	// ......................................................................................................................................

	public int getSize() {

		return array.size();

	}
	
						// P-R-O-M-O-T-I-O-N-S  B-E-L-O-W
	// ....................................................................................................................... 

	public void promoteToEmployee(String id) {
		String tempID = retrieveEmployee(id).getId();
		String tempEmpName = retrieveEmployee(id).getName();
		double tempGross = retrieveEmployee(id).getGrossSalary();
		removeEmployee(tempID, tempEmpName, tempGross);
		registerEmployee(tempID, tempEmpName, tempGross);
	}

	// ......................................................................................................................................

	public void promoteToIntern(String id, int gpa) {
		String tempID = retrieveIntern(id , gpa).getId();
		String tempName = retrieveIntern(id, gpa).getName();
		double tempGross = retrieveIntern(id, gpa).getGrossSalary();
		int tmpGPA = retrieveIntern(id, gpa).getGpa();
		double internBenefit = retrieveIntern(id, gpa).getInternBenefit();
		removeIntern(tempID, tempName, tempGross, tmpGPA, internBenefit);
		registerIntern(tempID, tempName, tempGross, tmpGPA, internBenefit);

	}
	
	// ......................................................................................................................................

	public void promoteToManager(String id, String degree) {
		String tempID = retrieveManager(id, degree).getName();
		String tempName = retrieveManager(id, degree).getId();
		double tempGross = retrieveManager(id, degree).getGrossSalary();
		String tempDegree = retrieveManager(id, degree).getDegree();
		removeManager(tempID, tempName, tempGross,tempDegree);
		registerManager(tempID, tempName, tempGross, tempDegree);
		
	}

	// ......................................................................................................................................

		public void promoteToDirector(String id, String degree , String department) {   // A director needs, id, degree and department
			
		String tempID = retrieveDirector(id, degree, department).getId();
		String tempName = retrieveDirector(id, degree, department).getName();
		double tempGross = retrieveDirector(id, degree, department).getGrossSalary();
		String tempDegree = retrieveDirector(id, degree, department).getDegree();
		double tempBenefit = retrieveDirector(id, degree, department).getBenefit();
		String tempDepartment= retrieveDirector(id, degree, department).getDepartment();
		removeDirector(tempID, tempName, tempGross,tempDegree, tempBenefit, tempDepartment);
		registerDirector(tempID, tempName, tempGross,tempDegree, tempBenefit, tempDepartment);


		}

}





