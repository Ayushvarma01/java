package Files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		CreateFile createFile = new CreateFile();
		try {
			createFile.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void createNewFile() throws IOException {
		File file = new File("demo.txt");
		file.createNewFile();

	}
}
