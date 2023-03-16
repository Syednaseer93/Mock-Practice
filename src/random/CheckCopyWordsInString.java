package random;

import java.util.HashMap;

public class CheckCopyWordsInString {

	public static void main(String[] args) {
		String str = "This this is is done by Saket Saket";
		String[] arr = str.split(" ");

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) 
			{
				map.put(arr[i], map.get(arr[i]) + 1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
	}
}
