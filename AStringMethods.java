package StringProgram;

public class AStringMethods {
	public static void main(String[] args) {
		String s = "javascript";
		System.out.print(s.substring(0, 2));
		System.out.println(s.substring(2));
		System.out.println("length of string :: " + s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.toCharArray());
		System.out.println(s.contains("ja"));
		System.out.println(s.hashCode());
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.replace('a', 'e'));
		System.out.println(s.isEmpty());

	}

}
