package collection.Lists;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/*@Auther
 *This is list practice*/
public class ListPractice {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Ayush");
//		list.add("Sakshi");
//		list.add("Megha");
//		list.add("Jayshree");

//		System.out.println(list);
//		Iterator<String> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}

		String key1 = new String("key");
		String key2 = new String("key");
//		System.out.println(key1.hashCode() + " : " + key2.hashCode());
//		System.out.println(key1 == key2);
//		System.out.println(key1.equals(key2));

//		List<Integer> list = new LinkedList<>();
//		list.add(4);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		System.out.println(list);

//		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("one", 1);
//		map.put("two", 4);
//		map.put("three", 3);
//		map.put("four", 2);
//		System.out.println(map);

		HashMap<String, Object> linkedHashMap = new HashMap<String, Object>();
		linkedHashMap.put("two", 4);
		linkedHashMap.put("two", 4);
		linkedHashMap.put("one", 1);
		linkedHashMap.put("three", 3);
		linkedHashMap.put("four", 2);
		System.out.println(linkedHashMap);
	}
}
