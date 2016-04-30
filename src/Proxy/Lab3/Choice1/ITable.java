package Proxy.Lab3.Choice1;

/*Dummy Subject*/
public interface ITable {
	public int numOfRows();

	public IRow getRow(int rowNum);

	public void addRow(IRow row, int rowNum);

	public void modifyRow(int rowNum, IRow row);

	public void deleteRow(int rowNum);
}
