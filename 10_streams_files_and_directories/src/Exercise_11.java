import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Exercise_11 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Course courseOutput = new Course("Java Advanced", 23);
		
		String file = "course.ser";

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

		out.writeObject(courseOutput);
		
		out.close(); 
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(file)); 
		
		Course courseInput = (Course)in.readObject();
		
		System.out.printf("Course name - %s\nStudents attending - %d",courseInput.getName(),courseInput.getNumOfStudents());
	}
}
