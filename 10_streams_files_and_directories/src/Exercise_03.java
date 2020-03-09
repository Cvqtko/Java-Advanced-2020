import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise_03 {
	public static void main(String[] args) {
		String path = "input.txt";
		String outputPath = "output.txt";
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
				PrintWriter writer = new PrintWriter(new File(outputPath))) {
			String line = reader.readLine();

			while (line != null) {
				line = line.toUpperCase();
				writer.println(line);
				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}
}
