package array_example;

public class Employee {

	public int id;
	public String name;
	public String email;
	public String mobileNum;
	public Address temporaryAddress;
	public Address parmanentAddress;
//	public Education[] education;
	public Employee() {
		
	}
	public Employee(int id,String name,String email,String mobileNum,Address temporaryaddress,Address parmanentAddress){
		this.id=id;
		this.name= name;
		this.email=email;
		this.mobileNum=mobileNum;
		this.temporaryAddress=temporaryaddress;
		this.parmanentAddress=parmanentAddress;
		
	}
	//alt + shift + s
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mobileNum=" + mobileNum + "]";
	}
	
	
}
