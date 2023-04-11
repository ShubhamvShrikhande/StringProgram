package StringProgram;

public class DuplicateChar {
	public static void main(String[] args) {
		String[] str = { "a", "b", "c", "a", "d" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					System.out.println(str[i] + ":is duplicate");
				}
			}
		}
	}

}
