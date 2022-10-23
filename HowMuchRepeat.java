package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HowMuchRepeat<T> {
	public static <T> Map<T,Integer> count(T[] arr) {
		Map<T, Integer> number = new HashMap<>();
		for (T i : arr) {
			Integer num = number.get(i);
			if (num != null) {
				number.put(i, num+1);
			} else {
				number.put(i, 1);
			}
			
		}
		return number;
	}
}
