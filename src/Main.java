
public class Main {

	public static void main(String[] args) {
		// Sum square difference
		// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		System.out.println(squaresOfSums() - sumSquares());

	}
	// 1 to 100
	public static int sumSquares(){
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum = sum + (i * i);
		}
		return sum;
	}
	
	// 1 to 100 squares
	public static int squaresOfSums(){
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		return sum * sum;
	}

}
