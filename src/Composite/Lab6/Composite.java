package Composite.Lab6;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	
	public Composite(String tag,Component parent)
	{
		super.tag = tag;
		super.parent=parent;
	}
	
	
	@Override
	public void print() {
		System.out.println(tag);

		for (Component component : components) {
			component.print();
		}
	}


	

}
