import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = Integer.parseInt(scanner.nextLine());
		Map<String, LinkedHashMap<String, ArrayList<String>>> continents = new LinkedHashMap<>();
		while (counter-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			String continent = tokens[0];
			String country = tokens[1];
			String city = tokens[2];

			if (!continents.containsKey(continent)) {
				continents.put(continent, new LinkedHashMap<>() {
					{
						put(country, new ArrayList<>() {
							{
								add(city);
							}
						});
					}
				});
			} else {
				if (!continents.get(continent).containsKey(country)) {
					continents.get(continent).put(country, new ArrayList<>() {
						{
							add(city);
						}
					});
				} else {
					continents.get(continent).get(country).add(city);
				}
			}

		}
		printContinents(continents);
	}

	private static void printContinents(Map<String, LinkedHashMap<String, ArrayList<String>>> continents) {
		for (Entry<String, LinkedHashMap<String, ArrayList<String>>> continent : continents.entrySet()) {
			System.out.println(continent.getKey() + ":");
			LinkedHashMap<String, ArrayList<String>> countries = continent.getValue();
			for (Entry<String, ArrayList<String>> country : countries.entrySet()) {
				System.out.print("  " + country.getKey() + " -> ");
				ArrayList<String> cities = country.getValue();
				String citiesJoined = cities.stream().collect(Collectors.joining(", "));
				System.out.print(citiesJoined + "\n");
			}
		}

	}
}
