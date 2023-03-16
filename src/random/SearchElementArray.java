package random;

public class SearchElementArray {

	public static void main(String[] args) {
		int arr[]= {4,6,9,11,13};
		int num=4;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				flag=true;
			}
			
		}
		if(flag==true) {
			System.out.println("Element Found");
		}
		else {
			System.out.println("Element not found");
		}

	}

}
