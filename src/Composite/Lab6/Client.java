/*import composite.Component;
import composite.Composite;
import composite.Leaf;
*/

package Composite.Lab6;
public class Client {

    private static final String input = "<html><head><title>Test</title></head><body><h1>Content</h1><div><p>The following is a list</p><ul><li>Item1</li><li>Item2</li><li>Item3</li><li>Item4</li></ul></div></body></html>";

    public static void main(String args[]) {
    	
        Component parent = new Composite("HTML DOM");
        parseHTML(input, parent);
        parent.print();
    	
    	

        /*Leaf leaf1 = new Leaf("Bob");
		Leaf leaf2 = new Leaf("Fred");
		Leaf leaf3 = new Leaf("Sue");
		Leaf leaf4 = new Leaf("Ellen");
		Leaf leaf5 = new Leaf("Joe");

		Composite composite1 = new Composite();
		composite1.add(leaf1);
		composite1.add(leaf2);

		Composite composite2 = new Composite();
		composite2.add(leaf3);
		composite2.add(leaf4);

		Composite composite3 = new Composite();
		composite3.add(composite1);
		composite3.add(composite2);
		composite3.add(leaf5);

		System.out.println("Calling 'sayHello' on leaf1");
		leaf1.sayHello();

		System.out.println("\nCalling 'sayHello' on composite1");
		composite1.sayHello();

		System.out.println("\nCalling 'sayHello' on composite2");
		composite2.sayHello();

		System.out.println("\nCalling 'sayGoodbye' on composite3");
		composite3.sayGoodbye();*/
    }
    
    
   
    private static void parseHTML(String input, Component parent) {
        while (input.length() != 0 && input.charAt(0) != '<') {
            input = input.substring(1, input.length());
        }
        while (input.length() != 0) {
            Component toAdd;
            String tag = input.substring(1, input.indexOf(">"));
            //toAdd = new Composite(tag);
            toAdd = new Composite(tag);
            String endTag = "</" + tag + ">";
            String inner = input.substring(input.indexOf(">") + 1, input.indexOf(endTag));
          
            parseHTML(inner, toAdd);
            if (toAdd.getSize() == 0) {
                toAdd = new Leaf(tag);
            }
            parent.add(toAdd);
            input = input.substring(input.indexOf(endTag) + endTag.length(), input.length());
        }
    }
}
