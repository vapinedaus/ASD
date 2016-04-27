package TemplatePattern.Lab4;

public class ConcreteClassPrintAlphabet extends APrintAlphabet {

	@Override
	public SyemtricType identifySymetryType(String[] strArray) {

		if (strArray.length > 5)
		{
			String symetryType = strArray[0];
			switch (symetryType)
			{case  "VERTICAL":
				return SyemtricType.Vertical;
			case  "HORIZONTAL":
				return SyemtricType.Horizontal;
			 default:
				  return SyemtricType.None;

			}	
		}
		
		return null;
		
		
	}

	@Override
	public String[] buildCompleteArray(SyemtricType semitricType, String[] strArray) {
		
		if (semitricType == SyemtricType.Vertical)
		{
			
			for(int i= 5; i <= strArray.length-1 ; i++)
			{
				strArray[i] = strArray[i] + reverse(strArray[i]);
			}
			
			
		}
		else if (semitricType == SyemtricType.Horizontal)
		{
			int pos = 13;
			String[] strNewArray = new String[Integer.parseInt(strArray[4])];
			
			System.arraycopy(strArray, 0, strNewArray, 0, pos);
			
			for(int i=strArray.length-1 ; i >5  ; i--)
			{
				strNewArray[pos]= strArray[i];
			    pos++;
			}
			
			strArray = strNewArray;
		}
		
		 
		return strArray;
	}
	
	
	private String reverse (String str)
	{
		if (str==null || str.length() <=1 )
		{
			return str;
		}
		else
		return reverse(str.substring(1)) + str.charAt(0);
	}

	@Override
	public void print(String[] strArray) {
		// TODO Auto-generated method stub
		
		for(int i= 5; i <= strArray.length-1 ; i++)
		{
			System.out.println(strArray[i]);
		}
		
	}

}
