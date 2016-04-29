package Composite.Lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Component {
    List<Component> components = new ArrayList<Component>();

    protected String tag;
    
    public abstract void print();

	public int getSize() {
		return components.size();
	}

	
	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public List<Component> getComponents() {
		return components;
	}

	public Component getComponent(int index) {
		return components.get(index);
	}
	


}
