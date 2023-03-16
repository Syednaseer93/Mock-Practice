package random;

public class ReverseStringEachWord {

	public static void main(String[] args) {
		String orgString="Welcome to Java";

		String[] words=orgString.split(" ");

		for(String w:words) {

			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--) {

				reverseWord=reverseWord+w.charAt(i);
			}
			String reversedString=reverseWord+" ";
			System.out.print(reversedString);
		}


	}

}
