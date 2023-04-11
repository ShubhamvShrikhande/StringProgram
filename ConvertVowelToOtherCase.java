package StringProgram;

public class ConvertVowelToOtherCase {
	public static void convertCase(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				newStr = newStr + Character.toUpperCase(str.charAt(i));
			} else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
				newStr = newStr + Character.toLowerCase(str.charAt(i));
			} else {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println("Original String " + str);
		System.out.println("Updated String " + newStr);
	}

	public static void main(String[] args) {
		String str = "shubham";
		convertCase(str);
	}

}
