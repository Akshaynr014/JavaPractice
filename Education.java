package array_example;

public class Education {
	public int id;
	public String eduType;
	public float percentage;
	public String colName;
	public String city;

	public Education() {

	}

	public Education(int id, String eduType, float percentage, String colName, String city) {
		super();
		this.id = id;
		this.eduType = eduType;
		this.percentage = percentage;
		this.colName = colName;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Education [id=" + id + ", eduType=" + eduType + ", percentage=" + percentage + ", colName=" + colName
				+ ", city=" + city + "]";
	}

}
