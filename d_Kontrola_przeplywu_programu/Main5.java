
public class Main5 {

	public static void main(String[] args) {
		int resultFor = 0;
		int resultWhile = 0;
		int i;

		for (i = 1; i <= 10; i++ ) {
			resultFor += i;
		}

		i = 1;
		while (i <= 10) {
			resultWhile += i++;
		}

		System.out.println(resultFor);
		System.out.println(resultWhile);
	}

}
