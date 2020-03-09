import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Exercise_06 {
	public static void main(String[] args) throws IOException {
		String wordsFile = "words.txt";
		String searchText = "text.txt";

		BufferedReader reader = Files.newBufferedReader(Paths.get(wordsFile));

		String[] uniqueWords = reader.readLine().split("\\s+");

		reader = Files.newBufferedReader(Paths.get(searchText));

		String text = "";
		String line = reader.readLine();

		while (line != null) {
			text += line;
			line = reader.readLine();
		}
		List<String> list = Arrays.asList(text.split("\\s+"));

		TreeMap<Integer, String> sortedDesending = new TreeMap<>(Collections.reverseOrder());

		for (String word : uniqueWords) {
			sortedDesending.put(Collections.frequency(list, word), word);
		}

		for (Entry<Integer, String> entry : sortedDesending.entrySet()) {
			System.out.println(entry.getValue() + " - " + entry.getKey());
		}
	}
}
