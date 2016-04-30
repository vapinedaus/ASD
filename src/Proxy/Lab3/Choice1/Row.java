package Proxy.Lab3.Choice1;

public class Row implements IRow {

	private String valueFName;
	private String valueLName;
	
	public Row (String valueFName, String valueLName)
	{
		this.valueFName = valueFName;
		this.valueLName = valueLName;
	}
	
	
	@Override
	public String toString() {
		return "FIRSTNAME: " + valueFName + " SURNAME: " + valueLName ;
	}


	@Override
	public String getValueFName() {
		// TODO Auto-generated method stub
		return valueFName;
	}

	@Override
	public String getValueLName() {
		// TODO Auto-generated method stub
		return valueLName;
	}

}
