import java.util.ArrayList;

public class Database {
	private String name;
	private int size;
	private ArrayList<String> data;
	
	public Database(String name, int size) {
		this.name = name;
		this.size = size;
		data = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxSize() {
		return size;
	}
	
	public int getCurrentSize() {
		return data.size();
	}
	
	public ArrayList<String> getDataArray() {
		return data;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
