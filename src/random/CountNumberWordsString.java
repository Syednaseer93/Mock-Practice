package random;

public class CountNumberWordsString {

	public static void main(String[] args) {
		String str="Java Progamming d";
		int count=1;
		for(int i=0;i<=str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a String are: "+count);

	}

}
