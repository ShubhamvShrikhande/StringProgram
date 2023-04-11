package StringProgram;

public class RemovePanctuation {
	public static void main(String[] args) {
		String str = "shubham@gmail!99/.#com";
		String newStr = "";
		newStr = str.replaceAll("[0-9,./!@]", "");
		System.out.println("Original String :: " + newStr);

		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
	}

}
