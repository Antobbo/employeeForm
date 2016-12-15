package employee;

public class Address {
	private int streetNumber;
	private String streetName;
	private String postcode;
	
	public Address(int streetNumber, String streetName, String postcode){
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.postcode = postcode;
	}
	
	//getters
	public int getStreetNumber(){
		return streetNumber;		
	}
	public String getStreetName(){
		return streetName;
	}
	public String getPostcode(){
		return postcode;
	}
	@Override
	public String toString(){
		return String.format("\nStreet number: %d, \nStreet name: %s, \nPostcode: %s", getStreetNumber(), getStreetName(), getPostcode());
	}
}
