package Composite.Lab6;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	
	public Composite(String tag)
	{
		super.tag = tag;
	}
	
	
	@Override
	public void print() {
		System.out.println(tag);

		for (Component component : components) {
			component.print();
		}
	}


	

}
