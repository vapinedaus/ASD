package Composite.Lab6;

public class Leaf extends Component {

	
	public Leaf(String tag,Component parent) {
		this.tag = tag;
		super.parent=parent;
	}

	@Override
	public void print() {
		System.out.println(tag);
	}



}