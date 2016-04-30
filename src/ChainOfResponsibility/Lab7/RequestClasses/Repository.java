package ChainOfResponsibility.Lab7.RequestClasses;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	public List<CallRecord> inValidRecordList = new ArrayList<CallRecord>();
	
	public static ArrayList<CallRecord> getCallRecords()
	{
		Address address = new Address("1000 N","Fairfield","IOWA","52557");
		Agent agent = new Agent("111",address );
		Customer customer1 = new Customer("Victor","Pineda", address,"6414513113","vap@yahoo.com");
		Customer customer2 = new Customer("Alice","Pineda", address,"6414513113","me@yahoo");
		Customer customer3 = new Customer("Jenny","Hubac", address,"6414513112","jen@yahoo.com");
		Customer customer4 = new Customer("Andres","Fer", address,"5555","vap@yahoo.com");
		
		CallRecord callRecord1 = new CallRecord( customer1, agent, "N/A");
		CallRecord callRecord2 = new CallRecord( customer2, agent, "N/A");
		CallRecord callRecord3= new CallRecord( customer3, agent, "N/A");
		CallRecord callRecord4 = new CallRecord( customer4, agent, "N/A");
		
		ArrayList<CallRecord> Records = new ArrayList<CallRecord>();
		Records.add(callRecord1);
		Records.add(callRecord2);
		Records.add(callRecord3);
		Records.add(callRecord4);
		
		
		return Records;
	}


}
