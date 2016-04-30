package ChainOfResponsibility.Lab7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import ChainOfResponsibility.Lab7.RequestClasses.CallRecord;

public class ValidatorHandler extends ACallRecordHandler {

	@Override
	public void handleRequest(CallRecord req) {
		
		Pattern pattern = Pattern.compile("^.+@.+\\..+$");
		Matcher emailMatcher = pattern.matcher(req.getCustomer().getEmail());
		pattern = Pattern.compile("\\d{10}");
		Matcher phoneMatcher = pattern.matcher(req.getCustomer().getPhone());

		//NOT MATCH 
		if (!emailMatcher.matches() || !phoneMatcher.matches() || !req.getCustomer().getAddress().getState().toUpperCase().equals("IOWA"))
		{
			req.setIsValid(false);
			database.inValidRecordList.add(req);
		}
		else
		{
			req.setIsValid(true);
			
			//required
			if ( nextInChain != null )
				nextInChain.handleRequest(req);
		}
		
	}

}
