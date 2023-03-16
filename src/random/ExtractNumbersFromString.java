package random;

public class ExtractNumbersFromString {

	public static void main(String[] args) {
		String str = "Page 12 from 114";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				int nums = Character.getNumericValue(ch);
				sum = sum + nums;
			}

		}
		System.out.println(sum);

	}

}
