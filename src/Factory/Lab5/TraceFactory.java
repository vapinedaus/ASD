package Factory.Lab5;

public class TraceFactory extends ATraceFactory {

	private static ATraceFactory factory= new TraceFactory();
	
	private TraceFactory(){}
	
	public static ATraceFactory getfactory()
	{
		return factory;
	}
	
	
	@Override
	public ITrace createTrace(String type) {
		 
		ITrace itrace= null;
		
		
		if (type.equals("console")) {
			itrace = new ConsoleTrace();
			} else if (type.equals("trace.log")) {
			itrace = new FileTrace();
			}
	  
		return itrace;

	}

	

}
