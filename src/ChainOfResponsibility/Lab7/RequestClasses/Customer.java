package ChainOfResponsibility.Lab7.RequestClasses;

public class Customer {
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;
	


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Customer(String firstName,String lastName,Address address,String phone,String email)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.phone=phone;
		this.email=email;
	}
	
	
	@Override
	public String toString() {
		return "Customer: \n FirstName=" + firstName + "\n lastName=" + lastName + "\n" + address + "\n phone="
				+ phone + "\n email=" + email + "\n";
	}
	
}
