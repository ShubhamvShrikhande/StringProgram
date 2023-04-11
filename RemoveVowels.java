package StringProgram;

public class RemoveVowels {
	public static void main(String[] args) {
		String s = "Apple";
		String newStr = "";
		System.out.println(s);
		newStr = s.replaceAll("[aioueAIOUE]", "");
		System.out.println(newStr);

//	        for (int i = 0; i < s.length(); i++){
//	            if(s.charAt(i) == 'A' || s.charAt(i) == 'I' || s.charAt(i) == 'E' || s.charAt(i) == 'O' ||
//	                    s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
//	                    s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
//	                continue;
//	            }else {
//	                newStr = newStr + s.charAt(i);
//	            }
//	        }

	}

}
