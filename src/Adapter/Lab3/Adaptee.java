package Adapter.Lab3;

public class Adaptee {
	private String[] data;
	private int start;
	private int end;

	//constructor
	public Adaptee()
	{
		int Capacity =10;
		data = new String[Capacity];
	}
	
	public String startString() {
		return data[start];
	}

	public String endString() {
		return data[end];
	}

	public boolean empty() {
		return (end == -1);
	}

	public void add(String str) {
		data[end] = str;
		end++;
	}

	public void remove(int pos) {
		// remove the String object at position 'pos' and bring
		// forward all items after it
		for (int i = pos; i <= end; i++) {
			data[i] = data[i + 1];
		}
		end = getEnd();
	}

	public String get(int pos) {
		return data[pos];
	}

	public int getEnd() {
		for (int i = 0; i < data.length; i++) {
			if ( data[i]==null)
			{
				return  i-1;
			}
		}
		return 0;
	}
	public int getStart(){
	
		return start;
	}

	
}
