package Proxy.c1;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

public class Table implements ITable {

	private Hashtable HT;

	public Table()
	{
		HT = new Hashtable<String,IRow>();
		HT.put("111", new Row("Victor", "Pineda"));
		HT.put("222", new Row("Alice", "Pineda"));
		HT.put("333", new Row("Pros", "Pineda"));
	}
	
	
	@Override
	public int numOfRows() {
		return HT.size();
	}

	@Override
	public IRow getRow(int rowNum) {
		
		int rowCount = numOfRows();
		Enumeration e =  HT.keys();  
	    while (e.hasMoreElements()) {
	      rowCount--;
	      String key = (String) e.nextElement();
	      if (rowCount == rowNum )
	      {
		      return  (IRow) HT.get(key);
	      }
	    }
	    
	    return null;
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		
		HT.put(Integer.toString(getLastKey()) , row);
		System.out.println("New Item Added in Row[" + rowNum  + "]: "+ getLastKey() + " "+ row);
		
	}
	
	private Integer getLastKey()
	{
		int rowCount = numOfRows();
		Enumeration e =  HT.keys();  
	    while (e.hasMoreElements()) {
	      rowCount--;
	      String key = (String) e.nextElement();
	      return Integer.parseInt(key)+1 ;
	    }
	    
	    return null;
	}
	
	

	@Override
	public void modifyRow(int rowNum, IRow row) {
		int rowCount = numOfRows();
		Enumeration e =  HT.keys();  
	    while (e.hasMoreElements()) {
	      rowCount--;
	      String key = (String) e.nextElement();
	      if (rowCount == rowNum )
	      {
		         HT.put(key, row);
	      }
	    }
		
	}

	@Override
	public void deleteRow(int rowNum) {
		int rowCount = numOfRows();
		Enumeration e =  HT.keys();  
	    while (e.hasMoreElements()) {
	      rowCount--;
	      String key = (String) e.nextElement();
	      if (rowCount == rowNum )
	      {
		         HT.remove(key);
	      }
	    }
	    
	    
		
	}

}
