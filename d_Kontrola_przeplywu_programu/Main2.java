
public class Main2 {

	public static void main(String[] args) {
		int nr1 = 7;
		int nr2 = 3;
		int	nr3 = 6;

		if (nr1 > nr2 && nr1 > nr3) {
			System.out.println("Z liczb " + nr1 + ", " + nr2 + " oraz " + nr3 + " największa jest liczba " + nr1);
		} else if (nr2 > nr1 && nr2 > nr3) {
			System.out.println("Z liczb " + nr1 + ", " + nr2 + " oraz " + nr3 + " największa jest liczba " + nr2);
		} else {
			System.out.println("Z liczb " + nr1 + ", " + nr2 + " oraz " + nr3 + " największa jest liczba " + nr3);
		}
	}

}
