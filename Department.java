package array_example;

public class Department {
 
	public int id = 0;
 
	public String name;
 
	public static int count = 0;
 
	public Department() {
 
	}
 
	public Department(String name) {
		this.id = generateId();
		this.name = name;
	}
 
	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}
 
	@Override
	public String toString() {
		return "id: " + this.id + ", name: " + this.name;
	}
 
//	private int generateId() {
//		this.count = this.count + 1;
//		return this.count;
//	}
	private int generateId() {
	    Department.count = Department.count + 1;
	    return Department.count;
	}
}
 
 
