package Factory.Lab5;

public class FileTrace implements ITrace {

	@Override
	public void setDebug(boolean debug) {
		if (debug == true) {
			System.out.println("FileTrace is on");
		} else {
			System.out.println("FileTrace is off");
		}
		
	}

	@Override
	public void debug(String message) {
		System.out.println("FileTrace: " + message);
		
	}

	@Override
	public void error(String message) {
		System.out.println("FileTrace: " + message);
		
	}

}
