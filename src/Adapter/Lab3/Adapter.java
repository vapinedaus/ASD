package Adapter.Lab3;

public class Adapter implements ITargetStack,ITargetQueue {
	//association 
	private Adaptee adaptee;
	
	//constructor
	public Adapter ()
	{
		adaptee = new Adaptee();
	}

	@Override
	public void push(String str) {
		adaptee.add(str);
	}

	@Override
	public String pop() {
		int end = adaptee.getEnd();
		String str = adaptee.get(end);
		adaptee.remove(end);
		return str;
	}

	@Override
	public boolean isEmpty() {
		return adaptee.empty();
	}

	@Override
	public boolean offer(String str) {
		try 
		{ adaptee.add(str);
		  return true;
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public String poll() {
		int start = adaptee.getStart();
		String str = adaptee.get(start);
		adaptee.remove(start);
		return str;
	}
}
