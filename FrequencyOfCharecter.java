package StringProgram;

public class FrequencyOfCharecter {
	public static void frequency(String[] str) {
		int[] frequency = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (frequency[i] != -1) {
				for (int j = i + 1; j < str.length; j++) {
					if (str[i].compareToIgnoreCase(str[j]) == 0) {
						count++;
						frequency[j] = -1;
					}
				}
			}
			frequency[i] = count;
		}
		for (int i = 0; i < str.length; i++) {
			if (frequency[i] > 1) {
				System.out.println(str[i] + " " + frequency[i]);
			}
		}
	}

	public static void main(String[] args) {
		String[] str = { "pink", "red", "yellow", "black", "pink", "red" };
		frequency(str);
	}

}
