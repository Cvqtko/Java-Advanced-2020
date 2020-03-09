import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) throws FileNotFoundException {
		String pathOne = "inputOne.txt";
		String pathTwo = "inputTwo.txt";

		Scanner scanner = new Scanner(new File(pathOne));

		PrintWriter writer = new PrintWriter("MergeOutput.txt");
		writeToFile(scanner, writer);
		scanner = new Scanner(new File(pathTwo));
		writeToFile(scanner, writer);
		writer.close();
	}

	private static void writeToFile(Scanner scanner, PrintWriter writer) {
		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			System.out.println(line);
			writer.append(line).append(System.lineSeparator());
		}
	}

}
