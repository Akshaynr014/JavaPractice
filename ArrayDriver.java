package array_example;

public class ArrayDriver {

	public static void main(String[] args) {
		int[] numbers = new int[6];
//		numbers[0]=1;
//		numbers[1]=2;
//		numbers[2]=3;
//		numbers[3]=4;
//		numbers[4]=5;
//		numbers[5]=6;
		
		//other way to initialaize
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=i+1;
//			System.out.println(numbers[i]);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		long[] num = new long[5];
		num[0]=1323344567890l;
		num[1]=23245674567890l;
		num[2]=323432345678l;
		num[3]=423432l;
		num[4]=52343l;
		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}
	}

}
