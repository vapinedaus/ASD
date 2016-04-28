package Proxy.c1;

public class Client {

	public static void main(String[] args) {

		ITable rowLockTableProxy = new RowLockTableProxy();
		System.out.println("Number of rows: " +  rowLockTableProxy.numOfRows());
		System.out.println("Row[0]: " + rowLockTableProxy.getRow(0));
		System.out.println("-----------------------------------------------------");
		rowLockTableProxy.deleteRow(0);
		System.out.println("New Row[0] after delete: " + rowLockTableProxy.getRow(0));
		System.out.println("Number of rows after delete: " +  rowLockTableProxy.numOfRows());
		System.out.println("-----------------------------------------------------");
		rowLockTableProxy.modifyRow(0, new Row("Darna","Lee"));
		System.out.println("New Row[0] after modify: " + rowLockTableProxy.getRow(0));
		System.out.println("-----------------------------------------------------");
		rowLockTableProxy.addRow(new Row("Macoy","Beef"), rowLockTableProxy.numOfRows());
		System.out.println("Number of rows after Insertion: " +  rowLockTableProxy.numOfRows());
		

		

	}

}
