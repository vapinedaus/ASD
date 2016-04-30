package ChainOfResponsibility.Lab7;

import ChainOfResponsibility.Lab7.RequestClasses.CallRecord;

public class DataWasherHandler extends ACallRecordHandler {

	@Override
	public void handleRequest(CallRecord req) {
		
		// do some analysis
		req.setIsASalesLead(true);
		
		//required
		if ( nextInChain != null )
			nextInChain.handleRequest(req);
		
		
	}

}
