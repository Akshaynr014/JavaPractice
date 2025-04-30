package array_example;

public class charclass {
	public static void main(String[] args) {
    char[] letter = {'h','j','k','o','p'};
    String word = letterConcatenator(letter);
    System.out.println(word);
	}
//	public static char[] createCharacterArray() {
//		return new char[5];
//	}
	public static String letterConcatenator(char[]letters) {
		StringBuilder builder = new StringBuilder("");
				builder.append(letters);
		return builder.toString();
	}
//	public static char getCharAtIndex(int number,char[] charArray) {
//		String word = letterConcatenator(charArray);
//		return word.charAt(number);
//
//		
//	}
}
