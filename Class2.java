public class DataHandler {
	Database db;
	public DataHandler(Database db) {
		this.db = db;
	}
	
	public void addData(String data) {
		if(db.getDataArray().size() < db.getMaxSize())
			db.getDataArray().add(data);
		else
			 System.out.println("Overflow : \nData size > " + db.getMaxSize());
	}
	
	public void modifyData(int index, String newData) {
		db.getDataArray().set(index, newData);
	}
	
	public void removeData(int index) {
		db.getDataArray().remove(index);
	}
	
	public void viewAll() {
		for(int i = 0; i < db.getCurrentSize(); ++i) {
			System.out.println(db.getDataArray().get(i));
		}
	}
	
	public void setDatabaseName(String name) {
		db.setName(name);
	}
	
	public String getDatabaseName() {
		return db.getName();
	}
}
