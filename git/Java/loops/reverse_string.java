package important_program;

public class reverse_string {

	public static void main(String[] args) {
		String name = "ayush varma";
		System.out.println(name);
		for (int i = name.length()-1; i >= 0; i--) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}

	}

}
