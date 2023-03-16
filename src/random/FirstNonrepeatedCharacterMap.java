package random;

import java.util.HashMap;
import java.util.Map;

public class FirstNonrepeatedCharacterMap {
//First non repeating character using hashmap very important
	public static void main(String[] args) {
		String str="aabccddeb";

		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		for(Map.Entry<Character,Integer> me : hm.entrySet()) {
			if(me.getValue()==1) {
				System.out.println(me.getKey());
				break;
			}
		}

	}

}
