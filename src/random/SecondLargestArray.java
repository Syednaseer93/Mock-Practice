package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(6,3,4,2,1,5,4);
		list.stream().distinct().forEach(s->System.out.println(s));
	}
}
