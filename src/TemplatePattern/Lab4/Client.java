package TemplatePattern.Lab4;

public class Client {

	public static void main(String[] args) {
		
		
		String[] A = 
			new String[]
			{"VERTICAL",
			 "5", 
			 "14",
			 "10",
			 "20",
			 "-----",
			 "----+",
			 "---++",
			 "--++-",
			 "-++--",
			 "-++--",
			 "-++--",
			 "-++--",
			 "-++++",
			 "-++--",
			 "-++--",
			 "-++--",
			 "-++--",
			 "-++--"};
		
		String[] B = {
	            "NONE",
	            "9",
	            "14",
	            "10",
	            "20",
	            "---------",
	            "-+++++---",
	            "-++--++--",
	            "-++---++-",
	            "-++---++-",
	            "-++---++-",
	            "-++--++--",
	            "-++++++--",
	            "-++---++-",
	            "-++----++",
	            "-++----++",
	            "-++----++",
	            "-++---++-",
	            "-++++++--",
	            "---------"
	        };
		
		String[] C = {
	            "HORIZONTAL",
	            "9",
	            "8",
	            "10",
	            "20",
	            "---------",
	            "---++++--",
	            "--++--++-",
	            "-++----++",
	            "-++------",
	            "-++------",
	            "-++------",
	            "-++------"
	        };
		
		
		APrintAlphabet printAlphabet = new ConcreteClassPrintAlphabet();
		printAlphabet.proceesInput(A);
		System.out.println("=================================================");
		printAlphabet.proceesInput(B);
		System.out.println("=================================================");
		printAlphabet.proceesInput(C);
		

	}

}
