package random;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesString {
	//Incomplete
	public static void main(String[] args) {
		String str="HELLLO";
		List list=new ArrayList();
		for(int i=0;i<str.length();i++)
		{
			char[] arr = str.toCharArray();
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]!=arr[j]) {
				list.add(arr);
				
				}
			}
			System.out.println(list);


		}
	

	}

}
