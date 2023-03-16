package random;

import java.util.Scanner;

public class SearchInArray {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 2, 5 };
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		String msg = "Not Found";
		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {
				msg = "Found";
			}

		}
		System.out.println(msg);
	}
}
