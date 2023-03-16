package random;

public class hjcsxbvfc {

	public static void main(String[] args) {
		String str="Tom Dick Harry";
		String[] arr = str.split(" ");
		String revString=" ";
		String revWord="";
		for(String word:arr) 
		{
			
			for(int i=word.length()-1;i>=0;i--) {
				char ch=word.charAt(i);
				revWord=revWord+ch;
				
			}
			revString=revWord+revString;
		
		}
		System.out.print(revString);
	}

}
