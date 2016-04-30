package ChainOfResponsibility.Lab7;

import ChainOfResponsibility.Lab7.RequestClasses.CallRecord;

public class ReporterHandler extends ACallRecordHandler {

	@Override
	public void handleRequest(CallRecord req) {
		System.out.println(req.toString());
		
		//required
				if ( nextInChain != null )
					nextInChain.handleRequest(req);
		
	}

}
