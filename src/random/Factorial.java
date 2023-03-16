package random;

public class Factorial {
	public static void main(String[] args) {
		int num = 4;
		int fact = 1;

		for (int i = num; i >= 1; i--) {
			if (i == 1) {
				System.out.print(i + "=");
			} else {
				System.out.print(i + "*");
			}

			fact = fact * i;
		}
		System.out.print(fact);

	}
}
