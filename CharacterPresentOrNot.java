package StringProgram;

public class CharacterPresentOrNot {
	public static boolean isPrsent(String str, char ch) {
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String str = "shubham";
		char ch = 'b';
		if (isPrsent(str, ch)) {
			System.out.println("charecter is present");
		} else {
			System.out.println("charecter is not prsent");
		}
	}

}
