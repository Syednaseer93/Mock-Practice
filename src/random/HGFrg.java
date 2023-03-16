package random;

public class HGFrg {
	public static void main(String[] args) {
		String str="Welcome to Akshara";
		String[] words=str.split(" ");
		String revWord="";
		String revString="";
		for(String word:words) {

			for(int i=word.length()-1;i>=0;i--) {
				revWord=revWord+word.charAt(i);
			}
		revString=revWord+" ";
		}
		System.out.print(revString);
	}
}