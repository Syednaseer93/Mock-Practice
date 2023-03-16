package random;

public class MaxNumberArray {

	public static void main(String[] args) {
		int[] arr= {1,4,5,2,3};
		int maxNum=0;
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;i<=arr.length;j++) {
				if(arr[i]>arr[j]) {
					System.out.println(arr[i]+"is greatest");
				}
			arr[i]=arr[i+1];
			}
		}

	}

}
