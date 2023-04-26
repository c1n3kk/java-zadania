

public class Main6 {

	public static void main(String[] args) {
		int n = 10;
		int i;
		String oddOrEven;

		for (i = 1; i <= n; i++) {
			oddOrEven = (i % 2 == 0 ? "parzysta" : "nieparzysta");
			System.out.println(i + " - " + oddOrEven);
		}

		i = 1;
		while (i <= n) {
			oddOrEven = (i % 2 == 0 ? "parzysta" : "nieparzysta");
			System.out.println(i + " - " + oddOrEven);
			i++;
		}
	}

}
