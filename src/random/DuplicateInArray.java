package random;

public class DuplicateInArray {

	public static void main(String[] args) {
		String[] arr= {"Java","Python","C#","Ruby","Java"};
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate present: "+arr[i]);
					flag=true;
				}

			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not present");
		}

	}

}
