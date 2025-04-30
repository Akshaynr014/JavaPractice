package array_example;

public class Arraymain {

	public static void main(String[] args) {
		// cannot change size of array
		int[] num = { 10, 20, 30, 40, 50 };
		int evennumber[] = { 2, 4, 6, 8, 10 };
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		System.out.println(num[1]+" " +num[2]+" "+num[3]);
		
		//using for loop
		for(int i=0;i<=num.length-1;i++) {
			System.out.println(num[i]);
		}
		System.out.println("=====================================");
		//using while loop
		int i =0;
		while(i<=num.length-1) {
			System.out.println(num[i]);
			i++;
		}
		System.out.println("num  length:"+num.length);
		System.out.println("-----------------------------------------");
		System.out.println(evennumber[0]);
		System.out.println(evennumber[1]);
		System.out.println(evennumber[2]);

		float[] floatnum = {29.28f,23.38f,38.38f};
		System.out.println(floatnum[1]);
		
		
		String name = "Banana";
		System.out.println(name.length());
				
	}

}
