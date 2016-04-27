package Proxy.Choice1;
/*Proxy CLASS*/

public class Table implements ITable
{
	private RealSubjectTable realSubjectTable;
	/*constructor*/
	public Table()
	{
		realSubjectTable = new RealSubjectTable();
	}
	
	@Override
	public int numOfRows() {
		return realSubjectTable.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		return realSubjectTable.getRow(rowNum);
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		realSubjectTable.addRow(row, rowNum);
		
	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		realSubjectTable.modifyRow(rowNum, row);
		
	}

	@Override
	public void deleteRow(int rowNum) {
		realSubjectTable.deleteRow(rowNum);
		
	}

}
