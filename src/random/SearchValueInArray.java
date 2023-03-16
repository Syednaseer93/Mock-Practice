package random;

public class SearchValueInArray {
	public static void main(String[] args) {
		int[] arr = {2,5,4,3,1};
		int num=7;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	}
}
