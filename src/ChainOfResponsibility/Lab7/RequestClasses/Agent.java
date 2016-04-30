package ChainOfResponsibility.Lab7.RequestClasses;

public class Agent {
	public String getAgentId() {
		return agentId;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	private String agentId;
	private Address workLocation;
	
	public Agent(String agentId,Address workLocation)
	{
		this.agentId=agentId;
		this.workLocation=workLocation;	
	}

	@Override
	public String toString() {
		return "Agent: \n Agent Id:" + agentId + "\n Work Location:" + workLocation + "\n";
	}
	
	
}