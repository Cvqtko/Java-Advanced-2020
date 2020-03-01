import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayDeque<String> filesToPrint = new ArrayDeque<String>();
		
		String line = input.nextLine();
		while (!"print".equals(line)) {
			if ("cancel".equals(line)) {
				if(filesToPrint.size()<=0) {
					System.out.println("Printer is on standby");
				}else {
					System.out.println("Canceled " + filesToPrint.poll());
				}
			}else {
				filesToPrint.addLast(line);
			}

				line = input.nextLine();
		}
		for(String file:filesToPrint) {
			System.out.println(file);
		}
	}
}
