import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		Map<String, LinkedHashMap<String, String>> shops = new TreeMap<>();
		while (!"Revision".equals(line)) {
			String[] tokens = line.split(", ");
			String shop = tokens[0];
			String product = tokens[1];
			String prise = tokens[2];

			if (!shops.containsKey(shop)) {
				LinkedHashMap<String, String> products = new LinkedHashMap<String, String>();
				products.put(product, prise);

				shops.put(shop, products);
			} else {
				LinkedHashMap<String, String> products = shops.get(shop);
				products.put(product, prise);
				shops.put(shop, products);
			}
			line = scanner.nextLine();
		}
		printShops(shops);
	}

	private static void printShops(Map<String, LinkedHashMap<String, String>> shops) {

		for (Entry<String, LinkedHashMap<String, String>> shop : shops.entrySet()) {
			System.out.println(shop.getKey() + " -> ");
			LinkedHashMap<String, String> products = shop.getValue();
			for (Entry<String, String> product : products.entrySet()) {
				System.out.printf("Product: %s, Price: %s\n", product.getKey(), product.getValue());
			}
		}

	}
}
