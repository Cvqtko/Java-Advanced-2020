import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Exercise_10 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ArrayList<Integer> numbers = new ArrayList<>();

		int n = 100;

		for (int i = 0; i < n; i++) {
			numbers.add(i);
		}

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demo.ser"));
		
		objectOutputStream.writeObject(numbers);
		
	}
}
