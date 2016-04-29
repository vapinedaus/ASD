package Composite.Lab6;

public class Leaf extends Component {

	
	public Leaf(String tag) {
		this.tag = tag;
	}

	@Override
	public void print() {
		System.out.println(tag);
	}



}