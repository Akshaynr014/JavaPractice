package array_example;

public class EncapsulationEx {
	private String name;
	private String email;
	private String phoneNum;
	public EncapsulationEx() {
		
	}
	public EncapsulationEx(String name, String email, String phoneNum) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getphoneNum() {
		return phoneNum;
	}
	public void setphoneNum(String phoneNum) {
		this.phoneNum=phoneNum;
	}

}
