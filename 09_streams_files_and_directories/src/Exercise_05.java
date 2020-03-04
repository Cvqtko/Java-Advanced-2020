import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Exercise_05 {
	public static void main(String[] args) {
		String resourceFolder = "src\\";

		String inputPath = resourceFolder + "input.txt";
		String outputPath = resourceFolder + "05.WriteEveryThirdLineOutput.txt";
		// Use this when reading from console
//try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputPath)));
				PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))) {

			String line = reader.readLine();
			int counter = 1;

			while (line != null && !"".equals(line)) {

				if (counter % 3 == 0) {
					System.out.println(line);
					writer.println(line);
				}
				line = reader.readLine();
				counter++;
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}