package StringProgram;

public class FindString {
	public static int getCount(String[] color, char ch) {

		int count = 0;
		for (int i = 0; i < color.length; i++) {

			String s = color[i];

			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == ch) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String color[] = { "pink", "red", "black", "yellow" };
		char ch = 'e';
		int c = getCount(color, ch);
		if (c == 0) {
			System.out.println("not found");
		} else {
			System.out.println("Count : " + c);
		}
	}

}
