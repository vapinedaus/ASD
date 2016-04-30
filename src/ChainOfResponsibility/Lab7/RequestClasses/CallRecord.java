package ChainOfResponsibility.Lab7.RequestClasses;

public class CallRecord {
	private Customer customer;
    private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isASalesLead;
	
	public CallRecord(Customer customer,Agent agent, String requestInformation)
	{
		this.customer = customer;
		this.agent=agent;
		this.requestInformation= requestInformation;

	}
	
	
	public Customer getCustomer() {
		return customer;
	}


	public Agent getAgent() {
		return agent;
	}


	public String getRequestInformation() {
		return requestInformation;
	}

	
	public void setIsValid(boolean isValid)
	{
		this.isValid= isValid;
	}
	
	public boolean getIsValid()
	{
		return isValid;
	}
	
	public void setIsASalesLead(boolean isASalesLead)
	{
		this.isASalesLead= isASalesLead;
	}
	
	public boolean getIsASalesLead()
	{
		return isASalesLead;
	}
	
	@Override
	public String toString() {
		return "*****CallRecord*****\n" + customer  + agent + "RequestInformation:" + requestInformation
				+ "\n isValid:" + isValid + "\n isASalesLead:" + isASalesLead + "\n";
	}

	
	
	
}
