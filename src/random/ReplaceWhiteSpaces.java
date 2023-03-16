package random;

public class ReplaceWhiteSpaces {

	public static void main(String[] args) {
		String s="      Welcome     to     Selenium          ";
		String str=s.replaceAll("\\s", "");
		System.out.println(str);
	}

}
