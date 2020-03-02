
public class Exercise_02 {

	public static void main(String[] args) {
		
		int[][] matrix = Exercise_01.readMatrix();
		int searchedNumber = Integer.parseInt(Exercise_01.scanner.nextLine());
		
		boolean isFound = false;
		
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				if(matrix[row][col] == searchedNumber) {
					System.out.println(row + " " + col);
					isFound = true;
				}
			}
		}
		if(!isFound) {
			System.out.println("not found");
		}
		
	}

}
