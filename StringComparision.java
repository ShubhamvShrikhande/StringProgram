package StringProgram;

public class StringComparision {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");

		if (s1 == s2) {
			System.out.println("String are equal , same object");
		} else {
			System.out.println("Strings are not equal");
		}

		if (s1 == s3) {
			System.out.println("String are equal , same object");
		} else {
			System.out.println("Strings are not equal");
		}

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("String are equal , same content/value");
		} else {
			System.out.println("Strings are not equal");
		}

		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("String are equal , same content/value");
		} else {
			System.out.println("Strings are not equal");
		}

		if (s1.compareToIgnoreCase(s2) < 0) {
			System.out.println(s1 + " is less than " + s2);
		} else if (s1.compareToIgnoreCase(s2) > 0) {
			System.out.println(s1 + "is greater than " + s2);
		} else {
			System.out.println("Strings are equal");
		}

	}

}
