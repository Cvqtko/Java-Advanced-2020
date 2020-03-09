import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise_05 {
	public static void main(String[] args) {

		String path = "input.txt";
		String outputPath = "output_ex5.txt";
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(path));
				PrintWriter writer = new PrintWriter(new File(outputPath))) {
			int lineCounter = 1;
			String line = reader.readLine();

			while (line != null) {
				line = lineCounter + ". " + line;
				writer.println(line);
				lineCounter++;
				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
