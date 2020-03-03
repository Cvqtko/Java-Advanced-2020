import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int counter = Integer.parseInt(scanner.nextLine());
		Map<String, ArrayList<Double>> students = new TreeMap<>();

		while (counter-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			String studentName = tokens[0];
			double grade = Double.parseDouble(tokens[1]);

			if (!students.containsKey(studentName)) {
				ArrayList<Double> grades = new ArrayList<>();
				grades.add(grade);
				students.put(studentName, grades);
			} else {
				ArrayList<Double> grades = students.get(studentName);
				grades.add(grade);
				students.put(studentName, grades);
			}

		}
		for (Map.Entry<String, ArrayList<Double>> student : students.entrySet()) {
			System.out.printf(student.getKey() + " -> ");
			double average = 0;
			for (Double studentGrades : student.getValue()) {
				average += studentGrades;
				System.out.print(studentGrades + " ");
			}
			System.out.printf("(avg: %.2f)\n", average / student.getValue().size());

		}
	}
}
