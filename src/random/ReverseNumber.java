package random;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		String str = Integer.toString(num);
		StringBuffer sb = new StringBuffer(str);
		StringBuffer var = sb.reverse();
		String s = var.toString();
		int i = Integer.parseInt(s);
		System.out.println(i);

	}
}