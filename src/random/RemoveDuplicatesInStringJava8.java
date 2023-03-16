package random;

public class RemoveDuplicatesInStringJava8 {

	public static void main(String[] args) {
		String str="aaaaaaaaaaabbbbbbbbbbbbbbcccccccccccdddddddddddddd";
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(s->sb.append((char)s));
		System.out.println(sb);
	}

}
	