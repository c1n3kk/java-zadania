
public class Main2 {

	public static void main(String[] args) {
		long nr1 = -9223372036854775808L;
		long nr2 = 9223372036854775807L;
		long result = 0L;
		result = nr1 + nr2; // = -1
		System.out.println(result);
	}

}
