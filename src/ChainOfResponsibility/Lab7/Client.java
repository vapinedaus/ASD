package ChainOfResponsibility.Lab7;

import ChainOfResponsibility.Lab7.RequestClasses.CallRecord;
import ChainOfResponsibility.Lab7.RequestClasses.Repository;;

public class Client {

	public static void main(String[] args) {
		ACallRecordHandler chain = ChainBuilder();
		
		Repository database = new Repository();
		for (CallRecord cr : database.getCallRecords())
		{
			chain.handleRequest(cr);
		}
	
	}
	
	
	public static ACallRecordHandler ChainBuilder() {
		ACallRecordHandler validator = new ValidatorHandler();
		ACallRecordHandler datawasher = new DataWasherHandler();
		ACallRecordHandler reporter = new ReporterHandler();
		validator.nextInChain = datawasher;
		datawasher.nextInChain = reporter;
		return validator;
	}

}
