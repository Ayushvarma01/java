package Oops;

final class TestConstructor {

//	public TestConstructor() {
//		System.out.println("Hit Condstructor");
//	}

//	public TestConstructor(HashMap<String, Object> map) {
//		for (String key : map.keySet()) {
//			System.out.println(map.get(key));
//		}
//	}

	public static void main(String[] args) {
		PerentClass perent = new ChildClass();
		ChildClass child = (ChildClass) perent;
		child.getMe();
		child.get();

//		TestConstructor constructor = new TestConstructor();
//		HashMap<String, Object> map = new HashMap<String, Object>() {
//			{
//				put("name", "Ayush");
//			}
//		};
//
//		List<String> list = new ArrayList<String>() {
//			{
//				add("String");
//			}
//		};
//		TestConstructor constructorMap = new TestConstructor(map);
//
//		Oops oops = new Oops();
//		oops.show();
	}
}
