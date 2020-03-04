import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise_09 {
	public static void main(String[] args) {
		String resourceFolder = "src\\";

		String serializableObjectPath = resourceFolder + "save.txt";

		Cube player = new Cube("green", 15.3d, 12.4d, 3d);

		try (FileOutputStream fos = new FileOutputStream(serializableObjectPath);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			oos.writeObject(player);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}