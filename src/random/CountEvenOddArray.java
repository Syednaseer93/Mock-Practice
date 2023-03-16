package random;

public class CountEvenOddArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int eCount=0;
		int oCount=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					eCount++;
				}
				else {
					oCount++;
				}
			}
			System.out.println(eCount);
			System.out.println(oCount);
	}

}
