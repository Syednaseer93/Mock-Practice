package random;

public class CountNumberCharactersInString {

	public static void main(String[] args) {

		/*		String str="Syed Naseer";
		int count=0;
		for(int i=0;i<str.length();i++) {
			count++;
		}
		System.out.println(count); */

		int num=123456;
		String s=Integer.toString(num);
		int count=0;
		for(int i=0;i<s.length();i++) {
			count++;
		}
		System.out.println(count);



	}

}
