package random;

public class PrimeOrNot {
	public static void main(String[] args) {

		int num=17;
		int temp=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				temp++;
			}
		}
		if(temp>0) {
			System.out.println("Not a Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
}
