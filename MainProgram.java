public class Main {
	public static void main(String[] args) {
		Database db = new Database("tmp", 20);
		DataHandler dh = new DataHandler(db);
		
		dh.addData("John Wattz");
		dh.addData("Sherlock Holmes");
		dh.addData("Jenny Trevor");
		
		System.out.println(dh.getDatabaseName() + " " + db.getCurrentSize());
		dh.viewAll();
		
		dh.setDatabaseName("Names");
		
		System.out.println("\n" + dh.getDatabaseName() + " " + db.getCurrentSize());
		dh.viewAll();
	}
}
