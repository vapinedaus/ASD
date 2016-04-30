package ChainOfResponsibility.Lab7.RequestClasses;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	
	
	public Address(String streetAddress,String city,String state,String zipcode)
	{
		this.streetAddress=streetAddress;
		this.city=city;
		this.state=state;
		this.zipcode=zipcode;
		
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getZipcode() {
		return zipcode;
	}


	@Override
	public String toString() {
		return "Address: \n Street Address:" + streetAddress + "\n City:" + city + "\n State:" + state + "\n Zipcode:"
				+ zipcode ;
	}
	
}
