package employee;

public class Employee {
	private String name;
	private String surname;
	private Address address;
	private String role;
	private int ID;
	private int age;
	private String sex;
	
	public Employee(String name, String surname, String sex, int age, Address address, String role, int ID){
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.age = age;
		this.address = address;
		this.role = role;
		this.ID = ID;
	}
	//getters
	public String getName(){
		return name;		
	}
	public String getSurname(){
		return surname;
	}
	public String getSex(){
		return sex;
	}
	public int getAge(){
		return age;
	}
	public Address getAddress(){
		return address;
	}
	public String getRole(){
		return role;
	}
	public int getID(){
		return ID;
	}
	@Override
	public String toString(){//needs this otherwise prints the hashcode
		return String.format("\nName: %s,\nsurname: %s,\nage: %d, \nsex: %s,\naddress details: %s ", getName(), getSurname(), getAge(), getSex(), address.toString());
	}
}
