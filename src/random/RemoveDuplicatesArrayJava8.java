package random;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesArrayJava8 {

	public static void main(String[] args) {
			List<Integer> list = Arrays.asList(30, 10, 50, 40, 20, 10, 20);
		List<Integer> list2 = list.stream().distinct().sorted().collect(Collectors.toList());
		Object[] arr2 = list2.toArray();
		for (Object var : arr2) {
			System.out.println(var);
		} 
	}
}
