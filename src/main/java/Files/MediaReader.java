package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MediaReader {
	public static void main(String[] args) throws IOException {

//		This convert all file 
		FileInputStream inputStream = new FileInputStream("C:\\Users\\pc\\Videos\\Noor_Khan_Madhurxo_-_Aarzu_Official_Audio_720P.mp4"); 
		FileOutputStream outputStream = new FileOutputStream("C:\\Users\\pc\\Downloads\\Noor_Khan_Madhurxo_-_Aarzu_Official_Audio_720P.mp4");
		int i;
		while ((i = inputStream.read()) != -1) {
			outputStream.write(i);
//			System.out.print(i + ",");
		}
		inputStream.close();
		outputStream.close();
	}
}
