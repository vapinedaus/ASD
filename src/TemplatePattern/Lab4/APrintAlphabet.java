package TemplatePattern.Lab4;

public abstract class APrintAlphabet {
	
	//Skeleton Method
	public final void proceesInput(String[] strArray)
	{

		SyemtricType semitricType = identifySymetryType(strArray);
		String[] strCompleteArray= buildCompleteArray(semitricType , strArray); 
		print(strCompleteArray);
		
		
	}
	
	public abstract SyemtricType identifySymetryType(String[] strArray); 
	
	public abstract String[] buildCompleteArray(SyemtricType semitricType , String[] strArray); 
	
	public abstract void print(String[] strArray); 
	

}
