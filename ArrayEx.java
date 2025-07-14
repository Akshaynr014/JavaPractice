package array_example;

public class ArrayEx {

	public static void main(String[] args) {
		int[] numbers = new int[6];

//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i]+=1;
//		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(++numbers[i]);
		}

	}

}
