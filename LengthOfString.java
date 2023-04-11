package StringProgram;

public class LengthOfString {
	public static void main(String[] args) {
		String str = "shubham";
		System.out.println(str.length());

		char[] array = str.toCharArray();
		int length = 0;
		for (int i = 0; i < array.length; i++) {
			length++;
		}
		System.out.println("Length of " + str + " is " + length);

	}

}
