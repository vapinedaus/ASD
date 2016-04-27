package Proxy.Choice1;

public class RowLockTableProxy implements ITable {
	Table realTable;
	Integer[] locks;

	
	/*Constructor-  lock row mechanism*/
	public RowLockTableProxy() {
		realTable = new Table();
		locks = new Integer[realTable.numOfRows()];
		for (int row = 0; row < realTable.numOfRows(); row++)
			locks[row] = new Integer(row);
	}

	@Override
	public int numOfRows() {
		// TODO Auto-generated method stub
		return realTable.numOfRows();
	}

	@Override
	public IRow getRow(int rowNum) {
		synchronized (locks[rowNum]) {
			 return realTable.getRow(rowNum);
			 }
	}

	@Override
	public void addRow(IRow row, int rowNum) {
		synchronized (locks[rowNum]) {
			realTable.addRow(row, rowNum);
		}

	}

	@Override
	public void modifyRow(int rowNum, IRow row) {
		synchronized (locks[rowNum]) {
			realTable.modifyRow(rowNum, row);
		}

	}

	@Override
	public void deleteRow(int rowNum) {
		synchronized (locks[rowNum]) {
			realTable.deleteRow(rowNum);
		}

	}
}
