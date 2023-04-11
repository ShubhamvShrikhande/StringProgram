package StringProgram;

public class RemoveSpaces {
	public static void main(String[] args) {
		String s = " string is a sequenece of characters ";
		s = s.trim();
		s = s.replaceAll(" ", "");
		System.out.println(s);

		char[] arr = s.toCharArray();
		String newStr = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				newStr = newStr + arr[i];
			}
		}
		System.out.println(newStr);
	}

}
