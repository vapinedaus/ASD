package Factory.Lab5;

public class Client {

	public static void main(String[] args) {
		ATraceFactory factory = TraceFactory.getfactory();
		ITrace consoleTrace= factory.createTrace("console");
		
		consoleTrace.setDebug(true);
		consoleTrace.debug("The console trace is debugging!");
		consoleTrace.error("The console trace throws an exception error");
		
		ITrace fileTrace= factory.createTrace("trace.log");
		
		fileTrace.setDebug(true);
		fileTrace.debug("The fileTrace trace is debugging!");
		fileTrace.error("The fileTrace trace throws an exception error");

	}

}
