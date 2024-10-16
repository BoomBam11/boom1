package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyUniqStringMap {

	public static void main(String[] args) {
		String str = "maharashtra";

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value + 1);
			} else {
				map.put(ch, 1);
			}

		}
		System.out.println(map);

	}

}
