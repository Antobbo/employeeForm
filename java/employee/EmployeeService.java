//this class contains the business logic.
package employee;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.ui.TextField;

public class EmployeeService {	
	List<Employee> employee = new ArrayList<Employee>();
	public void printTest(){
		
		System.out.println("Inside printTest()");
	}
	public void createNewEmployee(String name, String surname, String age, String sex, String role, String id, String streetNumber, String streetName, String postcode){
		//System.out.println("name: " + name + "\nsurname: " + surname + "\nage: " + age + " \nsex: " + sex + "\nrole: " + role + "\nid: " + id + "\nstreetNumber: " + streetNumber + "\nstreetName: " + streetName + "\npostcode: " + postcode );
		 Employee theEmployee = new Employee(name, surname, sex, Integer.parseInt(age), new Address(Integer.parseInt(streetNumber), streetName, postcode), role, Integer.parseInt(id));
		 employee.add(theEmployee);
		 for(Employee currentEmployee : employee ){
	        	System.out.println(employee);
	        }
		 System.out.println("size is " + employee.size());
	}
	public void clearTextFields(TextField name, TextField surname, TextField age, TextField sex, TextField role, TextField id, TextField streetNumber, TextField streetName, TextField postcode) {
		// TODO Auto-generated method stub
    	System.out.println("Cleared!");
    	name.clear();
    	surname.clear();
    	age.clear();
    	sex.clear();
    	role.clear();
    	id.clear();
    	streetNumber.clear();
    	streetName.clear();
    	postcode.clear();
	}
	public void validateOutput(String name, String surname, String age, String sex, String role, String id, String streetNumber, String streetName, String postcode) {
		// TODO Auto-generated method stub
		
	}
	
	
}
