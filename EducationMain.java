package array_example;

public class EducationMain {

	public static void main(String[] args) {
		Education[] edu=new Education[3];
		
		 edu[0]=new Education(1, "sslc", 65.65f,"ssvk" , "manglore");
		 edu[1]=new Education(2, "puc", 75.65f,"spu" , "manglore");
		 edu[2]=new Education(3, "eng", 85.65f,"smce" , "banglore");
		System.out.println("details");
		for(Education student:edu)
			System.out.println(student);

	}

}
