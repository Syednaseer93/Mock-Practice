package random;

public class SplitPagination {
//Just Retreiving numbers from a string and sum of those numbers
	
	public static void main(String[] args) {
		String str="page 12 of 423";
		int sum=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)>='0'&& str.charAt(i)<='9') {
				//System.out.print(str.charAt(i));
				//sum=sum+str.charAt(i);

				char var = str.charAt(i);
				int a=Integer.parseInt(String.valueOf(var));
				sum=sum+a;
			}
		}
		System.out.println(sum);

		/*	String[] arr=str.split(" ");
		for(int i=0;i<=arr.length-1;i++) {

		}
		System.out.println(arr[3]); */

	}

}
