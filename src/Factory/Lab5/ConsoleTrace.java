package Factory.Lab5;

public class ConsoleTrace implements ITrace {

	@Override
	public void setDebug(boolean debug) {

		if (debug == true) {
			System.out.println("ConsoleTrace is on");
		} else {
			System.out.println("ConsoleTrace is off");
		}

	}

	@Override
	public void debug(String message) {
		System.out.println("ConsoleTrace: " + message);

	}

	@Override
	public void error(String message) {
		System.out.println("ConsoleTrace: " + message);

	}

}
