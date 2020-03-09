import java.io.File;
import java.util.ArrayDeque;

public class Exercise_08 {
	public static void main(String[] args) {
		File dir = new File("Exercises Resources");

		ArrayDeque<File> stack = new ArrayDeque<>();
		int dirSize = 0;
		stack.push(dir);

		while (!stack.isEmpty()) {
			File currentDir = stack.pop();

			File[] files = currentDir.listFiles();

			for (File file : files) {
				if (file.isDirectory()) {
					stack.push(file);
				}else {
					dirSize+=file.length();
				}
			}

		}
		System.out.println("Folder size: " + dirSize);
	}
}
