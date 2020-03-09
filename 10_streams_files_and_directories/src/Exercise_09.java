import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class Exercise_09 {
	public static void main(String[] args) throws IOException {
		String path = "img.jpg";

		byte[] bytes = Files.readAllBytes(Path.of(path));

		new FileOutputStream("copy-img.jpg").write(bytes);
	}
}
