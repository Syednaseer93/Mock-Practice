package random;

public class SumOfAllEvenNumbers {

	public static void main(String[] args) {
		int num=3456676;
		int sum=0;
		
		while(num!=0) {
			int digit=num%10;
			if(digit%2==0) {
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println(sum);
	}
}
