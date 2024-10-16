package strings;

public class NonRepeatedCharachter {
	public static void main(String[] args) {
		String str = "gibblegabbler";

//		Map<Character, Integer> map = new LinkedHashMap<>();
//
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (map.containsKey(ch)) {
//				int value = map.get(ch);
//				map.put(ch, value + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//
//		for (int i = 0; i < map.size(); i++) {
//			if (map.containsValue(1)) {
//				char ch = str.charAt(i);
//				System.out.println(map);
//				break;
//			}
//		}

		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch1 = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				char ch2 = str.charAt(j);

				if (ch1 == ch2) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(ch1);
				break;
			}
		}

	}
}
