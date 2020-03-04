import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise_03 {
	public static void main(String[] args) {
		String resourceFolder = "src\\";

		String inputPath = resourceFolder + "input.txt";
		String outputPath = resourceFolder + "03.CopyBytesOutput.txt";

		try (FileInputStream fis = new FileInputStream(inputPath);
				FileOutputStream fos = new FileOutputStream(outputPath)) {
			int oneByte = fis.read();

			int asciiCodeSpace = 32;
			int asciiCodeNewLine = 10;

			while (oneByte >= 0) {
				if (asciiCodeNewLine == oneByte || asciiCodeSpace == oneByte) {
					fos.write(oneByte);
				} else {
					char[] characters = String.valueOf(oneByte).toCharArray();
					for (char character : characters) {
						fos.write(character);
					}
				}
				oneByte = fis.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}