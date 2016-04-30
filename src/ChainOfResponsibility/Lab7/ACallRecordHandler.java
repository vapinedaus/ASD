package ChainOfResponsibility.Lab7;

import ChainOfResponsibility.Lab7.RequestClasses.CallRecord;
import ChainOfResponsibility.Lab7.RequestClasses.Repository;

public abstract class ACallRecordHandler {
	

	//set Next In Chain
	protected ACallRecordHandler nextInChain;
	abstract public void handleRequest(CallRecord req);
	
	//extra
	Repository database = new Repository();


}
