import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise_04 {
	public static void main(String[] args) {

		String path = "input.txt";
		Set<Character> punctuation = new HashSet<>(Arrays.asList(',', '.', '!', '?'));
		Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
			int oneByte = reader.read();
			int vowelsCounter = 0;
			int consonantsCounter = 0;
			int punctuationCounter = 0;

			while (oneByte >= 0) {
				if (punctuation.contains((char) oneByte)) {
					punctuationCounter++;
				} else if (vowels.contains((char) oneByte)) {
					vowelsCounter++;
				} else if ((char) oneByte != ' ' && !Character.isUpperCase((char)oneByte)) {
					System.out.print((char)oneByte);
					consonantsCounter++;
				}
				oneByte = reader.read();
			}

			System.out.printf("Vowels: %d\r\n" + "Consonants: %d\r\n" + "Punctuation: %d\r\n", vowelsCounter,
					consonantsCounter, punctuationCounter);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
