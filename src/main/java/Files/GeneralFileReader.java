package Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GeneralFileReader {
	public static void main(String[] args) throws IOException{
		String line;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\pc\\Documents\\Travel\\BikeExpence.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\pc\\Documents\\Travel\\BikeExpence cpoy.txt"));
		while ((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			System.out.println(line);
		}
		bufferedReader.close();
		bufferedWriter.close();
	}
}
