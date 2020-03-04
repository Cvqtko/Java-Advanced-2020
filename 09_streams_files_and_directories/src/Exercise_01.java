import java.io.FileInputStream;
import java.io.IOException;

public class Exercise_01 {
	public static void main(String[] args) {
		String resourceFolder = "src\\";

		String path = resourceFolder + "input.txt";

		try (FileInputStream fis = new FileInputStream(path)) {
			int oneByte = fis.read();

			while (oneByte >= 0) {
				System.out.printf("%s ",Integer.toBinaryString(oneByte));
				oneByte = fis.read();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}