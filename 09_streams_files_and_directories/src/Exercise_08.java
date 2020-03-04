import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;

public class Exercise_08 {
	public static void main(String[] args) {
		String rootDirectoryPath = "src\\Files-and-Streams\\";

		try {
			File rootDir = new File(rootDirectoryPath);
			ArrayDeque<File> queue = new ArrayDeque<>();
			queue.add(rootDir);
			int counter = 0;

			while (!queue.isEmpty()) {
				File currentDir = queue.poll();
				File[] currentFiles = currentDir.listFiles();

				for (File file : currentFiles) {
					if (file.isDirectory()) {
						counter++;
						System.out.println(file.getName());
						queue.add(file);
					}
				}
			}
			System.out.printf("[%d] folders", counter);

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}