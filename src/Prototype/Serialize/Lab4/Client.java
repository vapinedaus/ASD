package Prototype.Serialize.Lab4;

public class Client {

	public static void main(String args[]) {
		

		
		Employee e = new Employee(2, "Pineda", "Victor", "4th Street", "Fairfield", "Iowa", "52557", new Employee(),
				new Employee[3]);
		
		
		System.out.println(e.toString());
		System.out.println(e.getSupervisor());
		System.out.println(e.getStaff());
		Employee cloned = (Employee) e.clone();
		System.out.println("------------Clone---------------");
		System.out.println(cloned);
		System.out.println(cloned.getSupervisor());
		System.out.println(cloned.getStaff());
	}
}
