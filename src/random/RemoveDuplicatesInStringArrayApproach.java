package random;

public class RemoveDuplicatesInStringArrayApproach {

	public static void main(String[] args) {

		String str="programming";
		StringBuilder sb=new StringBuilder();
		char[] arr = str.toCharArray();
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb);
		
	}

}
