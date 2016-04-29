package Iterator.Lab6;

public class Client {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
			String[] name = (String[])iter.next();

			if (iter.item(name).isNotBlank())
			{
				System.out.println("First Name : " + name[0]);
				System.out.println("Last Name : " + name[1]);

			}
		} 	
	}
}
