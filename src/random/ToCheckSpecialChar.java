package random;

public class ToCheckSpecialChar {

	public static void main(String[] args) {

		String str="HeL@$%&9*#Lo9";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(!(Character.isDigit(str.charAt(i))||Character.isAlphabetic(str.charAt(i))||Character.isWhitespace(str.charAt(i)))) {
				System.out.print(str.charAt(i));
				count++;
			}

		}
		System.out.println(count);
	}

}
