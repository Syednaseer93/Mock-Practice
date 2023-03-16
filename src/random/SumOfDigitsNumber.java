package random;

public class SumOfDigitsNumber {

	public static void main(String[] args) {
		int sum=0;
		int num=12345;
		String str=Integer.toString(num);
		for(int i=0;i<str.length();i++) {
			int var = Character.getNumericValue(str.charAt(i));
			sum=sum+var;
		}
		System.out.println(sum);
	
	}

}
