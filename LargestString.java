package StringProgram;

public class LargestString {
	public static String largestString(String[] strings) {
		String str = strings[0];

		for (int i = 0; i < strings.length; i++) {
			if (str.compareTo(strings[i]) < 0) {
				str = strings[i];
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String[] strings = { "Orange", "Blue", "Green", "Yellow" };
		System.out.println(largestString(strings));
	}

}
